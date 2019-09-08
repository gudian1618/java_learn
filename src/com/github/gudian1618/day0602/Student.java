package com.github.gudian1618.day0602;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/8 11:04 上午
 */

public class Student {

    // 成员变量，习惯定义成private
    private int id;
    private String name;
    private String gender;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
