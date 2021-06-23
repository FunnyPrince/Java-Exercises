package com.day13;

/**
 * @author FunnyPrince_
 * @date 2021/4/8 - 0:41
 *
 * 抽象类的匿名子类
 * 匿名：只用一次
 */
public class PersonTest {
    public static void main(String[] args) {
        method(new Student());//匿名对象

        Worker w = new Worker(); //new Person1 的子类对象
        method1(w);//非匿名的类非匿名的对象
        method1(new Worker());///非匿名的类 匿名的对象

        //创建了一个匿名子类的对象：p
        //声明的是父类的变量,实际上new的子类的对象
        Person1 p = new Person1(){ //Person1的子类，但匿名，用Person1()来充当
            @Override
            public void shout() {
                System.out.println("匿名子类的对象");
            }
        };
        method1(p);
        System.out.println("************************");
        //创建匿名子类的匿名对象
        method1(new Person1(){
            @Override
            public void shout() {
                System.out.println("匿名子类的匿名对象");
            }
        });
    }
    public static void method(Student s){

    }
    public static void method1(Person1 p){//声明的是父类的变量,实际上new的子类的对象
        //Person1是抽象的，只能new子类的对象
//        p.eat();
//        p.walk();
        p.shout();
    }
}
class Worker extends Person1{

    @Override
    public void shout() {
        System.out.println("重写抽象方法");
    }
}