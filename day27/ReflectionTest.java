package com.day27;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author FunnyPrince_
 * @date 2021/5/2 - 23:30
 *
 * 指路Person.java
 */
public class ReflectionTest {
    //反射前，对于Person类的操作
    @Test
    public void test1(){
        //1.创建Person类的对象
        Person p1 = new Person("Tom",20);
        //2.调用对象指定的属性、方法
        p1.age = 21;
        System.out.println(p1.toString());
        p1.show();
        //在Person类外部不能通过Person类对象调用其内部私有的结构
        //如：name / showNation()及私有构造器
    }

    //反射之后，对于Person的对象
    @Test
    public void test2() throws Exception {

        //1.通过反射，创建Person类的对象
        Class clazz = Person.class;//Person的class属性
        Constructor cons= clazz.getConstructor(String.class,int.class);

        Object obj = cons.newInstance("Jerry",20);//多态，将Person类的构造器赋给Object对象
        Person p = (Person)obj;
        System.out.println(p.toString());

        //2.通过反射，调用对象指定的属性、方法
        //调属性
        Field age = clazz.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p);
        System.out.println(p.toString());

        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        System.out.println("通过反射调用私有结构");
        //通过反射，可以调用Person类的私有结构。
        //调用私有构造器
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 = (Person)cons1.newInstance("Mary");//直接将Object类型强转成Person
        System.out.println(p1);

        //调用私有属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"Jack");
        System.out.println(p1);

        //调用私有方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);//showNation()为String类型，String.class
        showNation.setAccessible(true);
        String nation = (String)showNation.invoke(p1,"中国");//invoke()方法的返回值就是showNation()的返回值，即String类型Object强转成String
        //相当于String nation = p1.showNation("中国");
        System.out.println(nation);//中国

    }

    //1.通过直接new的方式或反射都可以调用public的结构，开发中用哪个？
    //建议：直接new；
    //什么时候会使用反射？反射的特征：动态性

    //2.封装与单例模式，还可以通过反射调用吗？意义在哪？
    //反射机制与面向对象中的封装性是否矛盾？如何看待这两个技术
    //不矛盾。


    /*
    关于java.lang.Class类的理解
    1.类的加载过程：
    程序经过javac.exe命令以后，会生成一个/多个字节码文件(.class文件)。
    接着使用java.exe命令对某个字节码文件进行解释运行。相当于将某个字节码文件加载到内存中。此过程成为类的加载。
    加载到内存中类，称为运行时类，此运行时类就作为Class的一个实例。

    2.或Class的实例就对应着一个运行时类。
    3.加载到内存中的运行时类，会缓存一定的时间，在此时间之内，可以通过不同的方式来获取此运行时类。

     */
    //万事万物皆对象
    //对象.xxx,File,URL(网络地址是URL类的对象),反射，前端、数据库操作

    //获取Class的实例方式(不是创建！)
    @Test
    public void test3() throws ClassNotFoundException {
        //方式一：调用运行时类的属性： .class
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);//class com.day27.Person

        //方式二：通过运行时类的对象,调用getClass()
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);//class com.day27.Person

        //方式三：调用Class的静态方法：forName(String classPath)
        Class clazz3 = Class.forName("com.day27.Person");//类的全类名
//        clazz3 = Class.forName("java.lang.String");
        System.out.println(clazz3);

        System.out.println(clazz1 == clazz2);//true
        System.out.println(clazz1 == clazz3);//true

        //方式四：使用类的加载器：ClassLoader
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class<?> clazz4 = classLoader.loadClass("com.day27.Person");//显式地加载某个包下的类
        System.out.println(clazz4);//class com.day27.Person
        System.out.println(clazz1 == clazz4);//true
    }
}
