package com.github.gudian1618.day1001;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/11/3 4:06 下午
 */

public class Test5 {

    public static void main(String[] args) {

        Wrapper<Integer> w1 = new Wrapper<>();
        Wrapper<Double> w2 = new Wrapper<>();
        Wrapper<String> w3 = new Wrapper<>();

        f1(w1);
        f1(w2);
        f1(w3);

        f2(w1);
        f2(w2);
        f2(w3);
    }

    /**
     * 允许数字,不允许其他数据
     * number是数字包装类的父类,子类:有6中基本类型
     * <? extends Number>某种未知的特定类型,且是Number的子类
     */
    private static void f2(Wrapper<? extends Number> w) {
        Number v = w.getValue();
        System.out.println(v);
        // 除了null值,不能放入任何数据

    }

    /**
     * <?>某种未知的特定类型
     */

    private static void f1(Wrapper<?> w) {
        Object v = w.getValue();
        System.out.println(v);
        // 放入任何类型都不被允许,不会有类型安全的问题,null值特殊可以放入
//        w.setValue(null);

    }

}
