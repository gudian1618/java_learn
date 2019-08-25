package com.github.gudian1618.day0402;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/8/25 10:26 上午
 */

public class Employee extends Person {
    double salary = 0;

    @Override
    public String toString() {
        return name + "," + gender + "," + age + "," + salary;
    }
}
