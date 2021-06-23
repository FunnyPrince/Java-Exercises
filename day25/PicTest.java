package com.day25;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author FunnyPrince_
 * @date 2021/4/29 - 23:37
 *
 *
 */
public class PicTest {
    /*
    图片加密
     */
    @Test
    public void test1(){
        FileInputStream fis = null;//可以直接写路径，省略造文件
        FileOutputStream fos = null;

        try {
//        FileInputStream fis = new FileInputStream(new File("侧耳倾听.jpg"));
            fis = new FileInputStream("侧耳倾听.jpg");
            fos = new FileOutputStream("侧耳倾听secret.jpg");

            byte[] buffer = new byte[20];
            int len;
            while((len = fis.read(buffer)) != -1){//记得read到buffer中啊！！！
                //字节数据进行修改
                //错误：foreach()只是赋给了新的变量，对新的变量进行修改，buffer[]数组并没有改变
    //            for(byte b : buffer){//只是把数组取出来赋给b
    //                b = (byte)(b ^ 5);
    //            }
                //正确：
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte)(buffer[i] ^ 5);//异或
                }
                fos.write(buffer,0,len);
            }
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

            if(fis != null){

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    //图片的解密
    @Test
    public void test2(){
        FileInputStream fis = null;//可以直接写路径，省略造文件
        FileOutputStream fos = null;

        try {
//        FileInputStream fis = new FileInputStream(new File("侧耳倾听.jpg"));
            fis = new FileInputStream("侧耳倾听secret.jpg");
            fos = new FileOutputStream("侧耳倾听4.jpg");

            byte[] buffer = new byte[20];
            int len;
            while((len = fis.read(buffer)) != -1){

                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte)(buffer[i] ^ 5);//异或
                }
                fos.write(buffer,0,len);
            }
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

            if(fis != null){

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
