package com.github.gudian1618.day0901;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/27 3:41 下午
 */

public class EchoClient {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 8000);
        // 处理UTF-8 换行
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream(), "UTF-8"));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), "UTF-8"));

        while (true) {
            System.out.println("输入:");
            String msg = new Scanner(System.in).nextLine();

            out.println(msg);
            out.flush();

            String echo = in.readLine();
            System.out.println("回声:" + echo);
        }
    }

}
