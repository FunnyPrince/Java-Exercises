package com.day12;

/**
 * @author FunnyPrince_
 * @date 2021/4/6 - 21:07
 *
 * 关于包装类使用的面试题：
 *
 */
public class InterViewTest {
    public static void main(String[] args) {
        InterViewTest test = new InterViewTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1(){
        //编译的时候，与true无关，三元运算符得是相同类型，所以Integer会自动类型提升
        Object o1 = true?new Integer(1) : new Double(2.0);
        System.out.println(o1);//1.0

    }
    //不要求同一类型
    public void test2(){
        Object o2;
        if(true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);//1
    }

    //
    public void test3(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false 引用类型比地址
        //println()的时候，除了char[]输出的是值，其他都是地址

        Integer m = 1;
        Integer n = 1;//自动装箱
        System.out.println(m == n);//true

        //Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[],
        //保存了-128~127范围内的整数。如果使用自动装箱的方式，给Integer赋值的范围在
        //-128~127范围内，可以直接使用数组中的元素，不用new，但如果超过就得new
        //目的：提高效率
        Integer x = 128;///相当于new了一个Integer对象
        Integer y = 128;//相当于new了另一个Integer对象
        System.out.println(x == y);//false
    }

}
