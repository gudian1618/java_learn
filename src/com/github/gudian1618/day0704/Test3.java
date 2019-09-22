package com.github.gudian1618.day0704;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/22 2:27 下午
 */

public class Test3 {

    public static void main(String[] args) {
        f1();
    }

    private static void f1() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,
            "2019-1-1",
            "2019-1-12",
            "2019-1-24",
            "2019-1-11",
            "2019-1-3",
            "dfsafasfasdfa",
            "2019-1-30",
            "2019-1-2",
            "2019-1-15");
        Collections.sort(list, new Comparator<String>() {
            /*
            * 两者比较大小，前者大，返回正数；前者小，返回负数，相同，返回0
            * 方法重写，不能抛出比父类方法更多的异常
            * */
            @Override
            public int compare(String o1, String o2) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date d1 = sdf.parse(o1);
                    Date d2 = sdf.parse(o2);
                    return d1.compareTo(d2);
                } catch (ParseException e) {
                    // 由于方法重写导致不能直接抛出，即不能跑出父类方法之外的更多异常
                    // 所以需要先捕获，但是又不想处理，
                    // 最终利用运行期异常类包装该异常，通过捕获后包装异常抛出
                    throw new RuntimeException(e);
                }
            }
        });
        System.out.println(list);
    }
}
