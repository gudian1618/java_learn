package com.github.gudian1618.day0802;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/20 2:25 下午
 */

public class Test3 {

    public static void main(String[] args) {

        T1 t1 = new T1();
        t1.start();

        // 匿名内部类,继承Thread子类
        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("按回车打断t1线程");
                new Scanner(System.in).nextLine();
                t1.interrupt();
            }
        };
        // 启动之前,设置成后台线程,虚拟机在前台线程结束后,自动关闭,相应的后台线程即使无响应也结束退出
        t2.setDaemon(true);
        t2.start();

    }

    static class T1 extends Thread {
        @Override
        public void run() {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            int a = 10;
            for (int i = 0; i < a; i++) {
                String s = sdf.format(new Date());
                System.out.println(s);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
