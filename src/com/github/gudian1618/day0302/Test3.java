package com.github.gudian1618.day0302;

import java.util.Arrays;
import java.util.Random;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019-08-18 13:36
 */

public class Test3 {

    public static void main(String[] args) {
//        首先随机产生一个乱序数组
        int[] a = suiji();
        System.out.println(Arrays.toString(a));
        System.out.println("=====================");
//        对数组a排序
        sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("=====================");

    }

    private static int[] suiji() {
//        随机整数值，[5，11)，来作为数组的长度值
        int n = 5 + new Random().nextInt(6);
//        新建一个n长度的int[]数组
        int[] a = new int[n];
//        遍历数组，填入100内的随机值
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(100);
        }
        return a;
    }

    private static void sort(int[] a) {
        /*
         * 冒泡排序算法
         * 通过两个下标循环控制
         * i从头到尾递增，j从尾到头递减
         * j循环开始之前，交换标记flag = false
         * j执行过程中，交换了数据，交换标记flag = true
         * j执行过程中，没有交换数据，flag一直保持false
         * if(！flag/flag == false) {}
         * */
//        i循环从头到尾递增

        boolean flag = false;

        for (int i = 0; i < a.length; i++) {
//            j循环从后往前递减
//            j循环的作用，把最小值换到i的位置
            for (int j = a.length - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
//                    第一种交换，需要第三个变量，效率低，但是任意变量类型
//                    int t = a[j];
//                    a[j] = a[j - 1];
//                    a[j - 1] = t;
//                    第二种方法交换，无需第三方变量，效率较高，但是计算类型范围小
                    a[j] = a[j] + a[j - 1];
                    a[j - 1] = a[j] - a[j - 1];
                    a[j] = a[j] - a[j - 1];
                    flag = true;
                }
            } // j结束
            if (!flag) {
                break;
            }
            System.out.println(Arrays.toString(a));
        }

    }
}


