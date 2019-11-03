package com.github.gudian1618.day1001;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/11/3 1:34 下午
 */

public class Runner {

    private static ArrayList<String> list = new ArrayList<>();

    static {
        try {
            // /斜杠 表示这个类的存放目录
            String path = Runner.class.getResource("/config.txt").getPath();
            // 如果路径下有中文,

            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(path), "GBK"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
