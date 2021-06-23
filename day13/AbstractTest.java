package com.day13;

/**
 * @author FunnyPrince_
 * @date 2021/4/7 - 23:47
 * Abstract关键字的使用
 * abstract可以用来修饰的结构：类、方法
 * 1.abstract修饰类：抽象类
 *      >此类不能实例化
 *      >抽象类中一定有构造器，便于子类实例化时调用
 *      >开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作
 *
 * 2.abstract修饰方法：抽象方法
 *      >抽象方法只有方法的声明，没有方法体（表示无法调用，即类不能实例化）
 *      >包含抽象方法的类，一定是抽象类。反之，抽象类中不一定有抽象方法
 *      >若子类重写了父类中的所有抽象方法后，此子类方可实例化
 *       若子类没有重写了父类中的所有抽象方法，则子类是个抽象类，需使用abstract修饰
 *
 *  * 1.abstract不能用来修饰：属性、构造器等结构
 *  * 2.abstract不能用来修饰私有方法、静态方法、final的方法、final的类
 */
public class AbstractTest {
    public static void main(String[] args) {
//        //'Person1' is abstract; cannot be instantiated
//        //一旦Person1类抽象了，就不可实例化
//        Person1 p1 = new Person1();
//        p1.eat();
    }

}
abstract class Person1{
    String name;
    int age;

    public Person1(){

    }
    public Person1(String name,int ag){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("吃");
    }
    public void walk(){
        System.out.println("走路");
    }
    //抽象方法
   public abstract void shout();

}
//Class 'Student' must either be declared abstract or implement abstract method 'shout()' in 'Person1'
class Student extends Person1{
    public Student(){

    }
    public Student(String name,int age){
        super(name,age);
    }

    @Override
    public void shout() {
        System.out.println("子类必须重写抽象方法shout()/子类也是abstract类");
    }
}