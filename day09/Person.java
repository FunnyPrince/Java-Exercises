package com.day09;

/**
 * @author FunnyPrince_
 * @date 2021/4/1 - 20:44
 */
public class Person {
    String name;
    private int age;
    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("吃法");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
