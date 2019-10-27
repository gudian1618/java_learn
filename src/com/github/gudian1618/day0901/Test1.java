package com.github.gudian1618.day0901;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/27 9:47 上午
 */

public class Test1 {

    public static void main(String[] args) {
        /*
         * 线程1 不断循环i++两句,线程2判断i%2==1,是不是奇数
         * */
        R1 r1 = new R1();
        Thread t1 = new Thread(r1);
        t1.start();

        R1 r2 = new R1();

        // main线程
        while (true) {
            int i = r2.get();
            if (i % 2 == 1) {
                System.out.println(i);
                // 退出虚拟机
                System.exit(0);
            }
        }

    }

    static class R1 implements Runnable {
        static int i;

        public static synchronized void add() {
            i++;
            i++;
        }

        public  static synchronized int get() {
            return i;
        }

        @Override
        public void run() {
            while (true) {
                add();
            }
        }
    }

}
