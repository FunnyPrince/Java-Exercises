package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/25 - 20:34
 *
 * 嵌套循环：
 * 1.讲一个循环结构A声明在另一个循环结构B的循环体中
 * 2.外层循环：循环结构B
 *   内层查询：循环结构A
 * 3.说明：
 *   内层循环结构遍历一遍，只相当于外层循环循环体执行了一次
 *   假设外层循环需要执行m次，内层循环需执行n次，此时内层循环执行了多少次？m*n
   4.技巧：外层控制行数，内层控制列数
 */
public class For$ForTest {
    public static void main(String[] args) {
        //******
        //******
        //******
        //******
        for(int j = 1; j < 4; j ++){
            for(int i = 1; i <= 6; i++){
                //System.out.println('*');  换行
                System.out.print('*');//不换行
            }System.out.println();//循环一次换行一次
        }
//        System.out.println();
        /*for(int i = 1; i <= 6; i++){
            //System.out.println('*');  换行
            System.out.print('*');//不换行
        }*/




        //             i(行数)            j(个数)
        //*            1                   1
        //**           2                   2
        //***           3                   3
        //*****         4                   4
        //******        5                 5
        for(int i =1; i <= 5; i++){//控制行数
            for(int j = 1; j <= i; j++){//控制列数
                System.out.print('*');

            }
            System.out.println();

        }




        //****
        //***
        //**
        //*

        for(int i = 1; i <= 6; i++){
            //for(int j = 4; j >= 1; j-- ){    j>=1的时候，每行都是4个，
            for(int j = 4; j >= i; j-- ){
                System.out.print('*');
            }
            System.out.println();
        }




        /*
        ----*----
        ---*-*---
        --*-*-*--
        -*-*-*-*-
        *-*-*-*-*   对于*  * 之间空出来的可以看成是*--*
         * * * *
          * * *
           * *
            *
    */

    }
}
