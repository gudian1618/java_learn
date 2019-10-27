package com.github.gudian1618.day0901;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2019/10/27 2:49 下午
 */

public class EchoServer {

    public static void main(String[] args) {
        EchoServer server = new EchoServer();
        server.qiDong();
    }

    public void qiDong() {
        new ServerThread().start();
    }

    class ServerThread extends Thread {
        @Override
        public void run() {
            try {
                ServerSocket ss = new ServerSocket(8000);
                System.out.println("服务已经在8000端口上启动");
                // 主要通过循环来建立Socket连接线程,并且随着需求和客户端的请求连接改变
                while (true) {
                    Socket s = ss.accept();
                    TongXinThread t = new TongXinThread(s);
                    t.start();
                }
            } catch (IOException e) {
                System.out.println("服务不能在8000端口上启动,或者服务异常停止");
            }
        }
    }

    class TongXinThread extends Thread {

        private Socket s;
        private String ip;

        public TongXinThread(Socket s) {
            this.s = s;
            InetSocketAddress addr = (InetSocketAddress) s.getRemoteSocketAddress();
            this.ip = addr.getHostString();

        }

        @Override
        public void run() {
            /*
             * 通信协议:通信流程和数据帧格式
             * 每一条数据末尾要有一个换行符,区分每一条数据
             * 中文编码:UTF-8
             * 处理编码的转换流:
             *      InputStreamReader
             *      OutputStreamWriter
             * 处理换行:
             *      BufferedReader-----readLine()
             *      PrintWriter--------println()
             * */
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream(),
                    "UTF-8"));
                PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(),
                    "UTF-8"));

                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println(ip + "-----" + line);
                    out.println(line);
                    out.flush();
                }
                // null值,循环结束,断开连接
            } catch (IOException e) {
                // readLine()接收数据异常,断开连接
            }

            System.out.println("连接断开");

        }
    }


}
