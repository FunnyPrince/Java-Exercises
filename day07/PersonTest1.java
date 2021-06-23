package com.day07;

/**
 * @author FunnyPrince_
 * @date 2021/3/29 - 22:22
 * 类的结构值三：构造器(constructor)
 * 一、constructor的作用：
 * 1.创建对象
 * 2.初始化对象的属性
 * 二、说明：
 * 1.如果没有显式的定义构造器，系统会默认提供一个空参的构造器
 * 2.定义构造器的格式：权限修饰符 类名(形参列表){}
 * 3.一个类中定义的多个构造器，彼此构成重载
 * 4.一旦显式的定义了类的构造器之后，系统不再提供默认的空参构造器
 *
 */
public class PersonTest1 {
    public static void main(String[] args) {
        //创建类的对象 :  new+构造器
        Person1 p =new Person1("Jerry");
        System.out.println(p.name);
        p.eat();
    }
}
class Person1{
    String name;
    int age;

    //构造器
    public Person1(){
        System.out.println("Person()...");
    }
    public Person1(String n){  //构造器的重载
        name = n;//初始化

    }
    public void eat(){
        System.out.println("吃饭");
    }
}
