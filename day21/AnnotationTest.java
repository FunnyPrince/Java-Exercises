package com.day21;

/**
 * @author FunnyPrince_
 * @date 2021/4/19 - 22:48
 * 注解的使用
 * 1.理解Annotation：
 * jdk5.0新增的功能
 *
 *
 *
 * 2.Annotation示例：
 *
 * 3.如何自定义注解：参照@SuppressWarnings定义
 *     注解声明为：@interface
 *     内部定义成员，通常使用value表示
 *     可以指定成员的默认值，使用default定义
 *     如果自定义注解没有成员，表明是一个表示作用
 * 如果注解有成员，在使用注解是，需要指明成员的值
 * 自定义注解必须配上注解的信息处理流程（使用反射）才有意义。
 * 自定义注解通常都会指明两个元注解：Retention，Target
 * 4.jdk提供的第4种：元注解
 *  元注解：对现有注解进行解释说明的注解
 *  Retention：指定所修饰的Annotation的生命周期：SOURCE/CLASS（默认行为）/RUNTIME，
 *  只有声明为RUNTIME生命周期的注解，才能通过反射获取。
 *  Target：用于指定被修饰的Annotation能用于修饰哪些程序元素
 *  ***********出现频率较低************
 *  Documented：表示所修饰的注解在被javac解析时，保留下来
 *  Inherited：被他修饰的Annotation将具有继承性
 *
 *5.通过反射获取注解信息---
 *6.jdk8 中注解的新特性：可重复注解、类型注解
 *      6.1在
 *
 *
 */
public class AnnotationTest {
}
