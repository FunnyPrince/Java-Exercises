package com.day04;


/**
 * @author FunnyPrince_
 * @date 2021/3/26 - 19:40
 *数组：
 * >数组名
 * >元素
 * >下标、索引
 * 3.数组的特点：1.有序排列
 *      2.数组属于引用数据类型的变量，数组的元素，可以使基本数据类型，也可以是引用数据类型
 *      3.创建数组会在内存中开辟一块空间
 *      4.数组长度一旦确定，不能修改
 *4.数组的分类：
 *      维数：一维数组、二维、三维
 *      按照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组
 *5.一维数组的使用
 *      1.一维数组的声明和初始化
 *      2.如何调用数组的指定位置的元素
 *      3.如何获取数组的长度
 *      4.如何遍历数组
 *      5数组元素的默认初始化值
 *      6.数组的内存解析
 *
 *
 */
public class ArrayTest {
    public static void main(String[] args) {
        // 1.一维数组的声明和初始化
        int[] ids;//声明
        //1.1静态初始化,数组的初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001,1002,1003,1004};
        //1.2动态初始化：分开进行
        String[] names = new String[5];

        //错误写法:
//        int[] arr = new int[];  无赋值/无长度


        //2.如何调用数组的指定位置的元素:通过索引/下标
        names[0] = "白敬亭";
        names[1] = "小白";
        names[2] = "GoodBai";
//        3.如何获取数组的长度
        //length
        System.out.println(names.length);//5
//        4.如何遍历数组
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

    }



}
