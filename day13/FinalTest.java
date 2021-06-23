package com.day13;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

/**
 * @author FunnyPrince_
 * @date 2021/4/7 - 22:33
 * final关键字:最终的
 * 1.final可以修饰的结构：类、方法、变量
 * 2.final类：此类不能被其他类锁继承
 *       eg:String、System/StringBuffer类
 *3.final方法：不可以被重写
 *       eg:Object类中的getClass()
 * 4.final修饰变量：相当于常量
 *      4.1 final修饰属性，可以考虑赋值的位置：显式初始化、代码块中初始化、构造器中赋值
 *      4.2 final修饰局部变量：尤其是final修饰形参时，表明此形参是一个常量。当我们调用此方法时，
 *      给常量形参赋一个实参，一旦赋值以后，就只能在方法体内使用此形参，不能进行重新赋值
 * static final 用来修饰属性：全局常量
 *          /方法：一般不加
 */
public class FinalTest {
    final int WIDTH = 10;//显式赋值 ctrl+shift+x
    final int LEFT;//代码块初始化
    final int RIGHT;//构造器中赋值
//    final int DOWN;  //Variable 'DOWN' might not have been initialized
    {
        LEFT = 10;
    }
    public FinalTest(){
        RIGHT = 20;
    }
    public FinalTest(int n){
        //构造器中赋值，不确定调用哪个，必须每个构造器中都赋值
        RIGHT = 30;
    }
//    public void doWidth(){
//        width = 20;//Cannot assign a value to final variable 'width'
//    }
    public void show(){
       final int NUM = 1; //常量，一般大写，
        //NUM++；    常量不能赋值操作
    }
    public void show(final int i ){//形参
//        i = 20;  不能给常量赋值，编译不通过
        //形参一旦赋值，在方法内只能对形参进行调用，不能修改
        System.out.println(i);
    }
    public static void main(String[] args) {
        int num = 10;
        num = num + 1;

        FinalTest test = new FinalTest();
        test.show(10);//给形参赋值
    }



}
final class FinalA{

}
class A{
    public final void show(){

    }
}
class B extends A{
//    public void show(){
//
//    }

}