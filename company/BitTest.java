package com.company;

/**
 * @author FunnyPrince_
 * @date 2021/3/23 - 23:29
 *
 * 位运算符
 * 1.操作的都是整形的数据
 * 2.<< : 在一定范围内，每向左移一位，相当于*2
 *   >> : 在一定范围内，每向右移一位，相当于/2（最高位是00，补00，最高位是11，补11
 *
 *   >>> : 无符号右移
 */
public class BitTest {
    public static void main(String[] args) {
        int i = 21;
        //(i<<2)需加(), 不加的话它会认为是连接，连接起来是String，不能左移
        System.out.println("i << 2: " + (i<<2));
        System.out.println("i << 3: " + (i<<3));
        System.out.println("i << 26: " + (i<<26));
        System.out.println("i << 27: " + (i<<27));


        //面试题：最搞笑的方式计算2*8?
       // 2 << 3   /    8 << 1

        int m = 5;
        int n = 3;
        System.out.println("m & n : " + (m & n));
        System.out.println("m | n : " + (m | n));
        System.out.println("m ^ n : " + (m ^ n));

        //practice1:交换两个变量的值
        //1.定义临时变量的方式     推荐！
        int i1 = 10;
        int i2 = 20;
        System.out.println("交换前i1 = " + i1 + ", i2 = " + i2);
//        int temp = i1;
//        i1 = i2;
//        i2 = temp;
//        System.out.println("交换后i1 = " + i1  + ", i2 = " +i2);


        //2.小岛上两个人交换位置
        //好处：不用定义临时变量节省空间，不用开辟新空间
        //弊端：1.相加操作可能超出存储范围 2. 有局限性（只能适用于数值类型
        i1 = i1 + i2;
        i2 = i1 - i2;
        i1 = i1 - i2;
        System.out.println("交换后i1 = " + i1  + ", i2 = " +i2);

        /*//3.使用位运算符
        k和谁异或 ^ 就等于另一个
        i1 = i1 ^ i2;  //1.
        i2 = i1 ^ i2;  //2.  异或 ^ 后，i1^i2后再^i2结果是i1  赋值给i2
        i1 = i1 ^ i2;//3.  此时i1 还是1处的值，i2是2处的值（原本的i1), ^ 之后就是i2原本的值，再赋值给i1
        */




    }
}
