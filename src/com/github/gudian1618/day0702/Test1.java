package com.github.gudian1618.day0702;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/22 10:06 上午
 */

public class Test1 {

    public static void main(String[] args) {
        /*
         * 能被2，3，5整除，且一直运算到不能2，3，5整除为止
         * 求第n个丑数
         * 输入求解
         * */

        System.out.println("求第几个丑数：");
        int n = new Scanner(System.in).nextInt();
        long r = f(n);
        System.out.println(r);
    }

    private static long f(int n) {
        /*
         * 准备三个集合
         * 8 10
         * --------------------
         * 9 12 15
         * --------------------
         * 10 15 20 25 30
         * --------------------
         * 1 2 3 4 5 6 。。。。。。
         *
         * r中保存最终值
         *
         * 1、从头部移除最小值
         * 2、最小值分别乘2，3，5，放入集合尾部
         * 3、循环此过程
         *
         * */

        if (n == 1) {
            return 1;
        }
        LinkedList<Long> list2 = new LinkedList<>();
        LinkedList<Long> list3 = new LinkedList<>();
        LinkedList<Long> list5 = new LinkedList<>();
        list2.add(2L);
        list3.add(3L);
        list5.add(5L);
        // 从第二个丑数开始求解，直到第n个丑数
        long r = 0;
        for (int i = 2; i < n; i++) {
            // 移除最小值
            Long a = list2.getFirst();
            Long b = list3.getFirst();
            Long c = list5.getFirst();
            r = Math.min(a, Math.min(b, c));
            if (r == a) {
                list2.removeFirst();
            }

            if (r == b) {
                list3.removeFirst();
            }
            if (r == c) {
                list5.removeFirst();
            }
            // 乘以相应值
            list2.addLast(r * 2);
            list3.addLast(r * 3);
            list5.addLast(r * 5);
        }
        return r;
    }
}
