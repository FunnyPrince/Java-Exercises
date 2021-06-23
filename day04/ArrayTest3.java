package com.day04;

/**
 * @author FunnyPrince_
 * @date 2021/3/26 - 22:51
 * 规定：二维数组分为外层数组的元素，内层数组的元素
 * int[][] arr = new int[4][3];
 * 外层元素：arr[0], arr[1]……
 * 内层元素：arr[0][0], arr[0][1]……
 *
 * 5数组元素的默认初始化值
 *      >针对于初始化方式一：int[][] arr = new int[4][3];
 *        外层元素的初始化值为：地址值
 *        内层元素的初始化值：与一维数组初始化情况相同
 *      >针对于初始化方式二：double[][] arr2 = new double[4][]；
 *          外层元素的初始化值为：null，这个不是空指针，，指针指向的地址没有值
 *  *        内层元素的初始化值：不能调用，否则空指针异常   ，，指针没有初始化代表指针没有指向任何东西，为空
 * 6.数组的内存解析
 *
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        System.out.println(arr[0]);  //一维地址   [I@4554617c
        System.out.println(arr[0][0]);//0
        System.out.println(arr);  //二维地址   [[I@74a14482


        System.out.println("********String***********");
        String[][] arr1 = new String[4][2];
        System.out.println(arr1[1]); //地址值  [Ljava.lang.String;@1540e19d
        System.out.println(arr1[1][1]); //null  指向null


        System.out.println("*******double*************");
        double[][] arr2 = new double[4][];//只给栈内存初始化了，指向堆内存中一维数组，一维数组并没有初始化
        System.out.println(arr2[1]); //null  内层是个一维数组，没有初始化，指向的位置默认为null
//        System.out.println(arr2[0][0]);//空指针异常  NullPointerException

    }
}
