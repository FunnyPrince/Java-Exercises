package com.day07;

/**
 * @author FunnyPrince_
 * @date 2021/3/29 - 23:06
 *
 * JavaBean是一种Java语言写成的可重用组件。
 * 所谓javaBean,是指符合如下标准的Java类:
 *      >类是公共的
 *      >有一一个无参的公共的构造器
 *      >有属性，且有对应的get、set方法
 */
public class Customer {
    //默认的构造器的权限修饰符决定于类的权限修饰符
    private int id;
    private String name;

    Customer cus = new Customer();


    public Customer(){

    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
