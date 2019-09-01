package com.github.gudian1618.day0507;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/1 3:50 下午
 */

public class Test2 {

    public static void main(String[] args) throws ParseException {
        /*
         * 输入生日，显示“您已经存活了xxx天”
         * 获得输入的生日字符串
         * "1994-06-06" --> 解析 --> Date实例
         * 按照对应的格式解析
         */
        System.out.println("输入生日（yyy-MM-dd）:");
        String s = new Scanner(System.in).nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);

        long t = System.currentTimeMillis() - d.getTime();
        t = t/1000/60/60/24;
        System.out.println("您已经存活了"+t+"天");
    }

}
