package com.github.gudian1618.day0703;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/22 11:07 上午
 */

public class Test2 {

    public static void main(String[] args) {
        /*
        * "abacbccdcc"
        *  i
        * 遍历字符串中每个字符的值
        * key value
        * a
        * b
        * c
        * d
        * */

        System.out.println("输入一段字符串：");
        String s = new Scanner(System.in).nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 取出计数，有计数值可以得到计数值
            // 没有计数值，得到null值
            // 为了支持null值，必须用包装类型
            Integer count = map.get(c);
            if (count == null) {
                // 如果没有计数值
                // 那么这个字符串是第一个
                map.put(c, 1);
            } else {
                // 计数加一在放进去，覆盖之前的计数值
                map.put(c, count + 1);
            }
        }
        System.out.println(map);
    }
}
