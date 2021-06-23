package com.day05;

import java.util.Arrays;

/**
 * @author FunnyPrince_
 * @date 2021/3/27 - 20:26
 *java.util.Arrays:操作数组的工具类，定义了很多数组的方法
 *
 *
 */
public class ArraysTest {
    public static void main(String[] args) {
        //1.boolean equals(int[] a,int[] b):判断两个数组是否相等
        int[] arr1 = new int[] {1,2,3,5};
        int[] arr2 = new int[] {1,4,3,5};
        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println(isEquals);

        //2.String toString(int[] a):输出数组信息
        System.out.println(Arrays.toString(arr1));

        //3.void fill(int[] a,int val):将指定值填充到数组中
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        //4.void sort(int[] a):对数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


        //5.int binarySearch(int[] a,int key)
//        int[] arr3 = new int[] {78,89,45,78,15,26,65,94};  不可以是因为没排序
        int[] arr3 = new int[] {12,23,56,65,78,89,97};
//        int index = Arrays.binarySearch(arr3,26);
    // index表示索引，不是值,但是key是值，表示查找该key所在的索引号
        int index = Arrays.binarySearch(arr3,56);
        if(index >=0){
        System.out.println(index);
        }else{
            System.out.println("没找到");
        }


    }
}
