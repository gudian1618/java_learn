package com.github.gudian1618.day0705;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/22 3:48 下午
 */

public class Test2 {

    public static void main(String[] args) throws IOException {
        /*
        * 新建两层文件夹
        * 新建文件
        * 删除文件
        * 删除文件夹
        * */

        System.out.println("按回车执行");
        new Scanner(System.in).nextLine();
        File dir = new File("/Users/zyd/IdeaProjects/java_learn/src/com/github" +
            "/gudian1618/day0705/abc/aa/");
        dir.mkdirs();

        new Scanner(System.in).nextLine();
        File file = new File(dir, "f1");
        file.createNewFile();

        new Scanner(System.in).nextLine();
        file.delete();

        new Scanner(System.in).nextLine();
        dir.delete();

    }
}
