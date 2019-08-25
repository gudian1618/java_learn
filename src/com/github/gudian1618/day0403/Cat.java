package com.github.gudian1618.day0403;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/8/25 1:39 下午
 */

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int full, int happy) {
        super(name, full, happy);
    }

    @Override
    public String cry() {
        return "猫的哭叫声：喵喵喵~";
    }
}
