package com.github.gudian1618.day0901;

import java.util.LinkedList;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/27 10:35 上午
 */

public class Test2 {

    public static void main(String[] args) {

        LinkedList<Character> list = new LinkedList<>();

        Producer p = new Producer(list);
        Consumer c = new Consumer(list);
        p.start();
        c.start();

        // main线程模拟不添加数据,直接发通知
        while (true) {
            synchronized (list) {
                list.notifyAll();
            }
        }

    }
}
