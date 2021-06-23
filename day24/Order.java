package com.day24;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FunnyPrince_
 * @date 2021/4/27 - 20:15
 *
 * 自定义泛型类
 */
public class Order<T> {
    String orderName;
    int orderId;

    //类的内部结构可以使用类的泛型
    T orderT;

    public Order(){
        T[] arr = (T[]) new Object[10];
    }

    public Order(String orderName,int orderId,T orderT){
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    //如下get的方法不属于泛型方法
    public T getOrderT() {
        return orderT;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderT=" + orderT +
                '}';
    }

    //静态方法中不能使用类的泛型,类的泛型是造对象的时候指定，
//    public static void show(T orderT){//类加载的时候，还无泛型
//        System.out.println(orderT);
//    }

    //泛型方法：在方法中体现了泛型的结构，泛型参数与类的泛型参数没有任何关系
    //即，泛型方法所属的类是不是泛型类都没有关系。
    //泛型方法，可以声明为静态的。原因：泛型参数是在调用方法时确定的。并非实例化类时确定。
    public <E> List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for(E e : arr){
            list.add(e);
        }
        return list;
    }

}
