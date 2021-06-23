package com.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author FunnyPrince_
 * @date 2021/4/10 - 1:25
 * 一、异常处理：抓抛模型
 *
 * 过程一：“抛”：程序在正常执行过程中，一旦出现异常，就会在异常代码处生成一个对应异常的对象并将此对象抛出。
 *              一旦抛出对象以后，其后的代码就不再执行。day17.StudentTest/day14.ComparableCircle
 *
 *       关于异常对象的产生：①系统自动生成的异常对象
 *                        ②手动的生成一个异常对象，并抛出throw
 *
 * 过程二：“抓”：异常的处理方式：①。try-catch-finally  ②throws
 *
 * 二、try-catch-finally 的使用
 * try{
 *     //可能会出现异常的代码
 *
 * }catch(异常类型1 变量名1){
 *     //处理异常的方式1
 * }catch(异常类型2 变量名2){
 *        //处理异常的方式2
 *   }
 *  ...
 *  finally{
 *      //一定会执行的代码
 *  }
 *  说明：1.finally是可选的
 *      2.使用try将可能会出现异常的代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常的对象，
 *      根据此对象的类型，去catch中进行匹配
 *      3.一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理。
 *      一旦处理完成，就跳出当前的try-catch结构（在没有写finally的情况下）。继续执行后面的代码
 *      4.catch中的异常类型如果没有子父类关系，谁先声明无所谓
 *      catch中的异常类型如果满足子父类关系，则要求子类一定声明在父类上面。否则，报错
 *      5.常用的异常对象处理的方式：①String getMessage():  ②printStackATrace():
 *      6.在try结构中声明的变量，出了try结构之后，就不能被调用；可以在try外面先声明，在try内部使用
 *       *      7.try-catch-finally结构可以嵌套（指路day16 FinallyTest
 *
 *    体会1：使用try-catch-finally处理编译时异常，使得编译时不再报错，但运行时可能会出错
 * 相当于将一个编译时可能出现的异常，延迟到运行时出现。
 *
 *    体会2：开发中，由于运行时异常比较常见，所以我们通常不针对运行时异常编写try-catch-finally
 *    针对编译时异常，一定要考虑异常处理
 *
 *    finally在day16.FinallyTest
 *    throws在day17.ExceptionTest2
 */
public class ExceptionTest1 {
    public static void main(String[] args) {


        //*********************************************************
        String str = "123";
        str = "abc";

        //声明在外面
        int num = 0;
        try {
//            int num = Integer.parseInt(str);
            //里面使用
            num = Integer.parseInt(str);

            System.out.println("-----1");
        } catch (NumberFormatException e) {
//            System.out.println("出现数制转换异常");
            //String getMessage():
            System.out.println(e.getMessage());
            //printStackATrace():
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("出现空指针异常");
        } catch (Exception e) {
            System.out.println("Exception父类放后面");
        }
        System.out.println(num);//try结构里的不能调用
        System.out.println("-----2");
    }

    public void test2() {
        //异常处理在ExceptionTest1里
        try {
            File file = new File("hello.txt");
            FileInputStream fis = new FileInputStream(file);
            int data = fis.read();
            while (data != -1) {
                System.out.println((char) data);
                //Unhandled exception: java.io.IOException
                data = fis.read();
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}