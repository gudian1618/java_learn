package com.github.gudian1618.day1001;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
        // 私有变量可以访问
        f.setAccessible(true);
        // 为a这个实例变量赋值
        f.set(a,"赋值");
        // 从a实例获取这个变量的值
        Object o = f.get(a);
        System.out.println(o);

        // 获取方法
        Method get = c.getMethod("getTitle");
        Method set = c.getMethod("setTitle", String.class);

        // 反射调用a.setTitle()
        set.invoke(a, "获取");
        // 反射调用a.getTitle()
        Object r = get.invoke(a);
        System.out.println(r);
    }

}
