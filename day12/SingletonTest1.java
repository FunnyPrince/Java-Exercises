package com.day12;

/**
 * @author FunnyPrince_
 * @date 2021/4/7 - 1:03
 * 単例设计模式
 * 1.所谓类的单例模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例
 * 2.如何实现？
 * 饿汉式  vs  懒汉式
 * 3.区分饿汉式和懒汉式
 * 饿汉式：
 *      好处：线程安全
 *      坏处：对象加载时间过长；
 * 懒汉式：
 *      好处：延迟对象的创建；
 *      目前的写法坏处：线程不安全-->多线程内容，修改
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();//不用new
        System.out.println(bank1 == bank2);

    }
}
//饿汉式
class Bank{
    //1.私有化类的构造器
    private Bank(){

    }
    //2.内部创建类的对象
    //4.要求此对象也必须声明为静态的
    private static Bank instance = new Bank();//instance实例

    //3.提供公共的方法，返回类的对象
    public static Bank getInstance(){
//        return instance;//Non-static field 'instance' cannot be referenced from a static context
        return instance;//instance也声明成static
    }

}
