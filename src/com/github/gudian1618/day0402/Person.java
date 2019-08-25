package com.github.gudian1618.day0402;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/8/25 10:25 上午
 * 人这个类的构建
 */

public class Person {


    String name;
    String gender;
    int age;

    public Person() {
    }

    public Person(String name, String gender) {
        this(name, gender, 0);
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "," + gender + "," + age;
    }
}
