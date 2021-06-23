package com.day06;

/**
 * @author FunnyPrince_
 * @date 2021/3/28 - 16:11
 */
public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{35,19,67,23,65,56,43,78,89};
        int max = util.getMax(arr);
        System.out.println("最大值为：" + max);

        System.out.println("排序前：" );
        util.print(arr);

        System.out.println();  //或者可以在print()里添加一个换行语句

        System.out.println("排序后：");
        util.sort(arr);   //先排序
        util.print(arr);

        System.out.println();
        System.out.println("查找：");
        int index = util.getIndex(arr, 45);
        if(index >= 0){
            System.out.println("查找的dest的索引地址为："+ index );
        }
        else
            System.out.println("没有找到");

    }
}
