package com.github.gudian1618.day0801;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/20 9:43 上午
 * 保留int的4字节中最后一个字节值,有损失
 */

public class Test1 {

    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("/Users/zyd/IdeaProjects/java_learn/src/com" +
            "/github/gudian1618/day0801/abc/f1");
        // 00 00 00 61 --> 61
        out.write(97);
        // 00 00 01 64 --> 64
        out.write(356);

        byte[] a = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
        // 数组中0开始到n-1下标的左闭右开区间10个字节
        out.write(a, 0, 10);
        // 数组中3开始的4个字节
        out.write(a, 3, 4);
        // 释放系统资源
        out.close();

    }

}
