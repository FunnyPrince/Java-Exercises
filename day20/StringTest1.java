package com.day20;


import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author FunnyPrince_
 * @date 2021/4/18 - 10:04
 *
 * 涉及到String类与其他结构之间的转换
 */
public class StringTest1 {
    /*
    String与byte[]之间的转换
    编码：String-->byte[]:调用String的getBytes()
    解码：byte[]-->String:调用String的构造器

    编码：字符串-->字节(看得懂的-->看不懂的二进制数据)
    解码：编码的逆过程，字节-->字符串(看不懂的二进制数据-->看得懂的)

    说明：解码时，要求解码使用的字符集必须与编码时使用的字符集一致，否则会出现乱码
     */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "abc123";
        String str2 = "abc123中国";
        byte[] b1 = str1.getBytes();
        byte[] b2 = str2.getBytes();//使用默认的字符集进行转换,UTF-8中一个汉字3位
        System.out.println(Arrays.toString(b1));//对数组进行遍历
        System.out.println(Arrays.toString(b2));

        //UTF-8,gbk指定字符的时候与ACIll码一样
        byte[] gbks = str2.getBytes("gbk");//使用gbk字符集进行编码，一个汉字2位
        System.out.println(Arrays.toString(gbks));

        System.out.println("****解码********");
        String str3 = new String(b2);
        System.out.println(str3);

        String str4 = new String(gbks);//使用gbk解码，会出现乱码，编码解码前后得一致
        System.out.println(str4);//出现乱码。原因：编码集合解码集不一致

        String str5 = new String(gbks,"gbk");
        System.out.println(str5);//没有出现乱码，编码集和解码集一致
    }


    /*
    String与char[]之间的转换
    String-->ch[]:调用String的toCHarArray()
    char[]-->String:调用String的构造器
     */
    @Test
    public void test2(){
        String str1 = "abc123";
        //题目： a21cb3  a 3 保留，让bc12反转
        //思路：先转换成char[]数组，再反转

        char[] charArray = str1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        char[] arr = new char[]{'h','e','l','l','o'};
        String str2 = new String(arr);
        System.out.println(str2);

    }

    /*
    复习：
    String与基本类型、包装类之间的转换
    String--》基本数据类型、包装类：调用包装类的静态方法：parseXxx(str)
    基本数据类型、包装类--》Sting：调用String重载的valueOf(xxx)

     */
    @Test
    public void test1(){
        String str1 = "123";//常量池里
        //不可强转，错误情况：
        //int num = (int)str1;
        int num = Integer.parseInt(str1);

        String str2 = String.valueOf(num);
        String str3 = num + "";//在堆里(只要有变量参与，就在堆里

        System.out.println(str1 == str3);//false
    }
}

