package com.day02;

/**
 * @author FunnyPrince_
 * @date 2021/3/25 - 0:22
 *
 * 从键盘上输入2019年的“month”和“day”，要求通过程序输入的日期为2019年的第几天
 */
import java.util.Scanner;
public class SwitchCaseTest2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入2019年的month:");
        int month = scan.nextInt();

        System.out.println("请输入2019年的day:");
        int day = scan.nextInt();

        int sumDays = 0;

        //解决冗余  倒着写  去掉break 让他继续进下一个
        switch(month) {
            case 12:
                sumDays +=30;
            case 11:
                sumDays +=31;
            case 10:
                sumDays +=30;
            case 9:
                sumDays +=31;
            case 8:
                sumDays +=31;
            case 7:
                sumDays +=30;
            case 6:
                sumDays +=31;
            case 5:
                sumDays +=30;
            case 4:
                sumDays +=31;
            case 3:
                sumDays +=28;
            case 2:
                sumDays +=31;
            case 1:
                sumDays +=31;  //起始为0，所以要+=

        }
        System.out.println("2019年" + month + "月" + day + "天");




    }
}
