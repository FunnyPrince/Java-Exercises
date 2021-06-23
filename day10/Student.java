package com.day10;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

/**
 * @author FunnyPrince_
 * @date 2021/4/2 - 18:45
 */
public class Student extends Person{
    String major;
    int id = 111;//学号

    public Student(){
        //默认的super();省略了

    }
    public Student(String major){
        //默认的super();省略了
        this.major = major;
    }
    public Student(String name,int age,String major){
//        this.name = name;
        super(name,age);
        this.major = major;
    }
    public void study(){
        System.out.println("学习");
    }
    //方法的重写
    public void eat(){
        System.out.println("学生吃饭");
    }
    //没有构成重写
    public void show(){
        System.out.println("子类中的show方法");
        System.out.println(super.id);
    }
    //重写父类中Object类型的info方法，返回值可以是Object/Object的子类
    public String info(){
        return null;
    }
//    重写info1()  不可以用int
    public double info1(){
        return 1.0;
    }
//    public int info1(){
//        return 1;
//        //'info1()' in 'com.day10.Student' clashes with 'info1()' in 'com.day10.Person'; attempting to use incompatible return type
//    }
}
