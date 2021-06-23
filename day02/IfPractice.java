package com.day02;

/**
 * @author FunnyPrince_
 * @date 2021/3/24 - 22:22
 *
 *1. else结构是可选的
 * 2.>如果多个条件表达式之间是“互斥“关系（没有交集），条件前后无所谓
 *   >如果多个条件表达式之间有交集关系，需按顺序声明
 *   >若果多个表达式之间有包含关系，通常，范围小的声明在范围大的前面
 */
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class IfPractice {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        System.out.println("请输入你的成绩：");
        int score = scan.nextInt();

        if(score == 100){
            System.out.println("奖励宝马");
        }else if(score > 80 && score <= 99) {
            //也可以改成else if(score>80),执行完直接跳出循环
            //else if(80 < score < 99)报错，80 < score运算结果为boolean型，Boolean型不可以参与运算
            System.out.println("奖励iphone");
        }else if(score >=60 && score <=80){
            //也可以改成else if(score>=60),执行完直接跳出循环
            System.out.println("奖励ipad");
        }
//        else{
//            System.out.println("无奖励");
//        }
        //可选，可不操作

    }
}
