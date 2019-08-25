package com.github.gudian1618.day0403;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/8/25 1:39 下午
 * 宠物父类构建共同属性和方法
 */

public class Pet {
    /**
     * 宠物名
     * 饱食度
     * 快乐度
     */
    String name;
    int full;
    int happy;

    public Pet() {
    }

    public Pet(String name) {
        this(name, 50, 50);
    }

    public Pet(String name, int full, int happy) {
        this.name = name;
        this.full = full;
        this.happy = happy;
    }

    public void feed() {

        if (full == 100) {
            System.out.println(name + "吃饱了");
            return;
        }

        System.out.println("给" + name + "喂食");
        full += 10;
        System.out.println("饱食度：" + full);
    }

    public void play() {

        if (full == 0) {
            System.out.println(name + "饿的玩不动了");
            return;
        }

        System.out.println("陪" + name + "玩耍");
        happy += 10;
        full -= 10;
        System.out.println("快乐度：" + happy);
        System.out.println("饱食度 :" + full);
    }

    public void punsih() {
        // 不同的代码，就调用方法，在父类中定义，但不用具体写，在子类中重写相关相应的具体方法
        System.out.println("打" + name + "的pp" +name+ "哭叫：" + cry());
        happy-=10;
        System.out.println("快乐度："+happy);
    }

    public String cry() {
        // 无异议代码，一般为空，不具体写相应的代码，因为压根就不会用
        return "此处有哭叫声，需要在子类中重写该方法";
    }
}


