package com.github.gudian1618.day0504;

import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/1 1:37 下午
 */

public class Test1 {

    public static void main(String[] args) {
        System.out.println("输入固定那个电话号码；");
        String s = new Scanner(System.in).nextLine();

        /*
         * 从头到尾，从外到内，逻辑框架，分而治之的写逻辑
         * 1234567
         * 12345678
         * 010-12345678
         * 0102-12345678
         * (010)1234567
         * (0102)12345678
         * \d{7,8}
         * (区号表达式)?\d{7,8}
         * (|)?\d{7,8}
         * (\d{3,4}-|)?\d{7,8}
         * (\d{3,4}-|\(\))?\d{7,8}
         * (\d{3,4}-|\(\d{3,4}\))?\d{7,8}
         *
         */
        String regex = "(\\d{3,4}-|\\(\\d{3,4}\\))?\\d{7,8}";
        // 判断字符串s能否与正则表达式相匹配
        if (s.matches(regex)) {
            System.out.println("格式匹配");
        } else {
            System.out.println("格式错误");
        }
    }

}

