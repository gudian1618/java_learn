package com.github.gudian1618.day0604;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/8 1:43 下午
 */

public interface Weapon {

    // 接口中常量全部public static final，可以缺省

    int TYPE_COLD = 0;
    int TYPE_HOT = 1;
    int TYPE_NUCLEAR = 2;

    /*
     * public abstract 缺省存在
     */

    void kill();
    String getName();
    int getType();

}
