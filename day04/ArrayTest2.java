package com.day04;

/**
 * @author FunnyPrince_
 * @date 2021/3/26 - 21:49
 *  *      1.二维数组的声明和初始化
 *  *      2.如何调用数组的指定位置的元素
 *  *      3.如何获取数组的长度
 *  *      4.如何遍历数组
 *  *      5数组元素的默认初始化值
 *  *      6.数组的内存解析
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        // 1.二维数组的声明和初始化
        //静态初始化
        int[][] arr = new int[][]{{1,2,3,},{4,5},{6,7,8}};
        //动态初始化1
        String[][] arr1 = new String[3][2];//外层三个，每个都有2个
        //动态初始化2
        String[][] arr2 = new String[3][];//外层

        //正确,省略及[][]分开写，但不可一前一后，但不标准
        int[] arr3 = {1,2,3,4,5};  //类型推断
        int[] arr4[] = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};
        int[] arr5[] = {{1, 2, 3}, {4, 5}, {6, 7, 8}};

//2.如何调用数组的指定位置的元素
        System.out.println(arr[0][1]);//2
        System.out.println(arr1[1][1]);//null
    //    System.out.println(arr2[1][0]);//空指针异常，没有赋值
        arr2[1] = new String[4];//相当于arr2的外层的下标为1即第2个开辟了4个空间
        System.out.println(arr2[1][0]);

//        3.如何获取数组的长度
        System.out.println(arr4.length);//3  arr4的长度与底层一维数组无关
        System.out.println(arr4[0].length);//2  arr4第一个元素的底层数组元素长度

//        4.如何遍历数组
        for(int i = 0; i < arr4.length; i++){
            for(int j = 0; j < arr4[i].length; j++){
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }

}
