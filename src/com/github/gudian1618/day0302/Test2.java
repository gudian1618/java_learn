package com.github.gudian1618.day0302;

import java.util.Arrays;
import java.util.Random;

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

//        选择红球
        int[] red = xuanRed(r);
//        选择篮球
        int blue = xuanBlue(b);
        System.out.println("红球：" + Arrays.toString(red));
        System.out.println("蓝球：" + blue);

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

    private static int[] xuanRed(int[] r) {
        /*
         * 选择6个不重复的红球
         * i变量，从0到<6，访问前6个位置
         * 随机定位下标j，范围i+[0,33-i)
         * i和j位置的值进行交换
         * 截取前六个位置复制新的数组
         * 返回新数组
         * */
        for (int i = 0; i < 6; i++) {
//            随机定位j，范围i+[0,33-i)
            int j = i + new Random().nextInt(33 - i);
//            i,j交换
            int t = r[i];
            r[i] = r[j];
            r[j] = t;
        }
        return Arrays.copyOf(r, 6);
    }

    private static int xuanBlue(int[] b) {
        return b[new Random().nextInt(16)];
    }
}



