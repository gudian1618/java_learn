package com.github.gudian1618.day0506;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/1 3:12 下午
 */

public class Test2 {

    public static void main(String[] args) {
        System.out.println("输入整数求阶乘：");
        int n = new Scanner(System.in).nextInt();
        String r = f(n);
        System.out.println(r);


    }

    private static String f(int n) {
        if (n == 0) {
            return "1";
        }

        BigInteger bi1 = BigInteger.valueOf(n);
        BigInteger bi2 = new BigInteger(f(n - 1));
        BigInteger bi3 = bi1.multiply(bi2);

        return bi3.toString();

    }

}

