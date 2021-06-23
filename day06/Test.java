package com.day06;

import java.io.PrintStream;

/**
 * @author FunnyPrince_
 * @date 2021/3/29 - 0:06
 */
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a,b);//需要在method方法被调用后，仅打印出a=100;b=200,写出method方法的代码
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
   //方法一：避免在main()中输出，直接在method()中输出之后exit
/*    public static void method(int a,int b){
        a = a*10;
        b = b*20;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.exit(0);
    }
}*/
//方法二：
    public static void method(int a,int b){
        PrintStream  ps = new PrintStream(System.out){

            public void println(String x){
            if("a=10".equals(x)){
                x = "a = 100";
            }else if("b =10".equals(x)){
                x = "b = 200";
            }
            super.println(x);
        }
        };
        System.setOut(ps);
    }

}