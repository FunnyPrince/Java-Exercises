package com.day15;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

/**
 * @author FunnyPrince_
 * @date 2021/4/10 - 0:54
 *  * ➢Exception:其它因编程错误或偶然的外在因素导致的一般性问题，可以使用针对性的代码进行处理。
 *  * 例如:
 *  * ↓空指针访问
 *  * r试图读取不存在的文件
 *  * r网络连接中断
 *  * r数组角标越界
 *
 *  一、异常的体系结构
 *  java.lang.Throwable;
 *          |---java.lang.Error;
 *          |---java.lang.Exception;:可以进行异常的处理
 *              |---编译时异常（checked）
 *                   |---IOException
 *                       |---FileNotFoundException
 *                    |---ClassNotFoundException
 *              |---运行时异常（unchecked）
 *                    |---NullPointerException
 *                    |---ArrayIndexOutOfBoundsException
 *                    |---ClassCastException
 *                    |---NumberFormatException
 *                    |---InputMismatchException
 *                    |---ArithmeticException   算数异常
 *面试题：常见的异常有哪些？举例说明
 *
 *
 */
public class ExceptionTest {
    public static void main(String[] args) {

    }
    //编译时异常
    public void test(){
        //异常处理在ExceptionTest1里
//        File file = new File("hello.txt");
//        FileInputStream fis = new FileInputStream(file);
//        int data = fis.read();
//        while(data != -1){
//            System.out.println((char)data);
//            //Unhandled exception: java.io.IOException
//            data = fis.read();
//        }
//        file.close();
    }

    //*******************运行时异常
    //ArithmeticException
    public void test6(){
        int a =10;
        int b =0;
        System.out.println(a / b);
    }
    //InputMismatchException
    public void test5(){
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(score);//如果输入不是int
    }

    //NumberFormatException
    public void test4(){
//        String str = "123";
//        str = "abc";
//        int num = Integer.parseInt(str);
    }

    //ClassCastException
    public void test3(){
//        Object obj = new Date();
//        //Casting 'obj' to 'String' will produce 'ClassCastException' for any non-null value
//        String str = (String)obj;
    }

    //IndexOutOfBoundsException
    public void test2(){
        //ArrayIndexOutOfBoundsException
//        int[] arr = new int[10];
//        System.out.println(arr[10]);//Array index is out of bounds

//        String str = "abc";
//        //The call to 'charAt' always fails as index is out of bounds
//        System.out.println(str.charAt(3));
    }


    //NullPointerException
    public void test1(){
//        int[] arr = null;
//        System.out.println(arr[1]);//Array access 'arr[1]' will produce 'NullPointerException'

//        String str = "abc";
//        str = null;
//        //Method invocation 'charAt' will produce 'NullPointerException'
//        System.out.println(str.charAt(0));

    }
}
