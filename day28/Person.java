package com.day28;

/**
 * @author FunnyPrince_
 * @date 2021/5/4 - 0:16
 *
 * 获取当前运行时类的属性结构FileTest.java / MethodTest.java / OtherTest.java
 * 指路Person类使用到的父类Creature,接口MyInterface,注解MyAnnotation,
 * 了解内容
 */
@MyAnnotation(value = "hi")
public class Person extends Creature<String> implements Comparable<String>,MyInterface{

    private String name;
    int age;
    public int id;

    public Person(){}

    @MyAnnotation(value = "Jerry")
    private Person(String name){
        this.name = name;
    }

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @MyAnnotation(value = "CHINA")
    private String show(String nation){
        System.out.println("国籍:" + nation);
        return nation;
    }

    @MyAnnotation  //使用默认值
    public String display(String interest,int age) throws NullPointerException,ClassCastException{
        return interest + age;
    }

    public void info(){
        System.out.println("实现MyInterface接口的抽象方法info()");
    }
    public int compareTo(String o){
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    private static void showDesc(){
        System.out.println("Person类中的静态方法showDesc()");
    }
}
