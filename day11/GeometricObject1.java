package com.day11;

/**
 * @author FunnyPrince_
 * @date 2021/4/6 - 1:26
 */
public class GeometricObject1 {
    protected String color;
    protected double weight;
    public GeometricObject1(){
        super();
        this.color = "white";
        this.weight = 1.0;
    }
    public GeometricObject1(String color,double weight){
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
}
class Circle1 extends GeometricObject1{
    private double radius;
    public Circle1(){
        super();
        radius = 1.0;
//        color = "white";
//        weight = 1.0;  冗余
    }
    public Circle1(double radius){
        super();
        this.radius = radius;
    }
    public Circle1(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return 3.14*radius*radius;
    }
    //重写equals()
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Circle1){
            Circle1 c =(Circle1)obj;
            return this.radius == c.radius;
        }
        return false;
    }
    //重写toString()
    public String toString(){
        return "Circle1 [radius" + radius + "]";
    }
}