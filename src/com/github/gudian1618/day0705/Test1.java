package com.github.gudian1618.day0705;

import java.io.File;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/22 3:31 下午
 */

public class Test1 {

    public static void main(String[] args) {
        String path;

        // 存在的文件
//        path = "/Users/zyd/IdeaProjects/java_learn/src/com/github/gudian1618/day0704/1569081600000.txt";
        // 存在的文件夹
//        path = "/Users/zyd/IdeaProjects/java_learn/src/com/github/gudian1618/day0704";
        // 不存在的路径
        path = "/Users/zyd/IdeaProjects/java_learn/src/com/github/gudian1618/day0710";

        File f = new File(path);
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.isAbsolute());
        System.out.println(f.getName());
        System.out.println(f.length());
        System.out.println(f.getParent());
        System.out.println(f.getAbsolutePath());
    }
}
