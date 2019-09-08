package com.github.gudian1618.day0604;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/8 1:43 下午
 */

public class Sword implements Weapon {

    @Override
    public void kill() {
        System.out.println("耍剑");
    }

    @Override
    public String getName() {
        return "倚天剑";
    }

    @Override
    public int getType() {
        return Weapon.TYPE_COLD;
    }
}
