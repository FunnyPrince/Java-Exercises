package com.day14;

/**
 * @author FunnyPrince_
 * @date 2021/4/9 - 0:18
 * 定义一个Circle类,声明redius属性，提供getter和setter方法
 */
public class Circle {
    private double radius;
    public Circle(){}
    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

