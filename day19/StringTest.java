package com.day19;

import org.junit.jupiter.api.Test;

/**
 * @author FunnyPrince_
 * @date 2021/4/15 - 22:44
 *
 * String的使用:

 *
 * 面试题：String s = new String("abc");方式创建对象，在内存中创建了几个对象？
 * 两个。一个是堆空间中new结构，另一个是char[]对应的常量池中的数据"abc"
 *
 * 面试题--》指路StringTest1
 */
public class StringTest {
/*
结论：1.常量与常量的拼接结果在常量池。且常量池中不会存在相同内容的常量。
2.只要其中有一一个是变量，结果就在堆中。
3.如果拼接的结果调用intern()，返回值就在常量池中。
 */
    @Test
    public void test3(){
        String s1 = "javaEE";
        String s2 = "hadoop";
        String s3 = "javaEEhadoop";
        final String s4 = "javaEE";//s4:常量


        String s5 = "javaEE"+"hadoop";
        String s6 = s1 + "hadoop";
        String s7 = "javaEE" + s2;
        String s8 = s1 + s2;
        String s9 = s4 + "hadoop";

        //==看地址
        System.out.println(s3==s5);//true,自变量连接，都在常量池
        System.out.println(s3==s6);//false，赋值时有变量名参与，都不是在常量池，在堆空间中，相当于new
        System.out.println(s3==s7);//false
        System.out.println(s3 == s8);//false
        System.out.println(s5==s7);//false
        System.out.println(s5==s8);//false
        System.out.println(s6==s8);//false
        System.out.println(s3 == s9);//true

        String s = s8.intern();//返回值得到的s使用的常量池中已经存在"javaEEhadoop"
        System.out.println(s3 == s);//true
    }


/*String的实例化方式：
方式一：通过字面量定义的方式
方式二：通过new+构造器
*/
    @Test
    public void test2(){
        //通过字面量定义的方式:s1,s2的数据javaEE声明在方法区中
        String s1 = "javaEE";
        String s2 = "javaEE";

        //通过new+构造器:此时的s3,s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1==s2);//true,==比较地址
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//false
        System.out.println(s3==s4);//false

    }
    //String的使用
    /*
     * String：使用一对""表示
     * 1.String 声明为final的，不可被继承
     * 2.String实现了Serializable接口：表示字符串是支持序列化的。
     *         实现了Comparable接口：表示String可以比较大小
     * 3.String内部定义了final char[] value用于存储字符串数据
     * 4.String：代表一个不可变的字符序列。简称：不可变性。
     *     体现：1).当对字符串重新赋值时，需要重写指定内存区域赋值，不能使用原有的value进行赋值。
     *          2).当对现有的字符串进行连接操作时，也需要重写指定内存区域赋值，不能使用原有的value进行赋值。
     *          3).当调用String的replace()方法修改指定的字符/字符串时，也必须重写指定内存区域赋值，不能使用原有的value进行赋值。
     * 5.通过字面量的方式（区别于new）给一个字符串赋值，此时的字符串值声明在字符串常量池中
     * 6.字符串常量池中不会存储相同内容的字符串(使用String类的equals()比较)。
     */
    @Test
    public void test1(){
        String s1 = "abc";//字面量的定义方式,不用new，value=3，value不可变
        String s2 = "abc";//内容相同，字符串常量池中同一个字符串对象
//        s1 = "hello";//value=5，新造一个

        System.out.println(s1==s2);//比较s1和s2 的地址值

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("***********************");

        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);
        System.out.println(s2);

        String s4 = "abc";
        String s5 = s4.replace('a','m');
        String s6 = s5.replace("mb","mm");
        System.out.println(s4);//abc
        System.out.println(s5);//mbc数组长度没变
        System.out.println(s6);

        System.out.println("****************");

        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Tom", 12);

        System.out.println(p1.equals(p2.name));//p1的地址和p2的name false
        System.out.println(p1.name.equals(p2.name));//true,重写了toString(),只比较内容
        System.out.println(p1.name == p2.name);//true


    }
}
