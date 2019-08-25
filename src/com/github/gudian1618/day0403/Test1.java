package com.github.gudian1618.day0403;

import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/8/25 1:39 下午
 */

public class Test1 {

    public static void main(String[] args) {
        System.out.println("1.猫");
        System.out.println("2.狗");
        System.out.println("1.选择：>");
        int c = new Scanner(System.in).nextInt();

        System.out.println("给宠物起名字：");
        String n = new Scanner(System.in).nextLine();

        if (c == 1) {
            Cat cat = new Cat(n);
            f(cat);
        } else {
            Dog dog = new Dog(n, 20, 90);
            f(dog);
        }
    }

    private static void f(Cat cat) {

    }

    private static void f(Dog dog) {
    }

}
