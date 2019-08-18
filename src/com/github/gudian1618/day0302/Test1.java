package com.github.gudian1618.day0302;

import java.util.Arrays;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019-08-18 11:00
 */

public class Test1 {

    public static void main(String[] args) {
        f1();
    }

    private static void f1() {
        /*
         * 数组循环打印
         * 新建数组，在存到变量a
         * */
        int[] a = new int[5];
//        把数组中的数据，链接成字符串,用Arrays.toString方法，便于对数组值的整体显示输出
        System.out.println(Arrays.toString(a));
//        遍历数组填入赋值的1到5
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
//        遍历数组，打印出赋值后的结果
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }    }
}
