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

    }

    static class R1 implements Runnable {
        static int i;

        public void add() {
            i++;
            i++;
        }

        public int get() {
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
