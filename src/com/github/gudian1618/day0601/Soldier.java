package com.github.gudian1618.day0601;

import java.util.Random;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/8 9:56 上午
 */

public class Soldier {

    /*
     * 士兵的数量
     */
    static int count;
    int id;
    int blood = 100;

    public Soldier(int id) {
        this.id = id;
        Soldier.count++;
    }

    public void attack() {
        if (blood == 0) {
            System.out.println(id + "号士兵阵亡");
            return;
        }
        System.out.println(id + "号士兵进攻");
        int d = new Random().nextInt(9);
        blood -= d;
        if (blood < 0) {
            blood = 0;
        }
        System.out.println("血量：" + blood);
        if (blood == 0) {
            Soldier.count--;
        }
    }

}
