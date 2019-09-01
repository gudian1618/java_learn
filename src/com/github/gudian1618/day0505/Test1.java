package com.github.gudian1618.day0505;

import java.math.BigDecimal;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/1 2:13 下午
 */

public class Test1 {

    public static void main(String[] args) {
        // 新建实例
        Integer a = new Integer(6);
        // 缓存数组中的实例
        Integer b = Integer.valueOf(6);
        // 缓存数组中的实例
        Integer c = Integer.valueOf(6);

        // 地址不同
        System.out.println(a == b);
        // 地址相同
        System.out.println(b == c);
        // 调用equals(),从Integer放到Object查找
        // Integer重写了equals()
        // 这里执行Integer中的equals()）
        System.out.println(a.equals(b));

        System.out.println(Integer.parseInt("255"));
        System.out.println(Integer.parseInt("11011101", 2));
        System.out.println(Integer.parseInt("ee", 16));
        System.out.println(Integer.toBinaryString(254));
        System.out.println(Integer.toOctalString(234));
        System.out.println(Integer.toHexString(248));

    }

}
