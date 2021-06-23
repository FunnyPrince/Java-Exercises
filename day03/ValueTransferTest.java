package com.day03;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

/**
 * @author FunnyPrince_
 * @date 2021/3/28 - 21:16
 *
 * 关于变量的赋值
 * 若果变量是基本数据类型，此时赋值的是变量所保存的数据值
 * 如果变量时引用数据类型，此时赋值的是变量所保存的数据的地址值
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        int m = 10;
        int n = m;
        System.out.println("**********基本数据类型**********");
        System.out.println("m = " + m + ", n = " + n);

        n = 20;
        System.out.println("m = " + m + ", n = " + n);

        System.out.println("**********引用数据类型**********");
        Order o1 = new Order();
        o1.orderId = 1001;

        Order o2 = o1; //赋值以后，o1,o2的地址值相同，都指向堆空间中同一个对象实体
        System.out.println("or.oderId" + o1.orderId + ", o2.orderId" + o2.orderId);
        o2.orderId = 1002;
        System.out.println("or.oderId" + o1.orderId + ", o2.orderId" + o2.orderId);



    }
}
class Order{
        int orderId;
}


