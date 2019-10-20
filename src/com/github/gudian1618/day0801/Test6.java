package com.github.gudian1618.day0801;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/20 11:33 上午
 */

public class Test6 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("/Users/zyd/IdeaProjects" +
            "/java_learn/src/com/github/gudian1618/day0801/abc/f2"));
        Student s = (Student) in.readObject();
        System.out.println(s);
        in.close();
    }
}
