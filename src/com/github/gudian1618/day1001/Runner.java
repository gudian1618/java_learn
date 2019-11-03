package com.github.gudian1618.day1001;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URLDecoder;
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
            // 如果路径下有中文(最好别用中文路径),用16进制字节编码%%分别分开表达
            // 路径是URL编码,需要解码还原
            path = URLDecoder.decode(path, "UTF-8");

            // 处理换行的流,readLine()方法;处理编码转换流
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(path), "GBK"));

            String line;
            while ((line = in.readLine()) != null) {
                // 去掉空白字符
                line = line.replaceAll("\\s+", "");
                // 忽略空白行
                if (line.length() == 0) {
                    continue;
                }
                list.add(line);
            }
            in.close();
        } catch (Exception e) {
            System.out.println("加载配置文件失败!");
        }
    }

    public static void launch() throws Exception {
        for (String s : list) {
            // 需要将这个字符串拆分成两个或者多个./
            // 用分号来差分字符串
            String[] a = s.split(";");
            // 获得类对象
            Class<?> c = Class.forName(a[0]);
            // 反射新建实例
            Object obj = c.newInstance();
            // 获得方法
            Method t = c.getMethod(a[1]);
            // 反射执行方法
            t.invoke(obj);
            System.out.println("==============\n");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(list);
        Runner.launch();
    }

}
