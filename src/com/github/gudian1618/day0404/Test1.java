package com.github.gudian1618.day0404;

import java.util.Random;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/8/25 3:12 下午
 */

public class Test1 {

    public static void main(String[] args) {
        System.out.println("按回车执行");
        while (true) {
            new Scanner(System.in).nextLine();
            int r = new Random().nextInt(4);
            switch (r) {
                case 0: f(new Shape());break;
                case 1: f(new Line());break;
                case 2: f(new Circle());break;
                case 3: f(new Square());break;
                default:
            }
        }
    }

    private static void f(Shape shape) {
        shape.deaw();
        // 向上转型后，不能调用子类中的特殊成员
        // 只能调用父类中定义的通用成员

        // 向下转型，注意强制类型转换
        Line line = (Line) shape;
        line.length();

        // shape.length();
        new Scanner(System.in).nextLine();
        shape.clear();
        System.out.println("==========================");
    }
}
