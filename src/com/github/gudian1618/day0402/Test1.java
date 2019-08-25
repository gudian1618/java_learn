package com.github.gudian1618.day0402;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/8/25 10:26 上午
 */

public class Test1 {
    public static void main(String[] args) {

        Person p = new Person("张三", "男", 12);
        Student s = new Student();
        Employee e = new Employee();

        s.name = "李四";
        s.gender = "女";
        s.age = 22;
        s.school = "Tarena";

        e.name = "王五";
        e.gender = "男";
        e.age = 25;
        e.salary = 9000;
        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());
        
    }
}
