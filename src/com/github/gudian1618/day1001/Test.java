package com.github.gudian1618.day1001;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * @interface用来定义注解
 *
 * 原注解,对注解的注解
 * @Target - 注解目标:类,方法,成员变量,参数...;当有多个类型目标的时候,永大括号包裹,逗号隔开
 * @Retention - 保留范围:源码,字节码文件,运行期内存
 * */


/**
 * @author zyd
 */
//@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
    /*
    * 没有默认值,使用注解时,必须手动赋值
    * */
    int id() default 0;

    String title() default "";

    /*特殊属性名value,有特殊待遇,
    * 单独赋值时,可以省略属性名,一般吧value作为其他我属性的别名来使用
    * */
    String value() default "";
}
