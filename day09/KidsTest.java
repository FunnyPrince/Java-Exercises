package com.day09;

/**
 * @author FunnyPrince_
 * @date 2021/4/1 - 22:26
 *
 * (3)定义类KidsTest，在类的main方法中实例化Kids的对象someKid,用该对象访问
 *  * 其父类的成员变量及方法。
 */
public class KidsTest {
    public static void main(String[] args) {

        Kids someKid = new Kids(12);
        someKid.printAge();
        someKid.setSalary(0);
        someKid.setSex(1);

        someKid.employeed();
        someKid.manOrWoman();
    }
}

