package com.day02;

/**
 * @author FunnyPrince_
 * @date 2021/3/24 - 21:58
 *
 * 如果从键盘获取不同类型的变量：使用Scanner类
 * 实现步骤：
 * 1.导包： import java.util.Scanner;
 * 2.Scanner的实例化
 * 3.调用Scanner类的相关方法，使用nextInt() / nextDouble() /来获取指定类型的变量
 * 注意：需要根据相应的方法，来输入指定类型的值。如果输入的数据类型与要求的类型不匹配，会报异常。
 * 异常：InputMisMatchException，导致程序终止。
 */
import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        //Scanner的实例化
        Scanner scan = new Scanner(System.in);
       // int num = scan.nextInt();
        System.out.println("请输入姓名：");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入年龄：");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入体重：");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否单身？请选择true or false");
        boolean bl = scan.nextBoolean();
        // System.out.println("bl");  编写错误，输出bl,""表示字符串
        System.out.println(bl);  //表示调用bl

        //对于char型的获取，Scanner没有提供相关方法，只能获取一个字符串
        System.out.println("请输入性别：");
        String gender = scan.next();
        //必须用char输出的话：
        char genderChar = gender.charAt(0); //获取索引为0位置上的字符
        System.out.println(genderChar);









        System.out.println();
    }
}
