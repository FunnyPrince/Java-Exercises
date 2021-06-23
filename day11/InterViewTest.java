package com.day11;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

/**
 * @author FunnyPrince_
 * @date 2021/4/5 - 23:04
 *
 * 多态题目考察
 */
public class InterViewTest {
    public static void main(String[] args) {
        Base1 base = new Sub1();
        base.add(1,2,3); //输出结果是Sub1，重写了

        Sub1 s = (Sub1)base;
        s.add(1,2,3);  //强转 输出sub2
    }
}
class Base1{
    public void add(int a,int ... arr){
        System.out.println("base1");
    }
}
class Sub1 extends Base1{
    public void add(int a,int[] arr){  //算是重写，表示int ... arr与int[] arr编译器认为形参是一样的
        System.out.println("Sub1");
    }
    public void add(int a,int b,int c){ //没有重写，编译的是父类，调用的是重写的方法
        System.out.println("sub2");
    }
}
