package com.github.gudian1618.day0802;

import java.util.Arrays;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/20 3:47 下午
 */

public class Test5 {

    static char[] a = {'*', '*', '*', '*', '*'};
    static char c = '-';

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (a) {
                        for (int i = 0; i < a.length; i++) {
                            a[i] = c;
                        }
                    }
                    c = (c == '-'?'*':'-');
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (a) {
                        System.out.println(Arrays.toString(a));
                        ;
                    }
                }
            }
        };
        t1.start();
        t2.start();

    }
}
