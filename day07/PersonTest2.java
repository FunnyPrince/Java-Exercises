package com.day07;

/**
 * @author FunnyPrince_
 * @date 2021/3/29 - 23:18
 *
 * this关键字
 * 1.this可以用来修饰：属性、方法、构造器
 * 2.this修饰属性和方法：
 *      this理解为：当前对象
 *
 *     注： 1.在类的方法中，可以使用"this.属性" / “this.方法"的方式调用当前对象的属性/方法
 *      但是，通常情况下，都省略了"this."
 *      2.特殊情况下：如果方法的形参和类的属性重名，必须显式的使用"this.变量"的方式，表明此变量是属性，而非形参
 *      3.在构造器内创建方法时，用"this.属性" / “this.方法"，表示当前正在创建的对象的属性/方法
 *      特殊情况与1相同（不过构造器内是形参）
 *
 * 3.this调用构造器
 *      1.在类的构造器中，可以显式的使用"this(形参列表)"方式,调用本类中指定的“其他构造器”
 *      2.构造器中不能通过this(形参列表)"方式调用自己
 *      3.如果一个类中又n个构造器，则最多有n-1个构造器使用"this(形参列表)"方式,
 *      4.规定："this(形参列表)"必须声明在当前构造器的首行,
 *      5.构造器内部：最多只能声明一个"this(形参列表)"，用来调用其他构造器
 */
public class PersonTest2 {
    public static void main(String[] args) {

        Person2 p2 = new Person2();

        p2.setAge(18);
        System.out.println(p2.getAge());
        System.out.println();

        Person2 p3 = new Person2("Jerry",25);
        System.out.println(p3.getAge());

    }

}
class Person2{
    private int age;
    private String name;

    public Person2(){//构造器0
        //创建空参构造器，可以放置冗余代码(当初始化Person时，需要执行很多冗余代码，为了防止每个构造器都要执行这些冗余代码，可以放在一个构造器内，让其他构造器调用此构造器！)
        // 下面的构造器可以直接调用上面放置冗余的构造器
    }
    public Person2(int age){  //构造器1
        this(); //调用构造器0
        this.age = age; //如果正在构造器内调用，this称为“当前正在创建的对象的属性
        //this();//Call to 'this()' must be first statement in constructor body
        System.out.println("我是千万万个冗余代码");
    }

    public Person2(String name,int age){  //构造器2
        this(age);// 调用构造器1
        this.name = name;
        //由于构造器2调用了构造器1，构造器1中已经给this.age赋值了，所以此处可以省略
//        this.age = age;//省略
    }
    public void setName(String name){  //形参名和属性名相同，会覆盖成员变量
//        name  = name;  //就近原则
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;//this.当前对象的
    }
    public int getAge(){
        return age;
    }
    public void eat(){
        System.out.println("吃饭");
//        this.study();
        study();  //和上面的一样，省略了this
    }
    public void study(){
        System.out.println("学习");
    }
}
