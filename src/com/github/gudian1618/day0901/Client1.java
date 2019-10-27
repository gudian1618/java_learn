package com.github.gudian1618.day0901;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/27 2:30 下午
 */

public class Client1 {

    public static void main(String[] args) throws IOException {
        // 创建客户端的插头对象,指定连接的服务器ip和相应的端口
        Socket s = new Socket("127.0.0.1", 8000);
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        // 发送hello
        out.write("hello".getBytes());
        out.flush();

        // 接收服务器端写的,发送来的信息
        for (int i = 0; i < 5; i++) {
            char c = (char) in.read();
            System.out.print(c);
        }

        s.close();
    }

}
