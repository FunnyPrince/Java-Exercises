package com.day02;

/**
 * @author FunnyPrince_
 * @date 2021/3/24 - 23:37
 */
import java.util.Scanner;
public class IfTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的身高：");
        int height = scan.nextInt();
        System.out.println("请输入你的财富：");
        double wealth = scan.nextDouble();
        //System.out.println("您觉得您帅吗？请输入true/false:");
        System.out.println("您觉得您帅吗？请输入是/否:");
        //方法2：
        String isHandsome = scan.next();
        //方法1：
        //boolean isHandsome = scan.nextBoolean();

       // if(height >= 180 && wealth >1 && isHandsome = true ){   等于==
        //if(height >= 180 && wealth >1 && isHandsome == true ){  ==true可删掉，也表示true
        /*if(height >= 180 && wealth >1 && isHandsome){
            System.out.println("真不错");
        }else if(height >= 180 || wealth >1 || isHandsome){
            System.out.println("emmm也还行吧");
        }else
            System.out.println("一个都不满足");*/


        //  &&逻辑运算符，必须都是boolean型      String类型不可以，  .equals()方法判断字符串是否相等
        if(height >= 180 && wealth >1 && isHandsome.equals("是")){
            System.out.println("真不错");
        }else if(height >= 180 || wealth >1 || isHandsome.equals("是")){
            System.out.println("emmm也还行吧");
        }else
            System.out.println("一个都不满足");
    }
}
