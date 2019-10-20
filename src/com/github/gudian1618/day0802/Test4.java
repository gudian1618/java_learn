package com.github.gudian1618.day0802;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/20 3:09 下午
 */

public class Test4 {

    public static void main(String[] args) throws InterruptedException {
        // 求1000万内的质数数量,从2开始...
        System.out.println("========单线程==========");
        f1();
        System.out.println("========5个线程=========");
        f2();

    }

    private static void f1() throws InterruptedException {
        long t = System.currentTimeMillis();

        // 单线程
        T1 t1 = new T1(0, 10000000);
        t1.start();

        //main线程暂停,等待t1线程计算结束再继续执行读取结果
        t1.join();
        int n = t1.count;

        t = System.currentTimeMillis() - t;
        System.out.println("时间:" + t);
        System.out.println("质数:" + n);
    }

    private static void f2() throws InterruptedException {
        long t = System.currentTimeMillis();

        // 5个线程处理
        T1[] a = new T1[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = new T1(i * 2000000, (i + 1) * 2000000);
            a[i].start();
        }

        int n = 0;
        for (T1 t1 : a) {
            // 等待t1结束后在获得计算结果
            t1.join();
            n += t1.count;
        }

        t = System.currentTimeMillis() - t;
        System.out.println("时间:" + t);
        System.out.println("质数:" + n);
    }

    static class T1 extends Thread {
        int from;
        int to;
        int count;

        public T1(int from, int to) {
            if (from <= 2) {
                from = 3;
                // 有一个已知的质数2,不用多余的判断
                count = 1;
            }
            this.from = from;
            this.to = to;
        }

        @Override
        public void run() {
            // [from, to)找质数
            for (int i = from; i < to; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
        }

        private boolean isPrime(int i) {
            // 折半加1
            double m = 1 + Math.sqrt(i);
            for (int j = 2; j < m; j++) {
                if (i % j == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
