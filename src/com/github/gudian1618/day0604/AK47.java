package com.github.gudian1618.day0604;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/8 1:43 下午
 */

public class AK47 implements Weapon {

    @Override
    public void kill() {
        System.out.println("耍枪");
    }

    @Override
    public String getName() {
        return "AK47";
    }

    @Override
    public int getType() {
        return Weapon.TYPE_HOT;
    }
}
