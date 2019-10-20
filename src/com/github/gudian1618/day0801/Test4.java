package com.github.gudian1618.day0801;

import java.io.*;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/20 10:16 上午
 */

public class Test4 {

    public static void main(String[] args) {

        System.out.println("输入原文件:");
        String from = new Scanner(System.in).nextLine();
        System.out.println("输入目标文件:");
        String to = new Scanner(System.in).nextLine();

        try {
            copy(from, to);
            System.out.println("复制完成");
        } catch (Exception e) {
            System.out.println("复制失败");
            e.printStackTrace();
        }
    }

    private static void copy(String from, String to) throws IOException {

        BufferedInputStream in = new BufferedInputStream(new FileInputStream(from));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(to));

        // 单字节操作
        // 基于内存缓存
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }

        // 批量用数组整体操作字节,比单独单字节操作效率高,减少IO操作
//
//        byte[] buff = new byte[8192];
//        // 用来保存每一批的字节数量
//        int n;
//        while ((n = in.read(buff)) != -1) {
//            out.write(buff, 0, n);
//        }

        in.close();
        out.close();
    }

}
