package com.day19;

/**
 * @author FunnyPrince_
 * @date 2021/4/15 - 23:54
 * 面试题
 */
public class StringTest1 {
    String str = new String("good");//String不可变
    char[] ch = {'t','e','s','t'};

    public void change(String str,char ch[]){//值传递
        str = "test ok";//改变的是副本
        ch[0] = 'b';//指向堆里的同一个地址
    }

    public static void main(String[] args) {
        StringTest1 ex = new StringTest1();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str);//good
        System.out.println(ex.ch);//best
    }

}
