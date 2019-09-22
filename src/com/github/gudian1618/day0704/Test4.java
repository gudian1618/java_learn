package com.github.gudian1618.day0704;

import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/9/22 3:06 下午
 */

public class Test4 {

    public static void main(String[] args) {
        System.out.println("用户名：");
        String n = new Scanner(System.in).nextLine();
        System.out.println("密码：");
        String p = new Scanner(System.in).nextLine();

        try {
            login(n, p);
        } catch (UsernameNotFoundException e) {
            e.printStackTrace();
            System.out.println("用户名错误");
        } catch (WrongPasswordException e) {
            e.printStackTrace();
            System.out.println("密码错误");
        }

    }

    private static void login(String n, String p) throws UsernameNotFoundException, WrongPasswordException {
        if (!"abc".equals(n)) {
            throw new UsernameNotFoundException();
        }
        if (!"123".equals(p)) {
            throw new WrongPasswordException();
        }
    }
}
