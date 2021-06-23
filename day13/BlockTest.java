package com.day13;

/**
 * @author FunnyPrince_
 * @date 2021/4/7 - 21:39
 *
 * 代码块/初始化块
 * 1.作用：初始化类、对象
 * 2.代码块如果有修饰，只能是static
 * 3.静态代码块   vs   非静态代码块
 * 4.静态代码块：
 *      >内部可以有输出语句、
 *      >随着类的加载而执行且只执行一次（类只加载一次）
 *      作用：初始化类的信息
 *      >如果一个类中定义了多个static代码块，则按照声明的先后顺序执行
 *      >静态代码块内只能调用static的属性/方法，不能调用非static结构
 *
 *      先执行static代码块，再执行非static代码块
 *
 * 5.非静态代码块
 *      >内部可以有输出语句、
 *      >随着对象的创建而执行
 *      >没创建一个对象，就执行一次得static代码块
 *      作用：可以在创建对象时，对对象的属性进行初始化
 *      >如果一个类中定义了多个非static代码块，则按照声明的先后顺序执行
 *      >可以调用静态的属性/方法，非静态的方法/属性
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person2.desc;
        Person2 p1 = new Person2();
        Person2 p2 = new Person2();

        System.out.println("非静态代码块中的age赋值："+p1.age);
        System.out.println(desc);
    }
}
class Person2{
    String name;
    int age;
    //age = 1;对方法可以
    //age +=1;对于属性来说不可以直接调用
    static String desc = "人";

    public Person2(){

    }
    public Person2(String name,int age){
        this.name = name;
        this.age = age;
    }
    //非static代码块
    {
        System.out.println("我是非static代码块");
        age = 1;
        info();
        eat();
    }
    //static代码块
    static{
        System.out.println("我是static代码块");
        desc = "static代码块的重新赋值";
        info();
        //eat();不可以执行非static结构
    }
    static{
        System.out.println("第二个static代码块");
    }
    public void eat(){
        System.out.println("吃");
    }
    //重写toString()
    public String toString(){
        return "Person [name=" + name+",age=" +
                age + "]";
    }
    //随着类的加载而加载，但执行必须要“类.info()才可以
    public static void info(){
        System.out.println("静态方法info()");
    }

}