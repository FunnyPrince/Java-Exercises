package com.day15;

/**
 * @author FunnyPrince_
 * @date 2021/4/9 - 22:45
 * 类的内部成员之五：内部类
 * 1.java中允许将一个类A声明在另一个类B中，则类A是内部类，B是外部类
 * 2.内部类的分类： 成员内部类(静态/非静态）  vs  局部内部类（方法内、代码块内、构造器内
 *3.成员内部类：
 *      一方面，作为外部类的成员：
 *          >可以调用外部类的结构
 *          >可以被static修饰
 *          >可以被4种权限修饰
 *      另一方面，作为一个类：
 *          >类内可以定义属性、方法、构造器等
 *          >可以被final修饰，此类不可以被继承
 *          >可以被abstract修饰，不能被实例化
 *
 *4.关注如下3个问题：
 *   4.1如何实例化成员内部类的而对象
 *   4.2如何在成员内部类种区分调用外部类的结构
 *   4.3开发中局部内部类的使用:InnerClassTest1
 *
 *    *InnerClassTest2： 在局部内部类的方法中（比如show())，如果调用局部内部类所声明的方法(比如method())中的局部变量(比如num)的话，
 *  *要求此局部变量声明为final的
 */
public class InnerClassTest {
    public static void main(String[] args) {
        //4.1如何实例化成员内部类的而对象
        //创建Dog实例（静态成员内部类）
        Person.Dog dog= new Person.Dog();//'Dog' is abstract; cannot be instantiated
        //创建Bird实例（非静态成员内部类）
        Person  p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();

        System.out.println("***********");

        bird.display("形参name赋值来了");

    }
}
class Person{

    String name = "Person的name";
    int age;
    public void eat(){
        System.out.println("吃吃吃");
    }
    //静态成员内部类
//    abstract static class Dog{
    static class Dog{
        String name;
        int age;
        public void show(){
            System.out.println("狗狗那么可爱");
        }

    }
    //非静态成员内部类
    final class Bird{
        String name = "Bird的name";;
        public void sing(){
            System.out.println("吱吱吱");
            eat();//调用外部类的非静态属性Person.this.eat();
        }

        public void display(String name){
            // 4.2如何在成员内部类种区分调用外部类的结构
            System.out.println("形参：" + name);//形参
            System.out.println("内部类Bird的name:" + this.name);//内部类Bird的name，display()所在类的name
            System.out.println("外部类Person的name:" + Person.this.name);//外部类Person的name
            System.out.println(age);
        }

    }


    public void method(){
        //局部内部类
        class AA{

        }

    }
    public Person(){

    }

}