package com.github.gudian1618.day0401;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/8/25 9:44 上午
 * 构造方法
 */

public class Car {
    /**
     * 属性：
     * 品牌 brand
     * 颜色 color
     * 速度 speed
     */

    String brand;
    String color;
    int speed;

    public Car() {
    }

    public Car(String brand) {
        // 同名的局部变量，就必须用this.xxx来调用成员变量
//        this.brand = brand;
        // 构造方法之间的调用，必须是首行代码
        this(brand, null, 120);
    }

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void go() {
        // 蓝色BMW汽车，时速：120
        System.out.println(color + brand + "汽车前进，时速：" + speed);
    }

    public void stop() {
        // 蓝色BMW汽车停止
        System.out.println(color + brand + "汽车停止！");
    }

}
