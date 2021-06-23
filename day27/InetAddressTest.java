package com.day27;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author FunnyPrince_
 * @date 2021/5/2 - 13:52
 *
 * 一、 网络编程中有两个主要的问题:
 * 1.如何准确地定位网络上一台或多台主机;定位主机上的特定的应用
 * 2.找到主机后如何可推高效地进行数据传输
 * 二、网络編程中的两个要素:
 * 1.对应问题- -: IP和端口号
 * 2.对应问题二:提供网络通信协议。
 * 三、通信要素一：IP和端口号
 * 1. IP:唯一的标识Internet. 上的计算机(通信实体)
 * 2.在Java 中使用InetAddress类代表IP
 * 3. IP分类: IPv4和IPv6;万维网和局域网
 * 4.域名：www.baidu.com; www.sina.com
 * 5.本地回路地址：127.0.0.1，对应：localhost
 * 6.如何实例化InetAddress，getByName(String host); getLocalHost();
 *  2个常用方法：getHostName() / getHostAddress()
 * 7.端口号：正在计算机上运行的进程
 *
 *
 * */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            //
            InetAddress inet1 = InetAddress.getByName("192.168.13.10");
            System.out.println(inet1);///192.168.13.10

            InetAddress inet2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet2);//www.baidu.com/14.215.177.39

            //获取本机ip地址
            InetAddress inet3 = InetAddress.getLocalHost();
            System.out.println(inet3);//PC-20190929LCAN/192.168.98.1

            //getHostName()
            //getHostAddress()
            System.out.println(inet2.getHostName());//www.baidu.com
            System.out.println(inet2.getHostAddress());//14.215.177.39


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }

}

