package com.github.gudian1618.day0503;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/1 11:30 上午
 */

public class Test1 {

    public static void main(String[] args) {

        String s0 = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder s = new StringBuilder();
        StringBuffer k = new StringBuffer();

        // 系统当前时间的时间点毫秒值
        // 1970-1-1 0点开始的毫秒值
        // 频繁的，无用的，多余的创建新的字符串实例效率低下
        long t = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            s.append(s0);
        }
        t = System.currentTimeMillis() - t;
        System.out.println(t);
    }
}
