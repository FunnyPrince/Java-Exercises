package com.day05;

/**
 * @author FunnyPrince_
 * @date 2021/3/27 - 22:49
 *
 * 类中方法的声明和使用
 * 方法：描述类应该具有的功能
 * eg:  Math类： sqrt()\random()
 *      Scanner类：nextXxx()
 *      Arrays类：sort()\binarySearch()\toString()\equals()
 *
 *方法的声明： 权限修饰符  返回值类型 方法名(形参列表1，形参2){
 *     方法体
 *}
 * 说明：返回值类型：有返回值  vs  无返回值
 *     1.如果方法有返回值，则必须在方法声明时指定返回值的类型，同时方法中需要使用return关键字来返回指定类型的变量或常量
 *     若果方法没有返回值，声明时，void， 通常不使用return，要用就return;(表示结束方法的作用)/return后不可以有表达式
 *     2.1  题目要求
 *     2.2经验决定要不要返回值
 *
 *方法名：属于标识符，遵循标识符的规范
 * 形参列表：方法可以声明0/1/多个形参
 *      格式：数据类型1 形参1，数据类型2 形参2，
 *方法体：方法功能的体现
 *return关键字的使用：
 *      1.使用范围：使用在方法体中
 *      2.作用：结束方法
 *             针对于有返回值类型的方法，使用"return 数据"方法返回所要的数据
 *      3.return后不可以有表达式语句
 *
 * 方法的使用：  可以调用当前类的属性/方法
 *              特殊的方法：方法A中又调用了方法A  ：递归方法
 *              方法中不可以定义方法
 */
public class CustomTest {
    public static void main(String[] args) {


    }
}

class Customer{
    String name;
    int age;
    boolean isMale;

    public void eat(){

    }
    public void sleep(int hour){

    }
    public String getName(){
        return name;
    }
    public String getNation(String nation){
        String info = "国籍：" + nation;
        return info;
    }



}
