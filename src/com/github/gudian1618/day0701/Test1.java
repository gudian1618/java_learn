package com.github.gudian1618.day0701;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/22 9:44 上午
 */

public class Test1 {

    public static void main(String[] args) {
        /*
        * <>泛型
        * 限制集合中保存的数据类型
        * 泛型和集合不支持基本类型，要使用包装类型
        * */

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println(list.remove(1));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 迭代遍历
        // 新建迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

    }
}
