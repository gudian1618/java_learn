package com.github.gudian1618.day0507;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/1 3:28 下午
 */

public class Test1 {

    public static void main(String[] args) {
        Date a = new Date();
        Date b = new Date(90000000L);
        // println方法中，会自动调用对象的toString
        // 获得字符串，再打印

        // 执行toString方法，先去Date中找，再找Object，在其中重写了方法
        System.out.println(a);
        System.out.println(b);

        System.out.println(a.getTime());
        System.out.println(b.getTime());

        a.setTime(0);
        System.out.println(a);
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s1 = sdf.format(a);
        String s2 = sdf.format(b);
        System.out.println(s1);
        System.out.println(s2);

    }

}
