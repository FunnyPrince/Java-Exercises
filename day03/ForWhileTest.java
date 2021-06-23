package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/25 - 20:17
 *
 * 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0结束程序
说明：1.不在循环条件部分限制次数的结构，for(;;)  / while(true)
 2.结束循环的方式：  1. 循环条件部分返回false；
                2.在循环体重执行break
 */
import java.util.Scanner;
public class ForWhileTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int positiveNumber = 0;//记录正数个数
        int negativeNumber = 0;//记录负数个数/

        //while()为iboolean型，true进入循环体，false不进入
        System.out.println("请输入数字，并以0结束：");//在此只是提示输入，只提示一次
        //for(;;){  等于while(true)  }
        while(true) {
           //System.out.println("请输入数字，并以0结束：");在循环里会一直执行
            int number = scan.nextInt();
            //判断正负
            if(number > 0){
                positiveNumber++;
            }
            else if(number < 0){
                negativeNumber++;
            }else{
                break;//一旦执行break，跳出循环
            }


        }
        System.out.println("输入的正数个数为：" + positiveNumber);
        System.out.println("输入的负数个数为：" + negativeNumber);

    }
}
