package com.company;

/**
 * @author FunnyPrince_
 * @date 2021/3/23 - 21:11
 */
public class ArrayTest {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
        int result1 = num1 / num2;
        System.out.println(result1);

        int result2 = num1 / num2 *num2;
        System.out.println(result2);
        //num1/num2=int,再将2赋值给double=2.0
        double result3 = num1 / num2;
        System.out.println(result3);

        double result4 = num1 / num2 +0.0;
        double result5 = num1 / (num2 +0.0); //2.4
        double result6 = (double)num1 / num2;
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);


        //%:取余运算
        //结果的符号与被模数的符号相同
        //开发中，经常使用%来判断能否被除尽的情况
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1%n1=" + m1%n1);

        int m2 = -12;
        System.out.println("m2%n1=" + m2%n1);

        int n3 = -5;
        System.out.println("m1%n3=" + m1%n3);

        System.out.println("m2%n3=" + m2%n3);


        /*
      后++就后+：      x++:先运算再自增
      前++就先+：     ++x:先自增再运算


        */
        int a1 = 10;
        int b1 = a1++;
        System.out.println("a1 = " + a1 + ",b1 = "+b1);

        int a2 = 10;
        int b2 = ++a2;
        System.out.println("a2 = "+ a2 +",b2 = " + b2);
        //tips:
        short s1 = 10;
       // s1 = s1 + 1;  错误
        s1 = (short)(s1 + 1);
       //或者 s1++; 自增不会改变本身变量的数据类型

        byte b3 = 127;
        b3++;//byte高位是符号位
        System.out.println("b3 = " + b3);// 127+1= -128




    }
}
