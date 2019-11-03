package com.github.gudian1618.day1001;

import java.lang.reflect.Constructor;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/11/3 11:06 上午
 */

public class Test2 {

    public static void main(String[] args) throws Exception {
        System.out.println("输入类名:");
        String s = new Scanner(System.in).nextLine();
        Class<?> c = Class.forName(s);
        System.out.println("------无参构造--------");
        f1(c);
        System.out.println("------int参数构造--------");
        f2(c);
    }

    private static void f1(Class<?> c) {
        try {
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (Exception e) {
            System.out.println("不能执行无参构造");
        }
    }

    private static void f2(Class<?> c) {
        try {
            Constructor<?> t = c.getConstructor(int.class);
            Object obj = t.newInstance(100);
            System.out.println(obj);
        } catch (Exception e) {
            System.out.println("不能执行int参数构造");
        }
    }

}
