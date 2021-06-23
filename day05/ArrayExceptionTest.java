package com.day05;

/**
 * @author FunnyPrince_
 * @date 2021/3/27 - 20:45
 * 数组中常见的异常
 * 1.数组角标越界 ArrayIndexOutOfBoundsException
 * 2.空指针异常  NullPointerException
 *
 */
public class ArrayExceptionTest {
    public static void main(String[] args) {
//1.数组角标越界 ArrayIndexOutOfBoundsException
        int[] arr = new int[]{1,2,3,4,5};
//        System.out.println(arr[6]);  /arr[-2]

        //2.空指针异常 NullPointerException
        //情况1：
//        int[] arr1 = new int[]{1,2,3};
////        arr1 = null;
//        System.out.println(arr1[0]);

        //情况2：
//        int[][] arr2 = new int[4][];
//        System.out.println(arr2[0]);//null
//        System.out.println(arr2[0][0]); //空指针

//        //情况3：
//        String[] arr3 = new String[]{"AA", "BB", "CC"};
//        arr3[0] = null;  改为null，或者直接调用null
//        System.out.println(arr3[0].toString());
    }
}
