package com.day14;


/**
 * @author FunnyPrince_
 * @date 2021/4/8 - 19:11
 * Employee HourlyEmployee SalariedEmployee PayrollSystem
 *
 * *定义一个Employee类,该类包含:
 * private成员变量name, number，birthday,其中birthday为MyDate类的对象:
 * abstract方法earnings();
 * toString( )方法输出对象的name，number和birthday。
 */
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee(String name,int number,MyDate birthday){
//没有指明，空指针异常！
        super();
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract double earnings();

    public String toString(){
        return "name="+name + ",number="+number
                +",birthday="+birthday.toDateString();
        //MyDate自定义类，默认调用toString(),birthday如果调用toString(),输出地址值，重写的是toDateString()，应显式调用toDateString()
    }


}
