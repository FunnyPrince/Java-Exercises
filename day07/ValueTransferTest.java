package com.day07;

/**
 * @author FunnyPrince_
 * @date 2021/3/29 - 20:49
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        String s1= "hello";
        ValueTransferTest test = new ValueTransferTest();
        test.change(s1);
        System.out.println(s1); //输出“hello”，因为执行完change()之后就销毁了
//        System.out.println(test.change(s1));错误，因为change()是void型，不传递值
    }
    public void change(String s){
        s = "hi";
    }
}
