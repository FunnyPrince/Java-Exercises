package com.day04;

import jdk.management.resource.ResourceType;

/**
 * @author FunnyPrince_
 * @date 2021/3/26 - 20:09
 *
 *
 * 5.数组元素的默认初始化值
 *       >数组元素是整型：0
 *       >数组元素是浮点型：0.0
 *       >数组元素是char型：0\'u0000' 不是 '0'
 *         'a'-->97, 'A'-->65, '0'-->x, 'y'-->0(指的是这个0)
 *       > 数组元素时boolean型，false 0/true 1
 *       >数组元素时引用数据类型时,null
 *
 * 6.数组的内存解析
 */
public class ArrayTest1 {
    public static void main(String[] args) {
//         5. 数组元素的默认初始化值
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        short[] arr = new int[1];  main()中已经定义了,并且int无法转换为short
        short[] arr1 = new short[1];
            System.out.println(arr1[0]);
        System.out.println("********************");

        float[] arr2 = new float[3];
        for(int i = 0; i < arr2.length; i++ ){
            System.out.println(arr2[i]);
        }
        System.out.println("********************");

        char[] arr3 = new char[4];
        for(int i = 0;i < arr3.length; i++){
            System.out.println("---char[0]可能是空格" + arr3[i] + "**");
        }
        boolean[] arr4 = new boolean[5];  //不能用动态赋值
        System.out.println(arr4[0]);

        System.out.println("********************");
        String[] arr5 = new String[5];
        System.out.println(arr5[0]);
        if(arr5[0] == null){
            System.out.println("null");
        }




    }
}
