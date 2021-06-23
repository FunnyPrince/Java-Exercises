package com.day12;

/**
 * @author FunnyPrince_
 * @date 2021/4/7 - 1:13
 *
 * 单例模式的懒汉式实现
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Order1 o1 = Order1.getInstance();
        Order1 o2 = Order1.getInstance();

        System.out.println(o1 == o2);
    }
}
class Order1{
    //1.私有化类的构造器
    private Order1(){

    }
    //2.声明当前类对象，没有初始化
    private static Order1 instance = null;

    //3.声明public static的返回当前类对象的方法
    public static Order1 getInstance(){
        if(instance == null){ //为null，再实例化
            instance = new Order1();
        }
        return instance;
    }

}