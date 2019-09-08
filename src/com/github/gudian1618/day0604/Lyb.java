package com.github.gudian1618.day0604;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/8 1:44 下午
 */

public class Lyb implements Weapon {

    @Override
    public void kill() {
        System.out.println("投掷核武器");
    }

    @Override
    public String getName() {
        return "热核炸弹";
    }

    @Override
    public int getType() {
        return Weapon.TYPE_NUCLEAR;
    }
}
