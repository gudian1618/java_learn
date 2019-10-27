package com.github.gudian1618.day0901;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/27 11:42 上午
 */

public class Server1 {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(8000);
        System.out.println("服务已经在8000端口上启动");
        System.out.println("暂停等待客户端发起连接");
        Socket s = ss.accept();
        System.out.println("客户端已连接");

        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        /*
         * 通信协议:通信的流程,和数据帧格式必须一致
         * 接收"hello"
         * 发送"world"
         * */

        // 接收来自客户端的写的,收到的信息
        for (int i = 0; i < 5; i++) {
            char c = (char) in.read();
            System.out.print(c);
        }

        // 发送world
        out.write("world".getBytes());
        out.flush();
        // 关闭接收端
        s.close();
        // 关闭服务,释放端口
        ss.close();

    }
}
