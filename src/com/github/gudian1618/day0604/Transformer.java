package com.github.gudian1618.day0604;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/8 1:44 下午
 */

public class Transformer {
    // 变形金刚使用武器接口
    // 默认null

    private Weapon w;

    public void setWeapon(Weapon w) {
        this.w = w;
    }

    public void attack() {
        System.out.println("变形金刚进攻");
        if (w == null) {
            System.out.println("用牙咬");
        }
        // 使用冷兵器：倚天剑进攻
        String t = null;
        switch (w.getType()) {
            case Weapon.TYPE_COLD:
                t = "冷兵器";
                break;
            case Weapon.TYPE_HOT:
                t = "热兵器";
                break;
            case Weapon.TYPE_NUCLEAR:
                t = "核武器";
                break;
            default:
        }
        System.out.println("使用" + t + ":" + w.getName() + "进攻");
        w.kill();
    }
}
