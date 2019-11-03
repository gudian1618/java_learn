package com.github.gudian1618.day1001;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/11/3 4:21 下午
 */

public class Test6 {

    public static void main(String[] args) {

        // 根据传递的数据类型,返回一个对应类型的Wrapper对象
        Wrapper<String> w1 = ff1("aaa");
        Wrapper<Integer> w2 = ff1(888);
        Wrapper<Double> w3 = ff1(3.14);
        System.out.println(w1.getValue());
        System.out.println(w2.getValue());
        System.out.println(w3.getValue());
    }

    private static <X> Wrapper<X> ff1(X x) {

    }
}
