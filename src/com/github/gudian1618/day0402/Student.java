package com.github.gudian1618.day0402;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/8/25 10:26 上午
 */

public class Student extends Person {

    /**
     * 从父类继承了：name,gender,age,toString()
     * 不继承：构造方法
     */
    String school = null;

    public Student() {

    }

    public Student(String name, String gender, int age, String school) {

        super(name, gender, age);
        this.school = school;
        System.out.println("Students全参");
    }

    /**
     * 方法重写：
     * 从父类继承的toString()方法
     * 在子类中重新定义，重新编写
     */

    @Override
    public String toString() {
//        return name + "," + gender + "," + age + "," + school;
        // 调用父类方法的代码
        // 目的是减少重复的代码，提高效率
        return super.toString() + "," + school;
    }
}
