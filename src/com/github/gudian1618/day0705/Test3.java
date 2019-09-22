package com.github.gudian1618.day0705;

import java.io.File;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/22 4:02 下午
 */

public class Test3 {

    public static void main(String[] args) {

        File dir = new File("/Users/zyd/IdeaProjects/java_learn/src/com/github/gudian1618/day0704");
        String[] names = dir.list();
        File[] files = dir.listFiles();
        if (names == null) {
            System.out.println("不等你获得列表");
            return;
        }
        for (String n : names) {
            System.out.println(n);
        }
        System.out.println("===============");
        for (File f : files) {
            System.out.println(f.getName() + " - " + f.length());
        }
    }
}
