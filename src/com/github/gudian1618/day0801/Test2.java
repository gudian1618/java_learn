package com.github.gudian1618.day0801;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/20 9:57 上午
 */

public class Test2 {

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("/Users/zyd/IdeaProjects/java_learn/src/com" +
            "/github/gudian1618/day0801/abc/f1");

        int b;
        while ((b = in.read()) != -1) {
            System.out.println(b);
        }
        in.close();
    }

}
