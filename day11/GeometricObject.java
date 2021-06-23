package com.day11;

/**
 * @author FunnyPrince_
 * @date 2021/4/5 - 21:49
 */
abstract public class GeometricObject { //几何图形
    protected String color;
    protected double weight;

    //    public GeometricObject(){
//
//    }
    public GeometricObject(String color, double weight) {
        super();
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    //    public double findArea(){
//        return 0.0;
//    }
//
//}
    //Abstract methods cannot have a body
    public abstract double findArea();
}
class Circle extends GeometricObject{
    private double radius;
    Circle(double radius,String color,double weight){
        super(color, weight);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 3.14 * radius * radius;
    }
}

class MyRectangle extends GeometricObject{
    double width;
    double height;

    MyRectangle(double width,double height,String color,double weight){
        super(color, weight);
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }
}
