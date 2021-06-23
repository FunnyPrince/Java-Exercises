package com.day11;

/**
 * @author FunnyPrince_
 * @date 2021/4/6 - 1:40
 */
public class GeometricObject1Test111 {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(2.3); //color,weight默认
        Circle1 c2 = new Circle1(2.3,"white",2.0);
        System.out.println("颜色是否相等："+ c1.getColor().equals(c2.getColor()));//true

        System.out.println("半径是否相等："+ c1.equals(c2));//true

        System.out.println(c1);//Circle1 [radius2.3]
        System.out.println(c2.toString());//重写后的
    }
}
