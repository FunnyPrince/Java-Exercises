package com.day04;

/**
 * @author FunnyPrince_
 * @date 2021/3/27 - 0:01
 * 使用二维数组打印一个10行 杨辉三角
 * 提示：
 * 1.第一行有1个元素，第n行有n个元素；
 *
 *
 *
 *
 * 1.声明并初始化二维数组
 * 2.给数组的元素赋值
 *3.遍历二维数组
 *
 */
public class ArrayExer2 {
    public static void main(String[] args) {

//        1.声明并初始化二维数组
        int[][] yanghui = new int[10][];
        // 2.给数组的元素赋值
        for(int i = 0; i < yanghui.length; i++){
            yanghui[i] = new int[i + 1];

            //2.1给首末元素赋值
            yanghui[i][0] = yanghui[i][i] = 1; //连续赋值，首末都是1
            //2.2给每行的非首末元素赋值
//            if(i > 1){
                for(int j = 1; j < yanghui[i].length - 1; j++){ //j代表列，假如第2列，
                    // 要获取第i行的列值，就不是i,而是yanghui[i].length
                    //从第二个元素开始，到倒数第二个元素结构， 所以j=1(第二个)-->length-1(倒数第二个)

                    //第i行j列的数字等于上一行(i-1行)中j-1列与j列的和
                    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
                }
//            }  优化：去掉if，当i=0/1本身也进不去for循环，if多余

        }
        //3.遍历二维数组
        for(int i = 0; i < yanghui.length; i++){
            for(int j = 0; j < yanghui[i].length; j++){
                System.out.print(yanghui[i][j] + " ");
            }
            System.out.println();
        }

    }


}
