package com.day06;

import java.util.Arrays;

/**
 * @author FunnyPrince_
 * @date 2021/3/28 - 23:10
 */
public class ArrayPrintTest {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3};
        System.out.println(arr);// 地址值:[I@4554617c
//       相当于： System.out.println(Arrays.toString(arr));
        //int[]调用的是Object类型

        char[] arr1 = new char[]{'a','b','c'};
        System.out.println(arr1); //abc
        //char[]的方法体就是遍历该数组
    }
}
