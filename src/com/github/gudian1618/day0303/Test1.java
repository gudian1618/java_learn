package com.github.gudian1618.day0303;

import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019-08-18 15:03
 */

public class Test1 {

    public static void main(String[] args) {
        System.out.println("输入整数，求阶乘：");
        int n = new Scanner(System.in).nextInt();
        long r = f(n);
        System.out.println(r);
    }

    private static long f(int n) {
//        阶乘的最简问题，要考虑初始值和边界条件，以及特殊情况，特别是注意数据越界
//        注意每次递归和循环本质不一样，内存的运行机制不一样
//        每次递归在栈内存空间会分配递归调用的方法，占用相应的栈内存空间
//        如果递归深度太大，会导致栈内存溢出。
//        循环是一个方法，调用在堆内存中生成对象数据，并不会消耗多余的栈内存。
        if (n==0) {
            return 1;
        }
        return n * f(n - 1);
    }
}


