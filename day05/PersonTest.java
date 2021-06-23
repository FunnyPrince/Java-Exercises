package com.day05;

/**
 * @author FunnyPrince_
 * @date 2021/3/27 - 22:05
 *
 * 属性=成员变量=filed=域，
 * 方法=成员方法=函数=method
 *
 * 创建类的对象=类的实例化=实例化类
 *
 * 二、类和对象的使用
 * 1.创建类，设计类的成员
 * 2.创建类的对象
 * 3.通过“对象.属性”/“对象.方法"调用对象的结构
 *
 * 三、如果创建了一个类的多个对象，则每个对象都独立的拥有一套类的属性（非static的）
 * 意味着，若果我们修盖一个对象的属性a，则不影响另外一个对象属性a的值
 *
 */
//测试类
public class PersonTest {
    public static void main(String[] args) {
        //创建Person类对象
        Person p1 = new Person();
        p1.eat();  //调用方法
        p1.name = "Tom";//调用属性
        System.out.println(p1.name);

        Person p2 = new Person();
        System.out.println(p2.name); //null,默认初始化值

        //将p1对象保存的对象地址值赋给p3,导致p1 ,p3指向了堆空间中的同一个对象实体
        Person p3 = p1;
        System.out.println(p3.name);//Tom

        p3.age = 10;
        System.out.println(p1.age);//10
    }



}

class Person{
    //属性
    String name;
    int age;
    boolean isMale;


    //行为
    public void eat(){
        System.out.println("吃");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void talk(String language){
        System.out.println("说话");
    }



}
