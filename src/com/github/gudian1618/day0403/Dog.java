package com.github.gudian1618.day0403;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/8/25 1:39 下午
 */

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int full, int happy) {
        super(name, full, happy);
    }

    @Override
    public String cry() {
        return "狗的哭叫声：汪汪汪~";
    }
}

