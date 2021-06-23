package com.day13;

/**
 * @author FunnyPrince_
 * @date 2021/4/7 - 22:27
 * 对属性可以赋值的位置，
 * ①默认初始化
 * ②显式初始化 / ⑤在代码块中赋值
 * ③构造器中初始化
 * ④有了对象以后，可以通过"对象.属性"或"对象.方法"的方式，进行赋值
 * ⑤在代码块中赋值
 *
 * 执行的先后顺序:①-② / ⑤-③一④      ②/⑤的先后赋值顺序有关
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }
}
class Order{
//    int orderId = 3;
//    {
//        orderId = 4;
//        System.out.println("非static代码块" + orderId);
//    }//4
    {
    orderId = 4;
    System.out.println("非static代码块" );
    }
    int orderId = 3;//3
}
