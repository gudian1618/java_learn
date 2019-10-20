package com.github.gudian1618.day0802;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/20 2:13 下午
 * 实现Runnable接口的线程
 */

public class Test2 {

    public static void main(String[] args) {

        R1 r1 = new R1();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
    }

    static class R1 implements Runnable {

        @Override
        public void run() {
            // 获取正在执行代码的线程实例
            Thread t = Thread.currentThread();
            // 获取线程名
            String n = t.getName();
            // 打印输出
            int a = 10;
            for (int i = 0; i < a; i++) {
                System.out.println(n + " - " + i);
            }

        }
    }

}
