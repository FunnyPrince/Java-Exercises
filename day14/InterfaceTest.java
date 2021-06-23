package com.day14;

/**
 * @author FunnyPrince_
 * @date 2021/4/8 - 22:16
 *
 * SubClassTest有知识点
 *
 * 接口的使用
 * 1.接口使用interface来定义
 * 2.java中，接口和类是并列的两个结构
 * 3.如何定义接口：定义接口中的成员
 *      >3.1  JDK7及以前：只能定义全局常量和抽象方法
 *           >全局常量：public static final的，可以省略
 *           >抽象方法：public abstract的
 *      >3.2  JDK8:除了定义全局常量和抽象方法外，还可以定义静态方法、默认方法==>CompareA
 * 4.接口中不能定义构造器，意味着接口不可以实例化
 * 5.java开发中，接口都通过让 类实现(implements)方式来使用
 *      >如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 *      >如果实现类没有覆盖接口中的所有抽象方法，则此实现类仍未一个抽象类
 * 6.java类可以实现多个接口--》弥补了java单继承的局限性
 *      >格式：class AA extends BB implements CC,DD{}
 *7.接口与接口之间可以多继承
 *
 *
 *8.接口的具体使用，可以体现多态性
 *9.接口，实际上可以看做是一种规范
 *
 *
 * 面试题：抽象类与接口的异同？
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

        Plane plane = new Plane();
        plane.fly();

    }
}
interface Attackable{
    void attack();
}
interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 7000;//第一宇宙速度
     int MIN_SPEED = 1;//还是常量，不是变量，省略了public static final
    //抽象方法
    public abstract void fly();
    void stop();//省略了public abstract

}
class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞机起飞");
    }

    @Override
    public void stop() {
        System.out.println("飞机降落");
    }
}
abstract class Kite implements Flyable{
    @Override
    public void fly() {
        System.out.println("放飞风筝");
    }
}
class Bullet extends Object implements Flyable,Attackable{
    @Override
    public void fly() {
        System.out.println("子弹飞出去了");
    }

    @Override
    public void stop() {
        System.out.println("子弹卡住了");
    }

    @Override
    public void attack() {
        System.out.println("子弹具有攻击性");
    }
}

//*************接口多继承******************************
interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{

}
