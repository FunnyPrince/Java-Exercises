package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/25 - 19:18
 * 编写程序从1循环到150，并在每行打印一个值
 * 另外在每个3的倍数行上打印“3的倍数
 * 在每个5的倍数上打印“5的倍数
 * 在每个7的倍数上打出“7的倍数
 */
public class ForTest1 {
    public static void main(String[] args) {
        for(int i = 1; i < 150; i++){
            System.out.println(i + " ");
            if(i % 3 == 0){
                System.out.println("3的倍数");
            }
            if(i % 5 == 0){
                System.out.println("5的倍数");
            }
            if(i % 7 ==0){
                System.out.println("7的倍数");
            }
            //换行
            System.out.println();



        }


    }
}
