package com.day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author FunnyPrince_
 * @date 2021/4/11 - 15:24
 *
 * try-catch-finally中finally的使用
 * 1.finally是可选的
 * 2.finally中声明的是一定会被执行的代码。即使catch中又出现异常了，
 * 或try中有return语句，catch中有return语句等情况。
 *3.像数据库连接、输入输出流、网络编程Socket等资源，JVM是不能自动回收的，我们需要自己手动的的进行资源
 * 的释放。此时的资源释放，就需要声明在finally中，
 *
 * throws在day17.ExceptionTest2
 */
public class FinallyTest {
    public static void main(String[] args) {
        FinallyTest test = new FinallyTest();
//        test.test111();
//        test.method();
        test.test222();

    }
    public void test222(){
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");
            fis = new FileInputStream(file);//  2.
            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                //Unhandled exception: java.io.IOException
                data = fis.read();
            }
//            fis.close();万一有异常，就不会执行这句，资源不会关闭
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(fis != null)//万一2. 处没有new成功，即File不存在，fis=null
                     fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    //写个有返回值的
    public int method() {
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 2;
        }finally {
            System.out.println("method()...finally");
        }
    }
    public void test111(){
        try{
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }catch(ArithmeticException e){
//            e.printStackTrace();
            //写个异常
            //java.lang.ArrayIndexOutOfBoundsException
            int[] arr = new int[10];
            System.out.println(arr[10]);

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("test111()...finally");
        }
    }
}
