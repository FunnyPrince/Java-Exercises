package com.day06;

/**
 * @author FunnyPrince_
 * @date 2021/3/28 - 23:27
 * 考察值得传递
 *      * (1)定义一个Circle类， 包含一个double型的radius属性代表圆的半径，- - 个
 *      * findArea()方法返回圆的面积。
 *      * (2)定义一个类PassObjelct, 在类中定义- 个方法printAreas()， 该方法的定义
 *      * 如下: public void printAreas(Circle C, int time)
 *      * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 *      * 例如，times为5， 则输出半径1，2，3，4，5，以及对应的圆面积。
 *      * (3)在main方法中调用printAreas()方法， 调用完毕后输出当前半径值。
 *
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject test = new PassObject();

        Circle c = new Circle();
        test.printAreas(c,5);

        //输出5.0,,因为time=5,之后i++,没进入循环，所以要在出了循环之后重新赋值，才会是6.0
        System.out.println("now radius is " + c.radius);
    }
    public void printAreas(Circle c,int time){ //time是半径的截止数
        System.out.println("Radius\t\tArea");

        for(int i = 1; i <= time;i++){
            //设置圆的半径
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }
        //重新赋值，main()中才会执行到
        c.radius = time + 1;
    }

}
class Circle {
        double radius;

        public double findArea(){
            return Math.PI * radius * radius;
        }

}

