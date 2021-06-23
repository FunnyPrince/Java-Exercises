package com.day07;

/**
 * @author FunnyPrince_
 * @date 2021/3/29 - 22:42
 * 3.编写两个类，TriAngle 和TriAngleTest,其中TriAngle类中声明私有的底
 * 边长base和高height,同时声明公共方法访问私有变量。此外，提供类
 * 必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        System.out.println("base: " + t1.getBase() + " height:" + t1.getHeight());
        t1.setHeight(2.0);  //设置
        t1.setBase(3.0);
        System.out.println("base: "+t1.getBase()+" height:"+t1.getHeight());

        TriAngle t2 = new TriAngle(12,3);
        t2.setBase(12);
        System.out.println("base: "+t2.getBase()+" height:"+t2.getHeight());

    }

}
class TriAngle{
    private double base; // 底边长
    private double height;//高

    public TriAngle(){

    }
    public TriAngle(double b,double h){
        base  = b;
        height = h;
    }
    public void setBase(double b){
        base = b;
    }
    public double getBase(){
        return base;
    }
    public void setHeight(double h){
        height = h;
    }
    public double getHeight(){
        return height;
    }
}
