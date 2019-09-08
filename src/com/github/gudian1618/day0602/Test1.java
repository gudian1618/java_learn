package com.github.gudian1618.day0602;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/8 11:04 上午
 */

public class Test1 {

    public static void main(String[] args) {
        Student s = new Student();
        // s.id = 6;是私有变量，不能直接访问
        s.setId(6);
        s.setName("张三");
        s.setGender("男");
        s.setAge(12);

        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getGender());
        System.out.println(s.getAge());
    }
}
