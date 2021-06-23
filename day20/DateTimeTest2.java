package com.day20;

import org.junit.jupiter.api.Test;

import java.time.*;

/**
 * @author FunnyPrince_
 * @date 2021/4/18 - 23:16
 *
 * jdk8中日期时间API的测试
 */
public class DateTimeTest2 {
    /*
    LocalDate,LocalTime,LocalDateTime 的使用
    1.LocalDateTime相较于LocalDate,LocalTime，使用频率较高
    2.类似于Calendar
     */
    @Test
    public void test1(){

        //now():当前时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of():设置指定的年与日时分秒，没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 4, 6, 21, 56);
        System.out.println(localDateTime1);

        //getXxx():获取相关的属性
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

        //withDayOfMonth():体现不可变性，
        //withXxx():设置相关的属性
        LocalDateTime localDateTime2 = localDateTime.withDayOfMonth(22);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

//        localDateTime.withDayOfYear(2022);//Invalid value for DayOfYear (valid values 1 - 365/366): 2022
        localDateTime.withDayOfYear(20);

        //不可变性
        LocalDateTime localDateTime3 = localDateTime.plusMonths(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);

        LocalDateTime localDateTime4 = localDateTime.minusDays(6);
        System.out.println(localDateTime4);
    }

    /*
    Instant使用
    类似于java.util.Date;类
     */
    @Test
    public void test2(){
        //now():获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);//2021-04-18T15:44:10.874Z

        //添加时间偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//2021-04-18T23:44:10.874+08:00

        //获取从1970.1.1 0:0:0开始的毫秒数
        long milli = instant.toEpochMilli();
        System.out.println(milli);//1618760761309

        //ofEpochMilli():通过给定的毫秒数，获取Instance实例，
        Instant instant1 = Instant.ofEpochMilli(1618760761309L);
        System.out.println(instant1);//2021-04-18T15:46:01.309Z

    }
}
