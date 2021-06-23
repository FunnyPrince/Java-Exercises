package com.day27;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author FunnyPrince_
 * @date 2021/5/2 - 13:01
 * RandomAccessFile的使用
 * 1.RandomAccessFile直接继承于java.lang.Object类，实现了DataInput和DataOutput接口
 * 2.RandomAccessFile既可以作为一个输入流，也可以作为一个输出流
 * 3.如果RandomAccessFile作为输出流时，写出到的文件如果不存在，执行过程中会自动创建；
 * 若果写出到的文件存在，则会对原有文件内容进行覆盖（默认从头开始覆盖）
 * 4.可以通过相关操作，实现RandomAccessFile“插入”数据的效果
 */
public class RandomAccessFileTest {
    @Test
    public void test1(){
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            //1.
            raf1 = new RandomAccessFile(new File("侧耳倾听.jpg"),"r");
            raf2 = new RandomAccessFile(new File("侧耳倾听1.jpg"),"rw");

            //2.
            byte[] buffer = new byte[1024];
            int len;
            while((len = raf1.read(buffer)) != -1){
                raf2.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.
            if(raf1 != null){

                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(raf2 != null){

                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hi33.txt","rw");

        raf1.seek(3);//将指针调到角标为3的位置
        raf1.write("xyz".getBytes());
        raf1.close();
    }
    /*
    使用RandomAccessFile实现数据的插入效果
     */
    @Test
    public void test3() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hi33.txt","rw");

        raf1.seek(3);//将指针调到角标为3的位置

        //保存指针3后面的数据到StringBuilder中
        StringBuilder builder = new StringBuilder((int)new File("hi33.txt").length());//将long转为int
        byte[] buffer = new byte[20];
        int len;
        while((len = raf1.read(buffer)) != -1){
            builder.append(new String(buffer,0,len));
        }

        //调回指针，写入"xyz"
        raf1.seek(3);
        raf1.write("xyz".getBytes());
        //将StringBuilder中的数据写入到文件中
        raf1.write(builder.toString().getBytes());
    }
}