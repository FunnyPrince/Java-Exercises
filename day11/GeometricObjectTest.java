package com.day11;

/**
 * @author FunnyPrince_
 * @date 2021/4/5 - 22:08
 *
 * 定义一个测试类GeometricTest,
 * 编写equalsArea方法测试两个对象的面积是否相等(注意方法的参数类型，利用动态绑定技术)，
 * 编写displayGeometricobject方法显示对象的面积(注意方法的参数类型，利用动态绑定技术)。
 */
public class GeometricObjectTest {
    public static void main(String[] args) {
        GeometricObjectTest test = new GeometricObjectTest();
        Circle c1 = new Circle(2.3, "red", 1.0);
        test.displayGeometricObject(c1);   //The method displayGeometricObject(com.day11.Circle) is undefined for the type com.day11.GeometricObject
        Circle c2 = new Circle(3.3, "red", 1.0);
        test.displayGeometricObject(c2);  //调用Test里的方法 ，必须定义Test的对象！！！，不是GeometricObject对象

        boolean isEquals = test.equalsArea(c1,c2);
        System.out.println(isEquals);
    }

    public void displayGeometricObject(GeometricObject o){ //GeometricObject = new Circle(...);
        System.out.println("面积为：" +o.findArea());
    }
    //测试两个对象的面积是否相等
    public boolean equalsArea(GeometricObject o1, GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }
}
