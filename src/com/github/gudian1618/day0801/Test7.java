package com.github.gudian1618.day0801;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/20 1:34 下午
 */

public class Test7 {

    public static void main(String[] args) throws IOException {
        // Unicode编码java默认
        String s = "abc中文";

        f(s, "/Users/zyd/IdeaProjects/java_learn/src/com/github/gudian1618" +
            "/day0801/abc/f3", "UTF-8");
        f(s, "/Users/zyd/IdeaProjects/java_learn/src/com/github/gudian1618" +
            "/day0801/abc/f4", "GBK");

    }

    private static void f(String s, String path, String endcoding) throws IOException {
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path), endcoding);
        out.write(s);
        out.close();
    }
}
