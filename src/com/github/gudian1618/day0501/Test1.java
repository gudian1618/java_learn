package com.github.gudian1618.day0501;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/1 10:07 上午
 */

public class Test1 {

    public static void main(String[] args) {
        Point a = new Point(3, 4);
        Point b = new Point(3, 4);

        // 会调用a.toString()获得字符串再打印
        // 执行a.toString()，现在Point中招toString()
        // 找不到，在父类Object中找toString()）
        System.out.println(a);
        System.out.println(b.toString());

        // 先在Point中找equals()方法
        // 找不到，再去父类中找
        System.out.println(a == b);
        // ==比较的还是地址
        System.out.println(a.equals(b));
    }

}
