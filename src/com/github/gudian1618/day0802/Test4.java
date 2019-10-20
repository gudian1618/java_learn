package com.github.gudian1618.day0802;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/20 3:09 下午
 */

public class Test4 {

    public static void main(String[] args) {
        // 求1000万内的质数数量,从2开始...
        System.out.println("========单线程==========");
        f1();
        System.out.println("========5个线程=========");
        f2();

    }

    private static void f1() {
        long t = System.currentTimeMillis();
        t = System.currentTimeMillis() - t;
        System.out.println("时间:" + t);
    }

    private static void f2() {
        long t = System.currentTimeMillis();
        t = System.currentTimeMillis() - t;
        System.out.println("时间:" + t);
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
