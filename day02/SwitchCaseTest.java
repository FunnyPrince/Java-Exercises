package com.day02;

/**
 * @author FunnyPrince_
 * @date 2021/3/24 - 23:58
 *
 *
 * switch(表达式){
 *     case 常量1：
 *     执行语句1；
 *     //break;
 *
 *     case 常量2：
 *     执行语句2；
 *     //break；
 *     ……
 *
 *     default:
 *     执行语句；
 *     //break;
 *说明： 1.根据switch表达式的值，依次匹配各个Case中的常量，一旦匹配成功，进入相应case中执行语句；
 *       但还会调用其他语句直到遇到break或者此switch-case末尾结束为止。
 *    2.break 表示一旦执行到break，跳出此结构
 *    3.switch结构中的表达式，只能是下面6种数据类型之一：byte,short,int,char,枚举类型(JDK5.0)，String(JDK7.0)
 *     4. case之后只能声明常量，不能声明范围
 *     5. break关键字，可选择不加
 *     6. default 相当于 if-else中的 else
 *         default结构是可选的，可写可不写，而且位置灵活
 */

//  case "Spring"
public class SwitchCaseTest {
    public static void main(String[] args) {
        int number = 2;

        switch(number){

            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("other");
                break;
        }


    }
}
