package com.day27;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author FunnyPrince_
 * @date 2021/5/2 - 19:33
 * URL网络编程
 * 1.URL：统一资源定位符，对应着互联网的某一资源地址
 * 2.格式：
 * public String getProtocol( )
 * 获取该URL的协议名
 * public String getHost( )
 * 获取该URL的主机名
 * public String getPort( )
 * 获取该URL的端口号
 * public String getPath( )
 * 获取该URL的文件路径
 * public String getFile( )获 取该URL的文件名
 * public String getQuery( )
 * 获取该URL的查询名
 */
public class URLTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080//helloworld/index.jsp#a?");
            System.out.println(url.getProtocol());//http
            System.out.println(url.getHost());//localhost
            System.out.println(url.getPort());//8080
            System.out.println(url.getPath());// //helloworld/index.jsp
            System.out.println(url.getFile());// //helloworld/index.jsp
            System.out.println(url.getQuery());//null

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } finally {
        }

    }
}
