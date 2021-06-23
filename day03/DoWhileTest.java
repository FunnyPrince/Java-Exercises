package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/25 - 20:06
 *  *  * 循环结构的4个要素
 *  *  * 1.初始化条件
 *  *  * 2.循环条件  ---boolean类型
 *  *  * 3.循环体
 *  *  * 4.迭代体
 *
 * do-while循环结构：
 * 1
 * do{
 *     3;
 *     4;
 * }while(2);
 * 1--3--4--2--3--4--2---……--2
 *
 * 说明：do-while循环至少会执行一次循环体
 */
public class DoWhileTest {
    public static void main(String[] args) {
        //遍历100以内的偶数,并计算搜有偶数的和及偶数的个数
        int num =1;
        int sum = 0;//记录总和
        int count = 0;//记录个数
        do{
            if(num % 2 == 0){
                System.out.println(num);
                sum += num;
                count++;
            }
            num++;
        }while(num <= 100);
        System.out.println("总和为：" + sum);
        System.out.println("个数为：" + count);

        //*************************************
        //若果多次循环与for() / while()循环无差




    }
}
