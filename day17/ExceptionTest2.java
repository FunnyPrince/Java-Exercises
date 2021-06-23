package com.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author FunnyPrince_
 * @date 2021/4/12 - 20:57
 *
 * 异常处理方式二：throws + 异常类型
 * 1.“throws + 异常类型”写在方法的声明处，致命此方法执行时，可能会抛出异常类型
 * 一旦当方法体执行时出现异常，仍会在异常代码出生成一个异常的对象，此对象满足throws后
 * 的异常类型时，就会被抛出。异常代码后续的代码，就不再执行
 * 2.体会：try-catch-finally：真正的将异常给处理掉了
 * throws方式只是将异常抛给了方法的调用者，并没有真正将异常处理掉。
 *3.开发中如何选择使用try-catch-finally还是使用throws
 *  3.1父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能够使用throws，
 *  意味着如果子类重写方法中有异常，必须使用try-catch-finally方式处理
 *  3.2执行额方法中，先后又调用了另外的几个方法，这几个方法是递进关系的，我们建议这几个方法
 *  使用throws的方式进行处理。而执行的方法a可以考虑try-catch-finally方式进行处理
 *
 *
 */
public class ExceptionTest2 {
//    public static void main(String[] args) throws IOException {//抛给JVM，一般不抛
    //用try-catch
    public static void main(String[] args) {
        ExceptionTest2 test = new ExceptionTest2();
        try {
            test.method1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public static void method1() throws FileNotFoundException, IOException{//处理方式不一样写两个，处理方式一样写一个
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while (data != -1) {
            System.out.println((char) data);
            //Unhandled exception: java.io.IOException
            data = fis.read();
        }
        fis.close();
    }
}
