package com.github.gudian1618.day0901;

import java.util.LinkedList;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/27 10:30 上午
 */

public class Consumer extends Thread {

    private LinkedList<Character> list;

    public Consumer(LinkedList<Character> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                while (list.isEmpty()) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                    }
                    continue;
                }
                Character c = list.removeFirst();
                System.out.println(">>>>" + c);
            }
        }
    }
}
