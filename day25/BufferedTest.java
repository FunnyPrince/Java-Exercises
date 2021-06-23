package com.day25;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author FunnyPrince_
 * @date 2021/4/29 - 22:46
 *
   1.缓冲流(处理流的一种)
    BufferedInputStream
    BufferedOutputStream
    BufferedReader
    BufferedWriter
 2.作用：提高流的读取、写入效率
    提高读写速度的原因：内部提供了一个缓冲区
 3.处理流：就是“套接”在已有的流的基础上。
 */
public class BufferedTest {
    /*
    实现非文本文件的复制
     */
    @Test
    public void BufferedStreamTest() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.造文件
            File srcFile = new File("侧耳倾听.jpg");
            File destFile = new File("侧耳倾听22.jpg");
            //2.造流
//        BufferedInputStream bis = new BufferedInputStream(srcFile);
//        BufferedOutputStream bos = new BufferedOutputStream()
            //2.1造节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);
            //2.2造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.复制的细节：读取、写入
            byte[] buffer = new byte[10];
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);

//                bos.flush();//刷新缓冲区

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭:
            //要求：先关闭外层流，再关闭内层流
            if(bos != null){

                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bis != null){

                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //说明：关闭外层流的同时，内层流也会自动关闭。可以省略关闭内层流
//        fos.close();
//        fis.close();
    }

    //实现文件复制的方法
    public void copyFileWithBuffered(String srcPath,String destPath){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.造文件
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);
            //2.造流
//        BufferedInputStream bis = new BufferedInputStream(srcFile);
//        BufferedOutputStream bos = new BufferedOutputStream()
            //2.1造节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);
            //2.2造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.复制的细节：读取、写入
            byte[] buffer = new byte[1024];//保证和FileInputStream一样
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭:
            //要求：先关闭外层流，再关闭内层流
            if(bos != null){

                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bis != null){

                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void testCopyFileWithBuffered(){
        long start = System.currentTimeMillis();
        String srcPath = "C:\\Users\\Administrator\\Desktop\\01.jpg";
        String destPath = "C:\\Users\\Administrator\\Desktop\\02.jpg";

        copyFileWithBuffered(srcPath,destPath);

        long end = System.currentTimeMillis();
        System.out.println("复制操作所花费时间为："+(end-start));//34
    }

    /*
    BufferedReader和BufferedWriter实现文本文件的复制
     */
    @Test
    public void testBufferedReaderBufferedWriter(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            //创建文件和相应的流
            br = new BufferedReader(new FileReader(new File("hi.txt")));
            bw = new BufferedWriter(new FileWriter(new File("hi33.txt")));
            //读写操作
            //方式一：使用char[]数组
            char[] cbuf = new char[1024];
            int len;
//            while((len = br.read()) != -1){//全部输出null，没有读入到cbuf中
            while((len = br.read(cbuf)) != -1){
                bw.write(cbuf,0,len);
    //            bw.flush();
            }
            //方式二：使用String
//            String data;
//            while((data = br.readLine())!= null){
//                //方法一：
////                bw.write(data + "\n");//手动换行
////                bw.write(data);//data中不包含换行符
//                //方法二：
//                bw.write(data);
//                bw.newLine();//换行
//            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if(bw != null){

                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(br != null){

                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
