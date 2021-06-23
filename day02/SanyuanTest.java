package com.day02;

/**
 * @author FunnyPrince_
 * @date 2021/3/24 - 20:30
 *
 * 三元运算符
 * 结构： （条件表达式）？表达式1 ： 表达式2
 * 1.条件表达式的结果为boolean类型
 * 2.如果条件为true，执行1， false执行2
 *3.表达式1 和表达式2 要求是一致的
 * 4. 三元运算符可以嵌套使用
 * 5.三元运算符可以改写为if-else
 * if-else不一定可以改写成三元运算符
 * 三元运算符与if-else之间可以选择三元运算符，简洁、效率高
 */
public class SanyuanTest {
    public static void main(String[] args) {
        //获取两个整数的较大值
        int m = 12;
        int n = 5;
// m, n 要是同样的类型， num可以不一样
        int max = (m > n)? m : n;

        System.out.println(max);

        //***************

        String maxStr = (m > n)? "m比n大" : ((m==n)? "m=n" : "n大于m");
        System.out.println(maxStr);
//获取三个数的最大值
        int i1 = 12;
        int i2 = 30;
        int i3 = -56;
        int max1 = (i1 > i2)?i1 : i2;
        int max2 = (max1 > i3)?max1  : i3;

        System.out.println("i1,i2,i3中最大的数为" + max2);

        int max3 = (i1 > i2)? i1 : ((i2 > i3)? i2 : i3 );
        System.out.println(max3);
    }


}
