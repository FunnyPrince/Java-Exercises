package com.day04;

/**
 * @author FunnyPrince_
 * @date 2021/3/27 - 0:56
 *
 * 使用简单数组
 * 1.创建一个名为ArrayExer3的类，在main方法中声明array1和array2两个变量，他们是int[]类型数组
 * 2.使用{},吧array1初始化为8个素数；2,3,5,7,11,13,17,19
 * 3.显示array1的内容；
 * 4.赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值(如array[2]=2,arrasy[0]=0),打印出array1
 *
 *
 * 思考：array1和array2是什么关系？
 * 扩展：修改题目，实现array2对array1数组的复制
 */
public class ArrayExer3 {
    public static void main(String[] args) {
        int[] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};

        //显示array1的内容
        for(int i = 0;i< array1.length;i++){
            System.out.print(array1[i] + " ");
        }


        //赋值array2变量等于array1，
        //不能称作数组复制，复制！
        array2 = array1;   //将array1的地址赋给array2，两个指向同一个地址

        //修改array2中的偶索引元素,使其等于索引值(如array[2]=2,arrasy[0]=0),打印出array1
        for(int i = 0;i < array2.length;i++){
            if(i % 2 ==0){   //偶索引
                array2[i] = i;
            }
        }
        System.out.println();

        //打印出array1
        for(int i = 0;i < array1.length;i++){
        System.out.print(array1[i] + " ");
        }


/*        2 3 5 7 11 13 17 19   原先的array1
        0 3 2 7 4 13 6 19*/
        // 之后的array1,且array1与array2的值相同，因为指向同一块地址
        //new一次，就有一个数组，总共new一次array1，所以array2改的也是array1
    }
}
