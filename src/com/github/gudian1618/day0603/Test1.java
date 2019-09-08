package com.github.gudian1618.day0603;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/8 11:33 上午
 */

public class Test1 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("===============");
        B b = new B();
    }
}

class A {
    int v1 = 1;
    static int v2 = 2;
    static {
        System.out.println("A静态块");
    }
    A() {
        System.out.println("A的构造方法");
    }
}

class B extends A {
    int v3 = 3;
    static int v4 = 4;
    static {
        System.out.println("B静态块");
    }
    B() {
        System.out.println("B的构造方法");
    }
}