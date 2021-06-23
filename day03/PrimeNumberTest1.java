package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/25 - 21:47
 ** 100000以内的所有质数的输出，实现方式一
 *  * 质数：素数，只能被1和它本身整除的自然数-->从2开始到i-1结束，都不能被i本整除身
 *  *  最小的质数：2
 * 对PrimeNumberTest的优化
 */
public class PrimeNumberTest1 {
    public static void main(String[] args) {

        boolean isFlag = true;
        int count = 0;

        //获取当前时间距离1970-01-01 00：00:00的毫秒数
        long start = System.currentTimeMillis();
        //long start = System.currentTimeMills();  写对方法名啊大哥！！！


        for (int i = 2; i <= 100000; i++) {

             //优化二：对本身是质数的自然数有效   43ms
            for (int j = 2; j <=Math.sqrt(i); j++) {  //            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;//优化一：只对非质数有效，一旦能除尽，就不要往下进行啦
                //优化前：19371ms,优化一:1992ms
                }
                if (isFlag == true) {
//                    System.out.println(i);    消耗时间
                    count++;
                }
                isFlag = true; //else 重置isFlag
            }
//            long end = System.currentTimeMillis();       1
            //System.out.println("所花费的时间为：" + (end- start));      2

        }
        //end 变量与的声明要和调用一致，如果1处的变量在循环内，就在循环内调用
        //在循环外调用，必须在循环外声明！！！不然编译不通过
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("所花费的时间为：" + (end- start));

    }
}




