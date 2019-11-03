package com.github.gudian1618.day1001;

import java.lang.reflect.Field;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/11/3 11:26 上午
 */

public class Test3 {

    public static void main(String[] args) throws Exception {

        Class<A> c = A.class;
        A a = new A();

        Field f = c.getDeclaredField("title");
        f.setAccessible(true);
        f.set(a,"dfasdfsadfdsafasd");
        Object o = f.get(a);
        System.out.println(o);
    }

}
