package com.github.gudian1618.day0301;

import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019-08-18 09:58
 */

public class Test1 {

    public static void main(String[] args) {
        f1();
    }

    private static void f1() {
        /*
         * 选择菜单
         */
//        循环命名
        outer:
        while (true) {
            System.out.println("1,选项1");
            System.out.println("2,选项2");
            System.out.println("3,选项3");
            System.out.println("4,选项4");
            System.out.println("选择：>");
            int c = new Scanner(System.in).nextInt();
            switch (c) {
                case 1:
                    System.out.println("选择了1");
                    break;
                case 2:
                    System.out.println("选择了2");
                    break;
                case 3:
                    System.out.println("选择了3");
                    break;
                case 4:
                    break outer;
                default:
            }
        }
    }
}
