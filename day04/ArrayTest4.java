package com.day04;

/**
 * @author FunnyPrince_
 * @date 2021/3/27 - 0:34
 * 算法的考察：求数值型数组中元素的最大值、最小值、平均值、总和等；
 *
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
 * 然后求出所有元素的最大值、最小值、和值、平均值，并输出出来
 * 要求：所有随机数都是两位数
 * [10,99]
 * 公式：(int)(Math.random()*(99-10+1) + 10);
 */
public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr =new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*(99-10+1) + 10);
//两位数
        }
        //遍历
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();


        //求数组元素最大值
//        int maxValue = 0;
        int maxValue = arr[0];//随便写一个赋值给最大值，然后后面的用它比较
        //maxValue初始为arr[0],所以循环开始从arr[1]开始
        for(int i = 1; i < arr.length;i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println("最大值为：" + maxValue);

        //求数组元素最小值
        int minValue = arr[0];
        //maxValue初始为arr[0],所以循环开始从arr[1]开始
        for(int i = 1; i < arr.length;i++) {
            if (minValue > arr[i]) {  //复制过来 要记得改成  >
                minValue = arr[i];
            }
        }
        System.out.println("最小值为：" + minValue);


        //求数组元素的总和
        int sum = 0;
        for(int i =0;i < arr.length;i++){
            sum += arr[i];  //arr[i] 求的是数组元素的总和！！！
        }
        System.out.println("总和为：" + sum);


        //求数组元素的平均数
//        int avgValue = sum / arr[i].length;   是数组的长度，不是每一个数组元素的长度
          int avgValue = sum / arr.length;
        System.out.println("平均数为： "+ avgValue);

    }
}
