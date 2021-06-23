package com.day11;

import java.util.Date;

/**
 * @author FunnyPrince_
 * @date 2021/4/6 - 1:09
 *
 * Object类中toString()方法
 *1.当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
 * 2.Object类中toString()定义：
 *  public String toString(){
 *      return getClass().getName() + "@" + Interger.toHexString(hashCode());
 *  }
 *3.String、Date、File、包装类等都重写了object类中的toString()
 * 使得在调用对象的toString()时，返回“实体内容”
 *
 * 4.自定义类可以重写toString(),当调用此方法时，返回“实体内容”
 *
 *
 */
public class ToStringTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom",15);
        System.out.println(cust1.toString());//调用下面的相当于调用这个
        System.out.println(cust1); //com.day11.Customer@4554617c==》Customer[name = Tom,age15]重写后

        String str = new String("AA");
        System.out.println(str);

        Date date = new Date(456133566L);
        System.out.println(date.toString()); //Tue Jan 06 14:42:13 CST 1970

    }
//重写toString()见EqualsTest里的Customer类
}
