package com.github.gudian1618.day0601;

import com.github.gudian1618.day0601.Soldier;

import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/8 9:56 上午
 */

public class Test1 {

    public static void main(String[] args) {

        Soldier[] a = new Soldier[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = new Soldier(i + 1);
        }
        System.out.println("按回车进行");
        // 当还有士兵
        while (Soldier.count != 0) {
            new Scanner(System.in).nextLine();
            for (int i = 0; i < a.length; i++) {
                Soldier s = a[i];
                s.attack();
            }
            System.out.println("----------士兵数量:" + Soldier.count);
        }
    }

}
