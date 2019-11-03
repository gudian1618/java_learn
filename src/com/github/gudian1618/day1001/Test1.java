package com.github.gudian1618.day1001;

import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/11/3 9:46 上午
 */

public class Test1 {

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println("输入类名:");
        String s = new Scanner(System.in).nextLine();

        Class<?> c = Class.forName(s);

        System.out.println("----包名|类名------");
        f1(c);

    }

    private static void f1(Class<?> c) {
        System.out.println(c.getPackageName());
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());

    }

}
