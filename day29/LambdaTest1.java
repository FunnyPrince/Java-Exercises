package com.day29;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author FunnyPrince_
 * @date 2021/5/7 - 21:04
 *
 * Lambda表达式的使用
 * 1.举例：(o1,o2) -> Integer.compare(o1,o2);
 * 2.格式：
 *      ->:Lambda操作符 / 箭头操作符
 *      ->:左边：Lambda形参列表（其实就是接口中的抽象方法的形参列表）
 *      ->:右边：Lambda体（其实就是重写的抽象方法的方法体）
 *
 * 3.Lambda表达式额使用：6种情况
 *      总结：
 *      ->:左边：Lambda形参列表的参数类型可以省略(类型推断)；如果Lambda形参列表只有一个参数，()可以省略；
 *      ->:右边：Lambda体应该使用{}包裹；如果Lambda体只有一条执行语句（可能是return语句），可以省略{}和return关键字；
 *
 *
 *
 * 4.Lambda表达式的本质：作为函数式接口的实例
 * 5.如果一个接口中只声明了一个抽象方法，此接口成为函数式接口
 */
public class LambdaTest1 {
    //语法格式一：无参、无返回值
    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable接口的匿名实现类对象");
            }
        };
        r1.run();
        System.out.println("*****************");

        Runnable r2 =  () ->  System.out.println("使用Lambda表达式");
        r2.run();
    }

    //二：Lambda需要一个参数，但是没有返回值
   @Test
    public void test2(){
       Consumer<String> con = new Consumer<String>() {
           @Override
           public void accept(String s) {
               System.out.println(s);
           }
       };
       con.accept("开始的我是这样的");
       System.out.println("***********************");

       Consumer<String> con1 = (String s) -> {
           System.out.println(s);
       };
       con1.accept("改造成Lambda表达式的写法长这样");

   }

   //三：数据类型可以省略，可由编译器推断得出，成为“类型推断”
    @Test
    public void test3(){

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("改造成Lambda表达式的写法长这样");
        System.out.println("************优化************");

        Consumer<String> con2 = (s) -> {
            System.out.println(s);
        };
        con2.accept("改造成Lambda表达式的写法长这样");
    }

    //四：Lambda若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test4(){

        Consumer<String> con = s -> {
            System.out.println(s);
        };
        con.accept("吧啦吧啦");
    }
    //五：Lambda需要两个及以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test5(){
        Comparator<Integer> com = (o1,o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(com.compare(15,6));
    }

    //六：当Lambda体只有一条语句时，return与大括号若有，都可以省略
    @Test
    public void test6(){

        Comparator<Integer> com = (o1,o2) ->  o1.compareTo(o2);
        System.out.println(com.compare(15,16));
    }
}

