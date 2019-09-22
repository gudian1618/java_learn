package com.github.gudian1618.day0703;

import java.util.HashMap;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/22 11:01 上午
 */

public class Test1 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(9527, "唐伯虎");
        map.put(9528, "华夫人");
        map.put(9529, "旺财");
        map.put(9529, "小强");
        map.put(9530, null);
        map.put(null, "---");
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get(9527));
        System.out.println(map.get(9999));
        System.out.println(map.remove(9529));
        System.out.println(map);
    }
}
