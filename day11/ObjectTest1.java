package com.day11;

/**
 * @author FunnyPrince_
 * @date 2021/4/5 - 23:37
 *
 * java.lang.Object类
 *
 * Object类只生命了一个空参构造器
 * d对象被回收之前，会调用finalize方法
 *
 * 面试题：final、finally、finalize的区别？
 */
public class ObjectTest1 {
    public static void main(String[] args) {
        Order1 order = new Order1();
        System.out.println(order.getClass().getSuperclass());//获取当前对象的所属类
    }
}
class Order1{

}