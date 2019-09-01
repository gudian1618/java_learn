package com.github.gudian1618.day0501;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/1 10:07 上午
 */

public class Point {

    int x;
    int y;

    /**
     * 全参和无参构造方法,通过自动生成代码提高效率
     */
    public Point() {
        super();
    }

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        // 为了参数安全，先判断参数类型
        if (obj instanceof Point) {
            Point p = (Point) obj;
            return this.x == p.x && this.y == p.y;
        }
        return false;
    }

    @Override
    public String toString() {
        return x + "," + y;
    }
}
