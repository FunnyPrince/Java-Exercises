package com.day12;

/**
 * @author FunnyPrince_
 * @date 2021/4/7 - 0:31
 *
 * static关键字的应用
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.4);

        System.out.println("c1的id： "+ c1.getId());
        System.out.println("c2的id： "+ c2.getId());
        System.out.println("c2的id： "+ c3.getId());
        System.out.println("创建的圆的个数为：" + Circle.getTotal());

    }
}
class Circle{
    private double radius;
    private int id;//自动赋值

    public Circle(){
        id = init++;  //第一次1001，第二次1002
        total++;
    }
    public Circle(double radius){
        this();
//        id = init++;
//        total++;   相当于this();,让他调用空参的先
        this.radius = radius;
    }

    private static int total;//记录创建的圆的个数
    private static int init = 1001;  //static声明的属性被所有对象共享

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }
    //不需要自动赋值
    //    public void setId(int id) {
//        this.id = id;
//    }

    public double findArea(){
        return 3.14 * radius * radius;
    }
}
