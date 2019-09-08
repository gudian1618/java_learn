package com.github.gudian1618.day0606;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/8 3:59 下午
 */

public class Test1 {

    public static void main(String[] args) {
        /*
         * <>泛型
         * 集合中，泛型可以变化、限制集合中存放的数据类型
         */

        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        list.add("ggg");
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
        System.out.println(list.remove(3));
        System.out.println(list);
        System.out.println(list.remove("aaa"));
        System.out.println(list);

        // 双向链表遍历，效率低下，很多遍，每次都要从头开始，整体计算效率低下
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Iterator迭代器遍历，效率高，只需一次遍历建立索引即可
        Iterator<String> it = list.iterator();
        if (it.hasNext()) {
            // 当还有下一个
            // 取下一个数据
            String s = it.next();
            System.out.println(s);
        }
    }
}
