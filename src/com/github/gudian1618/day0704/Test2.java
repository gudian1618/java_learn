package com.github.gudian1618.day0704;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/22 2:02 下午
 */

public class Test2 {

    public static void main(String[] args) {
        try {
            f1();
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("不能解析日期");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("不能创建文件");
        }
    }

    private static void f1() throws ParseException, IOException {
        /*
         * "2019-1-1" 解析 ——> Date实例 ——> 获取毫秒值
         * ~/毫秒值.txt
         *
         * */

        System.out.println("输入日期：");
        String s = new Scanner(System.in).nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);

        String path = "/Users/zyd/IdeaProjects/java_learn/src/com/github" +
            "/gudian1618/day0704/" + d.getTime() + ".txt";
        File file = new File(path);
        file.createNewFile();


    }
}
