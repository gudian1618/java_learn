package com.github.gudian1618.day1001;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/11/3 3:23 下午
 * 封装器
 * 用来封装一个任意类型的数据
 */

public class Wrapper<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
