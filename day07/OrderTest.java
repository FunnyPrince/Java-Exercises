package com.day07;

/**
 * @author FunnyPrince_
 * @date 2021/3/29 - 21:36
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order =  new Order();
        order.orderDefault = 1;
        order.orderPublic = 2;
        //不可调用private
//        order.orderPrivate = 3;

        order.methodDefault();
        order.methodPublic();
    }

}
class Order{
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private int orderPrivate(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
        return 1;
    }
    void methodDefault(){

    }
    public void methodPublic(){

    }

}

