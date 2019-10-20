package com.github.gudian1618.day0802;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/20 1:51 下午
 * 继承Thread类实现多线程运行
 */

public class Test1 {

    public static void main(String[] args) {

        // 创建想爱你城实例
        T1 t1 = new T1();
        T1 t2 = new T1();

        // 启动线程,会自动执行重写继承后的run()方法
        t1.start();
        t2.start();
    }

    static class T1 extends Thread {
        @Override
        public void run() {
            // 获取线程名
            String n = getName();
            // 打印信息
            int a = 1000;
            for (int i = 0; i < a; i++) {
                System.out.println(n + " - " + i);
            }
        }
    }

}
