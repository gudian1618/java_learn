package com.github.gudian1618.day0401;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/8/25 10:01 上午
 */

public class Test1 {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("BMW");
        Car c3 = new Car("BMW", "红色", 120);

        c1.go();
        c1.stop();
        c2.go();
        c2.stop();
        c3.go();
        c3.stop();


    }
}
