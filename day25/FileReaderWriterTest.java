package com.day25;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author FunnyPrince_
 * @date 2021/4/29 - 19:28
 *
 * 一、流的分类
 * 1.操作数据单位：字节流、字符流
 * 2.数据的流向：输入流、输出流
 * 3.流的角色：节点流、处理流
 *
 * 二、流的体系结构
 * 抽象基类               节点流(文件流)                                                缓冲流(处理流的一种)
 * InputStream          FileInputStream (read(byte[] cbuf))                         BufferedInputStream (read(byte[] cbuf))
 * OutputStream         FileOutputStream  (write(byte[] cbuf,0,len))                BufferedOutputStream (write(byte[] cbuf,0,len))  / flush()
 * Reader               FileReader(read(char[] cbuf))                               BufferedReader (read(char[] cbuf)) / readLine()
 * Writer               FileWriter (write(char[] cbuf,0,len))                       BufferedWriter (write(char[] cbuf,0,len))   / flush()
 */
public class FileReaderWriterTest {
    /*
    将hi.txt文件内容读入程序中，并输出到控制台
    知识点：
    1.read()的理解：返回读入的一个字符。如果达到文件末尾，返回-1
    2.异常的处理：为了保证资源一定可以执行关闭操作。使用try-catch-finally处理。
    3.读入的文件一定要存在，否则报FileNotFoundException.
     */
    @Test
    public void testFileReader(){
        FileReader fr = null;
        try {
            //1.实例化File类的对象，指明要操作的文件
            File file = new File("hi.txt");//相对于当前module
            //2.提供具体的流
            fr = new FileReader(file);
            //3.数据的读入
            //read():返回读入的一个字符。如果达到文件末尾，返回-1
            //方式一：
//        int data = fr.read(); //用int存储
//        while(data != -1){
//            System.out.print((char)data);
//            data = fr.read();
//        }
            //方式二：针对方式一语法上的修改
            int data;
            while((data = fr.read()) != -1){
                System.out.println((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭操作
            try {
                if(fr != null) //否则空指针异常
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }
        }
    }

    //对read()操作升级：使用read的重载方法
    @Test
    public void testFileReader1(){
        FileReader fr = null;
        try {
            //1.File类的实例化
            File file = new File("hi.txt");

            //2.FileReader流的实例化
            fr = new FileReader(file);
            //3.读入的操作
            //read(char[] cbuf):返回每次读入cbuf数组中的字符个数。如果达到文件末尾，返回-1
            char[] cbuf = new char[5];//字符是char型，字节流是byte型
            int len;
            while((len = fr.read(cbuf))!= -1){
                //方式一：
                //错误写法
//                for (int i = 0; i < cbuf.length; i++) {//读入3个，遍历5个，就要从上个读入的补进
//                    System.out.print(cbuf[i]);
//                }
                //正确写法
//                for (int i = 0; i < len; i++) {//读进几个，遍历几个
//                    System.out.print(cbuf[i]);
//                }
                //方式二：
                //错误写法：对应方式一的错误写法
//                String str = new String(cbuf);
//                System.out.println(str);
                //正确写法：
                String str = new String(cbuf,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    //4.资源的关闭
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                }
            }

        }
    }

    /*
    从内存中写出数据到硬盘的文件里
    说明：
    1.输出操作，对应的File可以不存在。
    2. File对应的硬盘中的文件如果不存在，在输出的过程中，会自动创建此文件。
       File对应的硬盘中的文件如果存在：
            如果流使用的构造器是：FileWriter(file,false) / FileWriter(file):对原有文件的覆盖；
            如果流使用的构造器是：FileWriter(file,true)，不会对原有文件进行覆盖，而是在原有文件基础上追加内容。
    2.
     */
    @Test
    public void testFileWriter(){
        FileWriter  fw = null;
        try {
            //1.提供File类的对象，指明写出到的文件
            File file = new File("hi1.txt");

            //2.提供FileWriter对象，用于数据的写出
//            fw = new FileWriter(file);
            fw = new FileWriter(file,false);//false会对原有文件覆盖；true会在原有文件上继续添加
            //3.写出的操作
            fw.write("June month!!!\n");
            fw.write("come on");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null){

                try {
                    //4.流资源的关闭
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                }
            }
        }

    }

    @Test
    public void testFileReaderFileWriter(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File类的对象，指明读入和写出的文件
            File srcFile = new File("hi.txt");
            File destFile = new File("hi2.txt");
            //不能使用字符流来处理图片等字节数据
//            File srcFile = new File("侧耳倾听.jpg");
//            File destFile = new File("侧耳倾听1.jpg");
            //2.创建输入流和输出流的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);
            //3.数据的读入和写出操作
            char[] cbuf = new char[5];
            int len;//记录每次读入到cbuf数组中的字符个数
            while((len = fr.read(cbuf))!= -1){
                //每次写出len个字符（读入len个就写出len个）
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源
            //方式一：
//            try {
//                fw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//            //保证下面的会执行
//                try {
//                    fr.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }

            ////方式二：
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //上面的try-catch已经处理掉了，下面的fr.close()还是会关闭
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
