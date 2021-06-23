package com.day15;

/**
 * @author FunnyPrince_
 * @date 2021/4/10 - 0:43
 *
 * ➢Error: Java 虚拟机无法解决的严重问题。如: JVM系统内部错误、资源耗尽等严重情况。
比如: StackOverflowError 和OOM。一 般不编写针对性的代码进行处理。
 *

 */
public class ErrorTest {
    public static void main(String[] args) {
        //Exception in thread "main" java.lang.StackOverflowError
        //1.栈溢出
//        main(args);

        //2.堆溢出：java.lang.OutOfMemoryError
//        Integer[] arr = new Integer[1024*1024*1024];//1024*1024*1024个4字节



    }
}
