package com.github.gudian1618.day0605;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/8 3:05 下午
 */

public class Test1 {

    public static void main(String[] args) {

        A.Inner1 i1 = new A.Inner1();
        System.out.println(i1);

        A a = new A();
        A.Inner2 i2 = a.new Inner2();
        System.out.println(i2);
    }
}

class A {

    static class Inner1 {

    }

    class Inner2 {

    }
}
