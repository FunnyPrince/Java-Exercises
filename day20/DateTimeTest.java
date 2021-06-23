package com.day20;

import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * @author FunnyPrince_
 * @date 2021/4/18 - 14:24
 *
 * JDK8之前日期和时间的API测试
 * 1.System类中currentTimeMillis();
 * 2.java.util.Date和子类java.sql.Date
 * 3.SimpleDateFormat===>指路DateTimeTest1
 * 4.Calendar
 * 哈哈哈哈，这些过时了，直接指路DateTimeTest2,学习jdk8的吧
 *
 */
public class DateTimeTest {
    /*
    java.util.Date类
    1.两个构造器的使用
        构造器一：Date():创建了一个对应当前时间的Date对象
        构造器二：创建指定毫秒数的Date对象
    2.两个方法的使用
        toString():显示当前的年、月、日、时、分、秒
        getTime():获取当前Date对象对应的毫秒数（时间戳）

    3.java.sql.Date对应数据库中的日期类型的变量
        如何实例化
        sql.Date-->util.Date对象（多态，直接赋值）
        如何将java.util.Date对象转换为java.sql.Date对象
     */
    @Test
    public void test2(){
        //构造器一：Date():创建了一个对应当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());//Sun Apr 18 14:29:34 CST 2021
        System.out.println(date1.getTime());//1618727456204

        //构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(1618727456204L);
        System.out.println(date2);

        java.sql.Date date3 = new java.sql.Date(44613237999L);
        System.out.println(date3);//1971-06-01

        //如何将java.util.Date对象转换为java.sql.Date对象
        //情况一：
//        Date date4 = new java.sql.Date(463232697949L);
//        java.sql.Date date5 = (java.sql.Date)date4;
        //情况二：
        Date date6 = new Date();
        java.sql.Date date7 = new java.sql.Date(date6.getTime());


    }



    //1.System类中的currentTimeMillis()
    @Test
    public void test1(){
    long time = System.currentTimeMillis();
    //返回当前时间与1970年1月1日0分0秒之间以毫秒为单位的时间差
        //成为时间戳
        System.out.println(time);//1618727430189
    }
}
