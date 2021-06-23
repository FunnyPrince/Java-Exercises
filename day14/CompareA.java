package com.day14;

/**
 * @author FunnyPrince_
 * @date 2021/4/9 - 0:43
 * JDK8:除了定义全局常量和抽象方法外，还可以定义静态方法、默认方法
 * ==>SubClassTest
 *
 */
public interface CompareA {
    //静态方法
    public static void method1(){
        System.out.println("静态方法");
    }
    //默认方法
    public default void method2(){
        System.out.println("默认方法");
    }
    default void method3(){//省略了public，并不是权限变成default
        System.out.println("省略了public的默认方法,CompareA接口中的method3()");
    }
}
