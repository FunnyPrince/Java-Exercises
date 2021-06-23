package com.day05;

/**
 * @author FunnyPrince_
 * @date 2021/3/28 - 0:03
 *
 * 设计类Circle计算圆的面积
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 2.1;
//        System.out.println(c1.findArea()); //方式1

        c1.findArea(); //方式2： 没有返回值，所以1接收不到
    }
}
class Circle{
    //属性
    double radius;

    //求圆的面积
//    方式1：
/*    public double findArea(){
        double area = Math.PI * radius *radius;
        return area;

    }*/
    //方式2：
    public void findArea(){
        double area = Math.PI * radius *radius;
        System.out.println("面积为：" + area);
    }

//错误情况：
/*
public double findArea(double r){  //已经定义了属性radius，就不要加r
    double area = Math.PI * r * r;  //还需传参数，冲突
    return area;
*/

}
