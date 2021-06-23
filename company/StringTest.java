package com.company;

/**
 * @author FunnyPrince_
 * @date 2021/3/23 - 20:09
 * 1.String属于引用数据类型，
 * 2.声明String类型变量时，使用一对""
 * 3.String可以和８种数据理性做运算，连接　+
 * 4.运算结果还是String类型　
 *
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "hih哈哈哈";
        int number = 1001;
        String numberStr = "你好";
        String  info = numberStr + number; //连接运算
        boolean b1 = true;
        String info1 = info + b1;


        System.out.println(s1);
        System.out.println(info1);



        //********************练习
        char c = 'a'; //a:97  A:65
        int num = 10;
        String str = "你是人间理想";
        //c是char，num是int，先做加法，再做连接
        System.out.println(c + num + str);//107hello
        System.out.println(c + str + num); //ahello
        System.out.println((c + num) + str);
        System.out.println(str + num + c);

        //练习2*************
        // * *
        System.out.println("*   *");
        //'*'：char, '\t':char,做加法运算，等于int
        System.out.println('*' + '\t' + '*');
        //char + String = String,连接
        System.out.println('*' + "\t" + '*');
        //先加法后连接
        System.out.println('*' + '\t' + "*");
        //String + char = String,连接
        System.out.println('*' + ('\t' + "*"));
//*******************************************
        String str1 = 132 + "";
        System.out.println(str1);

        //String不可直接用(int)强转
//        int num1 = str1;
//        int num1 = (int)str1;

        //强转用Integer
       int num1 =  Integer.parseInt(str1);
        System.out.println(num1);


    }
}
