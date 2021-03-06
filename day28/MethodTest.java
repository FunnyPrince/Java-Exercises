package com.day28;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author FunnyPrince_
 * @date 2021/5/4 - 0:46
 * 获取运行类的方法结构
 *
 *  * 获取当前运行时类的属性结构FileTest.java / MethodTest.java / OtherTest.java
 *  * 指路Person类使用到的父类Creature,接口MyInterface,注解MyAnnotation,
 *  * 了解内容
 */
public class MethodTest {
    @Test
    public void test1(){
        Class clazz = Person.class;

        System.out.println("getMethod():获取当前运行时类及其所有父类中public的方法");
        //getMethod():获取当前运行时类及其所有父类中public的方法
        Method[] methods = clazz.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }

        System.out.println("getDeclaredMethods():获取当前运行时类中所有声明的方法");
        //getDeclaredMethods():获取当前运行时类中所有声明的方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method m : declaredMethods){
            System.out.println(m);
        }
    }

    /*
    @Xxxx
    权限修饰符 返回值类型 方法名(参数类型1 形参名1,...) throws XxxException{}
     */
    @Test
    public void test2(){

        Class clazz = Person.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method m : declaredMethods){
            //1.获取方法声明的注解
            Annotation[] annos = m.getAnnotations();
            for(Annotation a : annos){
                System.out.println(a);
            }
            //2.权限修饰符
            System.out.print(Modifier.toString(m.getModifiers()) + "\t");

            //3.返回值类型
            System.out.print(m.getReturnType().getName()+"\t");

            //4.方法名
            System.out.print(m.getName() + "(");
            //5.形参列表
            Class<?>[] parameterTypes = m.getParameterTypes();
            if( !(parameterTypes == null && parameterTypes.length == 0)){
                for(int i = 0; i < parameterTypes.length; i++){
                    if(i == parameterTypes.length -1){
                        System.out.print(parameterTypes[i].getName() + "args" + i + ")" );
                        break;
                    }
                    System.out.print(parameterTypes[i].getName() + "args" + i +",");
                }
            }

            //6.抛出的异常
            Class<?>[] exceptionTypes = m.getExceptionTypes();
//            if( !(exceptionTypes == null && exceptionTypes.length == 0)){
//                System.out.print("throws ");
//                for (int i = 0; i < exceptionTypes.length; i++) {
//                    if(i == exceptionTypes.length - 1){
//                        System.out.println(exceptionTypes[i].getName());
//                        break;
//                    }
//                    System.out.println(exceptionTypes[i].getName() + ",");
//                }
//            }
            if(exceptionTypes.length > 0){ //exceptionTypes[]有长度，表示有Exception抛出
                System.out.print(" throws ");
                for (int i = 0; i < exceptionTypes.length; i++) {
                    if(i == exceptionTypes.length - 1){
                        System.out.println(exceptionTypes[i].getName());
                        break;
                    }
                    System.out.println(exceptionTypes[i].getName() + ",");
                }
            }
            System.out.println();


        }
    }
}
