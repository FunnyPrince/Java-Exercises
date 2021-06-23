package com.company;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

/**
 * @author FunnyPrince_
 * @date 2021/3/23 - 19:18
 * 7种基本数据类型之间的运算类型，不包含boolean
 * 容量小的和容量大的数据类型的变量做运算时，结果子欧方提升为容量大的数据类型
 * 容量大小是指表示数的范围的大小
 * 1.自动类型提升：byte/char/short--->int-->long-->float-->double
 * 当byte/char/short三中类型的变量做运算时，结果为int
 * 2.强制类型转换：见VariableTest3
 *
 */
public class VariableTest2 {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 12;
        int i2 = b1 + i1;
        float f1 = b1 + i1;
        long l1 = b1 + i1;
//**********************************
        char c1 = 'a';
        int i3 = 10;
        //最小得用int接收
        int i4 = c1 + i3;

        short s2 = 12;
        //short与char做运算，用int
        int i5 = c1 + s2;
        //char与byte 也用int
        System.out.println(i2);
        System.out.println(f1);
        System.out.println(i4);

    }
}
