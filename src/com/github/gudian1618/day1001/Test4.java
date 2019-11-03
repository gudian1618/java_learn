package com.github.gudian1618.day1001;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/11/3 3:29 下午
 */

public class Test4 {

    public static void main(String[] args) {
        Wrapper<String> w1 = new Wrapper<>();
        Wrapper<Integer> w2 = new Wrapper<>();
        w1.setValue("aaa");
        w2.setValue(222);
        String v1 = w1.getValue();
        Integer v2 = w2.getValue();
        System.out.println(v1);
        System.out.println(v2);

        f(w1);
        f(w2);
        String v3 = w1.getValue();
        System.out.println(v3);
    }

    /**
     * 类型擦除,T是Object类型,会引起类型的写入和读取问题
     */
    private static void f(Wrapper w) {
        Object v = w.getValue();
        System.out.println(v);

        w.setValue(3.14);
    }

}
