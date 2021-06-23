package com.day09;

/**
 * @author FunnyPrince_
 * @date 2021/4/1 - 20:46
 *
 * 面相对象特征之一：继承性
 * 一、优：
 *     1.减少了代码的冗余，提高了代码的复用性
 *     2.便于功能扩展
 *     3.为多态性
 *
 *  二、继承性的格式：   class A extends B{}
 *     A:子类 ： 派生类、subclass
 *     B:父类、超类、基类、superclass
 *
 *    2.1 体现：一旦子类A继承父类B之后，A就获取了B中声明的所有结构：属性、方法
 *     特别的：父类中声明为private的属性或方法，子类继承父类后，仍然认为获取了父类中的私有结构
 *     只是因为封装性原因，使得子类不能直接调用父类的结构。
 *   2.2子类继承父类之后，还可以声明自己特有的方法,实现功能的扩展
 *   子类和父类的关系，不同于子集和集合的关系
 *   extends：延展、扩展
 *三、java中关于继承的规定
 *     1. java中类的单继承性：一个类只能有一个直接父类，但一个类可以被多个子类继承
 *     2.子父类是相对的概念，
 *      3.子类直接继承的父类：直接父类；间接继承的父类：间接父类
 *      4.子类继承父类以后，便继承了直接/间接父类所有功能结构
 *
 * 四、1.如果我们没有现实生命一个类的父类，则此类继承java.lang.Object类
 * 2.所有的java类(除java.lang.Object)都直接/间接继承于java.lang.Object类
 * 3.所有的kava类具有java.lang.Object类声明的功能
 */
public class Student extends Person{
//    String name;
//    int age;
    String major;
    public Student(){

    }
    public Student(String name,int age,String major){
        this.name = name;
//        this.age = age;

        this.major = major;
    }
//    public void eat(){
//        System.out.println("吃法");
//    }
//    public void sleep(){
//        System.out.println("睡觉");
//    }
    public void study(){
        System.out.println("学习");
    }

}
