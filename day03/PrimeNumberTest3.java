package com.day03;

/**
 * @author FunnyPrince_
        * @date 2021/3/25 - 21:47
        ** 100000以内的所有质数的输出,实现方式二
 *  * 质数：素数，只能被1和它本身整除的自然数-->从2开始到i-1结束，都不能被i本整除身
 *  *  最小的质数：2
        * 对PrimeNumberTest的优化
        */
public class PrimeNumberTest3 {
    public static void main(String[] args) {
        int count = 0;

        //获取当前时间距离1970-01-01 00：00:00的毫秒数
        long start = System.currentTimeMillis();

        lable:
        for (int i = 2; i <= 100000; i++) {

            for (int j = 2; j <= Math.sqrt(i); j++) {  //            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue lable;
                }
                //能执行到此步骤的，都是质数
                count++;

            }

            long end = System.currentTimeMillis();
            System.out.println("质数的个数为：" + count);
            System.out.println("所花费的时间为：" + (end - start));

        }
    }
}




