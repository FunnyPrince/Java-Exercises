package com.company;

/**
 * @author FunnyPrince_
 * @date 2021/3/23 - 19:59
 *
 * 强制类型转换：自动类型提升的逆运算
 * 1.需要使用强转符：()
 * 2.可能导致精度损失
 */
public class VariableTest3 {
    public static void main(String[] args) {
        double d1 = 12.3;
        int i1 = (int)d1;//截断操作，损失精度
        System.out.println(i1);

        //没有精度损失
        long l1 = 123;
        short s2 = (short)l1;

        //精度损失
        int i2 = 128;
        byte b = (byte)i2;
        System.out.println(b);

        //没有加123123l， 默认当成int，赋给long
        long l = 123132;
        //double转成float情况，出错
        //float f1 =12.3;
        //整形常量默认int
        //浮点型常量默认double
    }

}
