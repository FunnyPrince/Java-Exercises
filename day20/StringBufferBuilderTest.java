package com.day20;

import org.junit.jupiter.api.Test;

/**
 * @author FunnyPrince_
 * @date 2021/4/18 - 11:23
 *
 * 关于StringBuffer与StringBuilder的使用
 */
public class StringBufferBuilderTest {
    //对比String、StringBuffer、StringBuilder三者的效率：
//    从高到低排列：StringBuilder > StringBuffer > String

    @Test
    public void test3(){
       //初始设置
       long startTime = 0L;
       long endTime = 0L;
       String text = "";
       StringBuffer buffer = new StringBuffer("");
       StringBuilder builder = new StringBuilder("");

       //开始对比
        //StringBuffer时间：
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间为：" + (endTime - startTime));

        //StringBuilder时间：
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间为：" + (endTime - startTime));

        //String时间：
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间为：" + (endTime - startTime));
    }


    /*
    StringBuffer的常用方法:
    注：涉及到开始于结束位置的，都是左闭右开[start,end)
    StringBuffer append(xxx): 提供了很多的append()方法，用于进行字符摩拼接
    StringBuffer delete(int start, int end): 删除指定位置的内容,[start,end)
    StringBuffer replace(int start, int end, String str):把[start, end)位置替换为str
    StringBuffer insert(int offset, xxx): 在指定位置插入xxx
    StringBuffer reverse() :把当前字符序列逆转
    public int indexOf(String str)
    public String substring(int start, int end):返回[start,end)区间的子字符串，不是切割当前字符串，所以得需要返回值
    public int length()
    public char charAt(int n)
    public void setCharAt(int n ,char ch)

        总结：
        增：append(xxx)
        删：delete(int start, int end)
        改：setCharAt(int n ,char ch) / replace(int start, int end, String str)
        查：charAt(int n)
        插：insert(int offset, xxx)
        长度：length()
        遍历：for + charAt()  / toString()查看内容
     */
    @Test
    public void test2(){
        StringBuffer s1 = new StringBuffer("abc");

        s1.append(1);
        s1.append('2');
        System.out.println(s1);//abc12

        s1.replace(2,4,"hello");
        System.out.println(s1); //abhello2
        System.out.println(s1.length());//8

        s1.delete(2, 4);
        System.out.println(s1);//abllo2
//        StringBuffer delete = s1.delete(2, 4);//可以有返回值


        s1.insert(2,false);//false看成5个字符
        System.out.println(s1);//abfalsello2
        System.out.println(s1.length());//11

        s1.reverse();
        System.out.println(s1);//2olleslafba

        String s2 = s1.substring(1,3);//注意：substring(),纯小写！！！
        System.out.println(s2);//ol


    }
    /*
    String、StringBuffer、StringBuilder的异同？
    相同点：底层使用char[]进行存储
    不同点：
    String:不可变的字符序列
    StringBuffer：可变的字符序列：线程安全的，效率低；
    StringBuilder：可变的字符序列：jdk5.0新增，线程不安全的，效率高；

    源码分析：
    String str = new String(); //char[] value = new char[0];
    String str1 = new String("abc"); //char[] value = new char[]{'a','b','c'};

    StringBuffer sb1 = new StringBuffer();  //char[] value = new char[16]; 底层创建了一个长度16的数组
    System.out.println(sb1.length());//0

    sb1.append('a'); //value[0] = 'a';
    sb1.append('b'); //value[1] = 'b';

    StringBuffer sb2 = new StringBuffer("abc"); //char[] value = new char["abc".length + 16];
    //给了3+16个长度，但是我只用到了3个，所以sb2.length()=3, not value.length;
    //问题1. System.out.println(sb2.length()); // 3
    //问题2. 扩容问题：如果要添加的数据底层数组盛不下了，就需要扩容数组
             默认情况下，扩容为原来容量capacity的2倍+2，同时将原有数组中的元素复制到新的数组中

             开发中建议使用：StringBuffer(int capacity) / StringBuilder(int capacity)
             根据线程安全来选择
     */
    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'m');//无返回值，真正修改了index:0位置上的数据
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.length()); //0
    }
}
