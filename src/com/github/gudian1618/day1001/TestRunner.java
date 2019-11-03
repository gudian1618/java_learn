package com.github.gudian1618.day1001;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/11/3 3:00 下午
 */

public class TestRunner {

    public static void main(String[] args) throws Exception {
        TestRunner.launch(A.class);
    }

    public static void launch(Class<?> c) throws Exception {
        // 反射新建实例
        Object obj = c.newInstance();
        // 获取所有的公开的方法
        Method[] a = c.getMethods();
        for (Method t : a) {
            // 判断方法上,是否存在@Test注解
            if (t.isAnnotationPresent(Test.class)) {
                // 有Test注解,执行这个方法
                run(c, obj, t);
            }
        }
    }

    private static void run(Class<?> c, Object obj, Method t) throws Exception {
        System.out.println("\n\n======================");
        // 从方法获取注解信息
        Test test = t.getAnnotation(Test.class);
        int id = test.id();
        String title = test.title();
        if (title.equals("")) {
            title = test.value();
        }
        System.out.println("id:" + id);
        System.out.println("title:" + title);

        // 反射执行这个方法
        t.invoke(obj);
    }

}
