package com.github.gudian1618.day0302;

import java.util.Arrays;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019-08-18 11:20
 * <p>
 * 双色球
 * 红球 33 选 6
 * 篮球 16 选 1
 * <p>
 * 红球号码数组
 * 【1，2，3，...，33】
 * 篮球号码数组
 * 【1，2，3,....,16】
 */

public class Test2 {

    public static void main(String[] args) {
//        准备红球号码数组和篮球号码数组
        int[] r = zhunbei(33);
        int[] b = zhunbei(16);
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(b));


    }

    private static int[] zhunbei(int n) {
//        创建n个长度的int[]数组，存放n个号码
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        return a;
//        把数组的地址值返回到调用位置
    }
}



