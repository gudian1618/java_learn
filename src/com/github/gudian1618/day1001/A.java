package com.github.gudian1618.day1001;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/11/3 11:24 上午
 */

public class A {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void A() {
        System.out.println("A.a()");
    }

    @Override
    public String toString() {
        return "A{" +
            "title='" + title + '\'' +
            '}';
    }

    @Test(id = 1, title = "测试")
    public void test1() {
        System.out.println("test1()");
    }

    @Test(id = 2)
    public void test2() {
        System.out.println("test2()");
    }

    public void test3() {
        System.out.println("test3()");
    }

    @Test(value = "测试4")
    public void test4() {
        System.out.println("test4()");
    }

}
