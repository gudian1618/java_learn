package com.github.gudian1618.day0704;

import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/22 11:52 上午
 */

public class Test1 {

    public static void main(String[] args) {
        while (true) {
            try {
                f1();
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("请输入两个整数");
            } catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println("不能除0");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("出错，请重试");
            } finally {
                System.out.println("==============");
            }
        }
    }

    private static void f1() {
        System.out.println("输入逗号隔开的两个整数：");
        String s = new Scanner(System.in).nextLine();
        String[] a = s.split(",");
        int n1 = Integer.parseInt(a[0]);
        int n2 = Integer.parseInt(a[1]);
        int r = n1 / n2;
        System.out.println(r);
        /*
         * 234 | advb,das | 4234,0 | 4123,342
         * */
    }
}
