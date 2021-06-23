package com.day28;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author FunnyPrince_
 * @date 2021/5/4 - 0:31
 * 获取当前运行时类的属性结构
 *
 *  * 获取当前运行时类的属性结构FileTest.java / MethodTest.java / OtherTest.java
 *  * 指路Person类使用到的父类Creature,接口MyInterface,注解MyAnnotation,
 *  * 了解内容
 */
public class FileTest {
    @Test
    public void test1(){
        Class clazz = Person.class;
        //获取属性结构
        //getFields():获取当前运行类及其父类中生命为public的属性
        System.out.println("getFields():获取当前运行类及其父类中生命为public的属性");
        Field[] fields = clazz.getFields();
        for(Field f : fields){
            System.out.println(f);
        }
        System.out.println("getDeclaredFields():获取当前运行时类中声明的所有属性，不包含父类中的属性");
        //getDeclaredFields():获取当前运行时类中声明的所有属性，不包含父类中的属性
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            System.out.println(f);
        }
    }
    //权限修饰符 数据类型 变量名 = ...
    @Test
    public void test2(){
        Class clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            //1.权限修饰符
            int modifiers = f.getModifiers();
            System.out.print(modifiers + "\t");//2 0 1
            //将数字权限转换成常用的
            System.out.print(Modifier.toString(modifiers) + "\t");//Modifier类的
            //2.数据类型
            Class type  = f.getType();
            //getName()获取当前class的名
            System.out.println(type.getName() + "\t");

            //3.变量名
            String fName = f.getName();
            System.out.print(fName);
        }
    }

}
