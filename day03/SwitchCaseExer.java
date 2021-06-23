package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/25 - 12:34
 * 从键盘输入年、月、日，判断这一天是当年的第几天
 *注：判断一年是否是闰年的标准：
 *      1.可以被4整除，但不可以被100整除
 *      或2.可以被400整除
 *
 * 说明：1.凡是可以使用switch-case的结构，都可以转换为if-else，反之不成立；
 *      2.当使用分支结构时，if-else/switch-case都可以使用，且switch中表达式的取值不多时，优先选择switch-case
 *      switch-case执行效率稍高
 *
 */
import java.util.Scanner;
public class SwitchCaseExer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入year:");
        int year = scan.nextInt();

        System.out.println("请输入month:");
        int month = scan.nextInt();

        System.out.println("请输入day:");
        int day = scan.nextInt();


        //设置总天数
        int sumDays = 0;

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
               // sumDays +=28;
                //判断year是否是闰年
                if((year % 4 ==0 && year % 100 !=0) || year % 400 ==0) {
                    sumDays += 29;
                }else sumDays += 28;
            case 2:
                sumDays +=31;
            case 1:
                sumDays +=31;  //起始为0，所以要+=
    }
        System.out.println(year + "年的" + month + "月" + day + "日是当年的第" + sumDays + "天");
}



    }
