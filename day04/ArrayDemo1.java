package com.day04;

/**
 * @author FunnyPrince_
 * @date 2021/3/26 - 21:00
 *
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级，
 *      成绩>=最高分-10   等级为'A'
 *      成绩>=最高分-20   等级为'B'
 *      成绩>=最高分-30   等级为'C'
 *      其余             等级为'C'
 *
 *      提示：先读入学生人数，根据人数创建int数组，存放学生成绩
 *      1.使用Scanner读取学生个数
 *      2.创建数组，存储学生成绩，动态初始化
 *      3.给数组中的元素赋值        这步卡住了!
 *      4.获取数组中的最大值：最高分
 *      5.根据学生成绩与组高分的差值得到每个学生的等级
 */
import java.util.Scanner;
public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生个数：");
        int num = scan.nextInt();

//        System.out.println("请输入" + num + "个学生的成绩：");
        //double[] score = double[num];
      //2.创建数组，存储学生成绩，动态初始化
        int[] score = new int[num];
        //3.给数组中的元素赋值
        System.out.println("请输入" + num + "个学生的成绩：");
        int maxScore = 0;
        for(int i = 0; i < score.length; i++){
           //读一个附一个值
            score[i] = scan.nextInt();
            //4. 可以放在一个循环里
            if(maxScore < score[i]){
             maxScore = score[i];
            }
        }

        //4.获取数组中的最大值：最高分
    /*    int maxScore = 0;
        for(int i = 0; i < score.length; i++){
            if(maxScore < score[i]){
                maxScore = score[i];
            }
        }
*/
        //5.根据学生成绩与组高分的差值得到每个学生的等级
        char level;
        for(int i = 0;i < score.length; i++ ){
            if(maxScore - score[i] <= 10){
//                System.out.println("等级为：A" );  或者给level赋值
                level = 'A';
            }else if(maxScore - score[i] <= 20){
                level = 'B';
            }else if(maxScore - score[i] <= 30){
                level = 'C';
            }else{
                level = 'D';
//                break;   不能break，直接退出循环，不会走下面的语句
            }
            System.out.println("student" + i + "score is "
                    + score[i] + ", grade is" + level);
        }
//        System.out.println("student" + i + "");





    }
}
