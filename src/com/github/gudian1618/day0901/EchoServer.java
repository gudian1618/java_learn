package com.github.gudian1618.day0901;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/27 2:49 下午
 */

public class EchoServer {

    class ServerThread extends Thread {
        @Override
        public void run() {
            try {
                ServerSocket ss = new ServerSocket(8000);
                System.out.println("服务已经在8000端口上启动");
                // 主要通过循环来建立Socket连接线程,并且随着需求和客户端的请求连接改变
                while (true) {
                    Socket s = ss.accept();
                    TongXinThread t = new TongXinThread();
                    t.start();
                }
            } catch (IOException e) {
                System.out.println("服务不能在8000端口上启动,或者服务异常停止");
            }
        }
    }

    class TongXinThread extends Thread {
        
    }


}
