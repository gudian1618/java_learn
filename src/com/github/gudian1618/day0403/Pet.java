package com.github.gudian1618.day0403;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/8/25 1:39 下午
 * 宠物父类构建共同属性和方法
 */

public class Pet {
    /**
     * 宠物名
     * 饱食度
     * 快乐度
     */
    String name;
    int full;
    int happy;

    public Pet() {
    }

    public Pet(String name) {
        this(name, 50, 50);
    }

    public Pet(String name, int full, int happy) {
        this.name = name;
        this.full = full;
        this.happy = happy;
    }

    public void feed() {

        if (full == 100) {
            System.out.println(name + "吃饱了");
            return;
        }

        System.out.println("给" + name + "喂食");
        full += 10;
        System.out.println("饱食度：" + full);
    }

    public void play() {

        if (full == 0) {
            System.out.println(name + "饿的玩不动了");
            return;
        }

        System.out.println("陪" + name + "玩耍");
        happy += 10;
        full -= 10;
        System.out.println("快乐度：" + happy);
        System.out.println("饱食度 :" + full);
    }

    public void punsih() {

    }

}


