package com.github.gudian1618.day0605;


/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/8 3:18 下午
 */

public class Test2 {

    public static void main(String[] args) {
        Weapon w1 = f1();
        w1.kill();
        System.out.println(w1);
        System.out.println("=============");

        Weapon w2 = f2("倚天剑");
        w2.kill();
        System.out.println(w2);

    }

    private static Weapon f2(String name) {
        // 突然发现该类名不太好起名字代表意思，而且外面也不会用到，所以采用匿名内部类
        // 相当于super调用，父类的构造方法
        // 相当于赋值运算，别忘了末尾的分号;

        // {}大括号是匿名内部类
        // new新建匿名类的实例
        // ()小括号是super()

        Weapon a = new Weapon() {
            @Override
            public void kill() {
                System.out.println("使用" + name + "进攻");
            }
        };
        return a;
    }

    private static Weapon f1() {
        class AK47 implements Weapon {
            @Override
            public void kill() {
                System.out.println("使用AK47进攻");
            }
        }
        AK47 a = new AK47();
        return a;
    }


}
