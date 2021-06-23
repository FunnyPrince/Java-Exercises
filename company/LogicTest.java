package com.company;

/**
 * @author FunnyPrince_
 * @date 2021/3/23 - 22:55
 * 逻辑运算符操作都是boolean类型的变量
 * &   &&  |  ||  ^
 */
public class LogicTest {
    public static void main(String[] args) {
        //区分&   &&
        //1.运算结果相同
        //2.当符号左边时true时，都会执行右边的运算
        //3.当符号左边为false是，&会执行右边，&&不会   推开发中荐使用&&
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        //无论b1 true/false 都会执行后面的(num1++)
        if(b1 & (num1++ >0)){
            System.out.println("两个都为真");
        }
        else{
            System.out.println("即使b1为false，我也会执行后面");
        }
        System.out.println("num1= " +num1);

        boolean b2 = true;  //前后都true才会true
        b2 = false;
        int num2 = 10;
        //短路与&& 表示，b2为true时，执行后面的(num2++),
        //b2 为false，则短路，不执行后面
        if(b2 && (num2++ >0)){
            System.out.println("两个都为真");
        }
        else{
            System.out.println("当b2为false时，我就短路啦，不走啦");
        }
        System.out.println("num2= " + num2);


        //***************************
        System.out.println("******************************");
        //区分|   ||
        //1.运算结果相同
        //2.当符号左边时false时，都会执行右边的运算
        //3.当符号左边为true是，|会执行右边，||不会  开发中推荐使用||

        boolean b3 = false;
        b3 = true;
        int num3 = 10;
        if(b3 | (num3++ >0)){
            System.out.println("执行|时，任意一边为true就执行我");
        }
        else{
            System.out.println("两边都false");
        }
        System.out.println("num3= " + num3);

        boolean b4 = false;
        b4 = true;
        int num4 = 10;
        if(b4 || (num4++ >0)){
            System.out.println("执行||时，任意一边为true就执行我");
        }
        else{
            System.out.println("两边都false");}
        System.out.println("num4= " + num4);

    }
}
