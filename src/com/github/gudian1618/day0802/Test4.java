package com.github.gudian1618.day0802;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/20 3:09 下午
 */

public class Test4 {

    public static void main(String[] args) {
        // 求1000万内的质数数量,从2开始...


    }

    static class T1 extends Thread {
        int from;
        int to;
        int count;

        public T1(int from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public void run() {
            super.run();
        }
    }
}
