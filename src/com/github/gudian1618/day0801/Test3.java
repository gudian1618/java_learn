package com.github.gudian1618.day0801;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/20 10:08 上午
 */

public class Test3 {

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("/Users/zyd/IdeaProjects/java_learn/src/com" +
            "/github/gudian1618/day0801/abc/f1");

        byte[] buff = new byte[6];
        // 用来保存每一批字节数量(除最后)
        int n;
        while ((n = in.read(buff)) != -1) {
            System.out.println(n + ":" + Arrays.toString(buff));
        }
        in.close();

    }

}
