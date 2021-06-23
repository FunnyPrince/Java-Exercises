package com.day27;

/**
 * @author FunnyPrince_
 * @date 2021/5/2 - 23:30
 */
public class Person {
    private String name;
    public int age;

    public Person() {
        System.out.println("test调用Person的空参构造器Person()");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void show(){
        System.out.println("show()展示Person");
    }
    private String showNation(String nation){
        System.out.println("国籍："+nation);
        return nation;
    }
}
