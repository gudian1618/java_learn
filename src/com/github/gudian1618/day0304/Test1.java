package com.github.gudian1618.day0304;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019-08-18 15:38
 * 具体地测试士兵类
 */

public class Test1 {

    public static void main(String[] args) {
//        新建一个士兵实例
//        把它的内存地址，存到变量a
        Soldier a = new Soldier();
        Soldier b = new Soldier();
        a.setId(9527);
        b.setId(9528);

        a.go();
        b.go();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
        b.attack();
    }
}
