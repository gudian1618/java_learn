package com.github.gudian1618.day0402;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/8/25 10:26 上午
 */

public class Student extends Person {

    // 从父类继承了：name,gender,age,toString()
    // 不继承：构造方法
    String school = null;

    @Override
    public String toString() {
        return name + "," + gender + "," + age + "," + school;

    }
}
