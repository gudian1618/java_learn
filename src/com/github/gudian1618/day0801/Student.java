package com.github.gudian1618.day0801;

import java.io.Serializable;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/20 11:20 上午
 * serializable空接口,标识接口,标识一个类,允许被序列化
 */

public class Student implements Serializable {

    private static final long serialVersionUID = -8813473366352024680L;

    private  int id;
    private String name;
    private String gender;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", gender='" + gender + '\'' +
            ", age=" + age +
            '}';
    }

    public Student() {
    }

    public Student(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

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
