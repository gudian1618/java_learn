package com.github.gudian1618.day1001;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/11/3 9:46 上午
 */

public class Test1 {

    public static void main(String[] args) throws Exception {

        System.out.println("输入类名:");
        String s = new Scanner(System.in).nextLine();

        Class<?> c = Class.forName(s);

        System.out.println("----包名|类名------");
        f1(c);
        System.out.println("----成员变量-------");
        f2(c);
        System.out.println("----构造方法-------");
        f3(c);
        System.out.println("----方法----------");
        f4(c);
    }

    private static void f4(Class<?> c) {
        /*
         * Method封装一个方法的定义信息,比构造方法多了一个返回类型的信息获取
         * */

        Method[] a = c.getDeclaredMethods();
        for (Method t : a) {
            // 修饰符
            String m = Modifier.toString(t.getModifiers());
            // 返回类型
            String r = t.getReturnType().getSimpleName();
            // 方法名
            String n = t.getName();
            // 参数类型列表
            Class<?>[] p = t.getParameterTypes();
            // 异常类型列表
            Class<?>[] e = t.getExceptionTypes();
            System.out.print(m + " ");
            System.out.print(r + " ");
            System.out.print(n);
            System.out.print("(" + Arrays.toString(p) + ")");
            System.out.println("throws" + Arrays.toString(e));
        }
    }

    private static void f3(Class<?> c) {
        /*
         * Constructor封装构造方法的定义信息
         *
         * */

        Constructor<?>[] a = c.getDeclaredConstructors();
        for (Constructor<?> t : a) {
            // 修饰符
            String m = Modifier.toString(t.getModifiers());
            // 构造方法名就是类名
            String n = c.getSimpleName();
            // 参数类型列表
            Class<?>[] p = t.getParameterTypes();
            // 异常列表
            Class<?>[] e = t.getExceptionTypes();

            System.out.print(m + "");
            System.out.print(n);
            System.out.println("(" + Arrays.toString(p) + ")");
            System.out.println("throws" + Arrays.toString(e));
        }

    }

    private static void f2(Class<?> c) {
        /*
         * Field 用来封装一个变量的定义信息
         * */

        Field[] a = c.getDeclaredFields();
        for (Field f : a) {
            // 修饰符
            String s = Modifier.toString(f.getModifiers());
            // 类名
            String m = f.getType().getSimpleName();
            // 变量名
            String w = f.getName();
            System.out.print(s + " ");
            System.out.print(m + " ");
            System.out.println(w);
        }

    }

    private static void f1(Class<?> c) {
        System.out.println(c.getPackageName());
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
    }
}
