package com.day29;

import com.day22.Employee;
import com.day22.MyDate;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author FunnyPrince_
 * @date 2021/5/7 - 22:07
 *
 * 方法引用的使用
 * 1.使用情境：党要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用；
 * 2.方法引用，本质上就是Lambda表达式，而Lambda表达式作为函数式接口，的实例。
 *  所以，方法引用，也是函数式接口的实例。
 *  3.使用格式： 类 / 对象 :: 方法名
 *  4.具体分为三种情况：
 *      对象 :: 非静态方法
 *      类   :: 静态方法
 *
 *      类   :: 非静态方法
 *
 * 5.方法引用使用的要求：接口中的抽象方法的形参列表和返回值类型与
 *          方法引用的方法的形参列表和返回值类型都相同。
 *
 */
public class MethodRefTest {
    //情况1：对象 :: 实力方法
    //Consumer中的void accept(T t)
    //PrintStream中的void println(T t)
    @Test
    public void test1(){
        Consumer<String> con1 = str -> System.out.println(str);
        con1.accept("Lambda表达式");
        System.out.println("*********************");

        PrintStream ps = System.out;
        Consumer<String> con2 = ps :: println;
        con2.accept("方法引用:: ");

    }

    //Supplier中的T get()\//Employee中的String getName()
    @Test
    public void test2(){
        Employee emp = new Employee("Tom",23,new MyDate(1997,6,8));
        Supplier<String> sup1 = () -> emp.getName();
        System.out.println(sup1.get());

        System.out.println("方法引用：");
        Supplier<String > sup2 = emp :: getName;
        System.out.println(sup2.get());

    }
}
