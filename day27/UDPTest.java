package com.day27;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.*;


/**
 * @author FunnyPrince_
 * @date 2021/5/2 - 19:13
 *
 * String的getBytes()方法是得到一个操作系统默认的编码格式的字节数组。不同OS下，返回的值不一样。
 * UDP协议的网络编程
 */
public class UDPTest {
    //发送端
    @Test
    public void send() throws IOException {

        DatagramSocket socket = new DatagramSocket();

        String str = "UDP方式发送data";
        byte[] data = str.getBytes();
        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(data,0,data.length,inet,9090);

        socket.send(packet);
        socket.close();
    }
    //接收端
    @Test
    public void receiver() throws IOException {

        DatagramSocket socket = new DatagramSocket(9090);

        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
        socket.receive(packet);

        //实际存在buffer中，但是长度不确定,所以用packet表示存了多少个
        System.out.println(new String(packet.getData(),0,packet.getLength()));
        socket.close();
    }
}
