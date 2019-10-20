package com.github.gudian1618.day0801;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/20 11:25 上午
 */

public class Test5 {

    public static void main(String[] args) throws IOException {
        Student s = new Student(5, "张三", "男", 23);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/Users/zyd/IdeaProjects" +
            "/java_learn/src/com/github/gudian1618/day0801/abc/f2"));

        out.writeObject(s);
        out.close();
    }
}
