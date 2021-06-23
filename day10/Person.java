package com.day10;

/**
 * @author FunnyPrince_
 * @date 2021/4/2 - 18:45
 */
public class Person {
    String name;
    int age;
    int id = 122346; //身份证号

    public Person(){
        System.out.println("我是Person空参构造器");
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void walk(int distance){
        System.out.println("走的距离"+distance);

    }
    //private类型的方法将不能被重写
    private void show(){
        System.out.println("父类中的show方法");
    }
    //父类中为Object类型的info
    public Object info(){
        return null;
    }
    public double info1(){
        return 1.0;
    }

}
