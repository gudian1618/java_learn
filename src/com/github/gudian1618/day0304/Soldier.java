package com.github.gudian1618.day0304;

import java.util.Random;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019-08-18 15:39
 * 封装
 * 把士兵相关的属性数据木盒逻辑运算方法
 * 风很脏城一个“类”组件
 */

public class Soldier {

    /**
     * 成员变量
     * 添加类
     * */
    private int id;
    private int blood = 100;

    public void go() {
//        id访问的是当前实例的id
//        前面省略了this.id
//        this就表示当前实例
        System.out.println(id + "号士兵前进");
    }


    public void attack() {
        if (blood == 0) {
            System.out.println("这是" + id + "号士兵的尸体");
            return;
        }
        System.out.println(id + "号士兵进攻");
//        模拟士兵受到伤害，血量减少
//        随机的减少值
        int d = new Random().nextInt(10);
//        blood血量，减掉d
        blood -= d;
//        不允许负输血量
        if (blood < 0) {
            blood = 0;
        }
        System.out.println("血量：" + blood);
        if (blood == 0) {
            System.out.println(id + "号士兵阵亡");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
}
