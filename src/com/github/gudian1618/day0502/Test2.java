package com.github.gudian1618.day0502;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/1 11:11 上午
 */

public class Test2 {

    public static void main(String[] args) {

        String s0 = "abcdefghijklmnopqrstuvwxyz";
        String s = "";

        // 系统当前时间的时间点毫秒值
        // 1970-1-1 0点开始的毫秒值
        // 频繁的，无用的，多余的创建新的字符串实例效率低下
        long t = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s += s0;
        }
        t = System.currentTimeMillis() - t;
        System.out.println(t);
    }

}
