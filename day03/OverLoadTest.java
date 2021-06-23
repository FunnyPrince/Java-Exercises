package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/28 - 19:55
 *
 * 重载的概念
 * 1.在同一个类中，允许存在一 个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
 * >  特点：重载的特点
 * 与返回值类型无关，只看参数列表，且参数列表必须不同。(参数个数或参数类型)。
 * 调用时，根据方法参数列表的不同来区别。
 * 2.重载示例:  Arrays类中重载的sort() / binarySearch()
 *
 * 3.判断是否是重载：
 * 跟方法的权限修饰符、返回值类型、形参变量名(int i,int j-->int m,int n)/方法体都没有关系
 * 4.在通过对象调用方法时，如何确定某一个指定的方法：
 *    >方法名--->参数列表
 *
 */
public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest test = new OverLoadTest();
        test.getSum(1,2);//若注释掉下面的1方法，也不会报错，自动类型提升！
    }
    public void getSum(int i,int j){
        System.out.println("int i, int j 类型");
    }
    public void getSum(double b1,double b2){
        System.out.println("double b1, double b2 类型");
    }
    public void geSum(String s,int i){
        System.out.println("String i, int i 类型");
    }
    public void getSUm(int i,String s){
        System.out.println("int i, String s 类型");
    }
}
