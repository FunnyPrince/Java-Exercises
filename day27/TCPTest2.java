package com.day27;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author FunnyPrince_
 * @date 2021/5/2 - 16:46
 * 实现TCP的网络编程
 * 例2“客户端发送文件给服务端，服务端将文件保存在本地
 */
public class TCPTest2 {
    @Test
    public void client(){
        InetAddress inet = null;
        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;//读入文件
        try {
            //1.创建Socket
//            socket = new Socket(InetAddress.getByName(("127.0.0.1"),9988));
            inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet, 9988);

            //2.输出流
            os = socket.getOutputStream();
            //3.输入流
            fis = new FileInputStream(new File("程潇.jpg"));

            //4.读写过程
            byte[] buffer = new byte[1024];
            int len;
            while((len = fis.read(buffer)) != -1){
                os.write(buffer,0,len);
            }
            os.write("程潇客户端发来消息，请查收".getBytes());
            //关闭数据的输出
            socket.shutdownOutput();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.资源关闭
            if(os != null){

                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fis != null){

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(socket != null){

                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void server(){

        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            ServerSocket ss = new ServerSocket(9988);
            socket = ss.accept();
            is = socket.getInputStream();
            fos = new FileOutputStream("潇潇子.jpg");

            byte[] buffer = new byte[1024];
            int len;
            while((len = is.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
            System.out.println("潇潇子服务端已收到来自："+socket.getInetAddress().getHostName()+"的消息");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(is != null){

                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(socket != null){

                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
