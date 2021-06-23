package com.day29;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

/**
 * @author FunnyPrince_
 * @date 2021/5/7 - 20:46
 *
 * Lambda表达式使用举例
 */
public class LambdaTest {
    @Test
    public void test1(){
        //提供一个Runnable接口的匿名实现类对象
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
    @Test
    public void test2(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        int compare1 = com1.compare(12,21);
        System.out.println(compare1);
        System.out.println("****Lambda****");

        //Lambda表达式
        Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1,o2);

        int compare2 = com2.compare(45,65);
        System.out.println(compare2);

        System.out.println("*****方法引用****");

        //方法引用
        Comparator<Integer> com3 = Integer :: compare;
        int compare3 = com3.compare(63,32);
        System.out.println(compare3);
    }
}
