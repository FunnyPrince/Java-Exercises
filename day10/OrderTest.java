package com.day10;

/**
 * @author FunnyPrince_
 * @date 2021/4/2 - 19:56
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 1;
        order.orderDefault = 2;
        order.orderPublic = 3;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        //'methodPrivate()' has private access in 'com.day10.Order'
/*        order.orderPrivate = 4;
        order.methodPrivate();*/
    }
}
