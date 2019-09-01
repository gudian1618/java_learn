package com.github.gudian1618.day0502;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/1 10:36 上午
 */

public class Test1 {

    public static void main(String[] args) {

        char[] a = {'a', 'b', 'c'};
        // 新分配内存
        String s1 = new String(a);
        // 常量池新建实例
        String s2 = "abc";
        // 访问常量池中已存在的对象
        String s3 = "abc";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        // String中重写了equals方法
        // 执行String中重写的equals()方法
        // 比较字符内容，而不是内存地址
        System.out.println(s1.equals(s2));

    }
}
