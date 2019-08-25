package com.github.gudian1618.day0402;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/8/25 11:39 上午
 */

public class Test2 {

    public static void main(String[] args) {
        // 新建两个学生实例，分别调用无参和全参构造
        // 不管调用哪个构造方法，都要先执行父类的构造方法
        // 默认都执行无参构造

        // 先执行父类的无参构造，再执行子类的无参
        new Student();
        System.out.println("=====================");
        // 先执行父类的无参构造，再执行子类的全参
        new Student("a", "b", 1, "c");
    }
}
