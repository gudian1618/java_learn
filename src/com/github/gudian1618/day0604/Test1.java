package com.github.gudian1618.day0604;

import java.util.Random;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/8 1:40 下午
 */

public class Test1 {

    public static void main(String[] args) {
        Transformer t = new Transformer();
        Sword s = new Sword();
        AK47 a = new AK47();
        Lyb l = new Lyb();

        System.out.println("按回车执行");

        while (true) {
            new Scanner(System.in).nextLine();
            int r = new Random().nextInt(4);
            switch (r) {
                case 0:
                    t.setWeapon(s);
                    break;
                case 1:
                    t.setWeapon(a);
                    break;
                case 2:
                    t.setWeapon(l);
                    break;
                case 3:
                    t.setWeapon(null);
                    break;
                default:
            }
            t.attack();
        }
    }
}
