package com.github.gudian1618.day0403;

import java.util.Random;
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
        System.out.println("选择：->");
        int c = new Scanner(System.in).nextInt();

        System.out.println("给宠物起名字：");
        String n = new Scanner(System.in).nextLine();

        if (c == 1) {
            Cat cat = new Cat(n);
            f(cat);
        } else if (c == 2) {
            Dog dog = new Dog(n, 20, 90);
            f(dog);
        } else {
            System.out.println("输入错误数值！");
        }
    }

    private static void f(Cat cat) {
        System.out.println("按回车执行");
        while (true) {
            new Scanner(System.in).nextLine();
            int r = new Random().nextInt(3);
            switch (r) {
                case 0:
                    cat.feed();
                    break;
                case 1:
                    cat.play();
                    break;
                case 2:
                    cat.punsih();
                    break;
                default:
            }
        }
    }

    private static void f(Dog dog) {
        while (true) {
            new Scanner(System.in).nextLine();
            int r = new Random().nextInt(3);
            switch (r) {
                case 0:
                    dog.feed();
                    break;
                case 1:
                    dog.play();
                    break;
                case 2:
                    dog.punsih();
                    break;
                default:
            }
        }
    }

}
