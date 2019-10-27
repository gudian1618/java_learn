package com.github.gudian1618.day0901;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/27 10:21 上午
 */

public class Producer extends Thread {

    private LinkedList<Character> list;

    public Producer(LinkedList<Character> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            char c = (char) ('a' + new Random().nextInt(26));

            synchronized (list) {
                list.add(c);
                System.out.println("<<" + c);
                list.notifyAll();
            }
        }
    }
}
