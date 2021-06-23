package com.day20;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author FunnyPrince_
 * @date 2021/4/18 - 21:53
 *
 *  * JDK8之前日期和时间的API测试
 *  * 1.System类中currentTimeMillis();
 *  * 2.java.util.Date和子类java.sql.Date
 *  * 3.SimpleDateFormat
 *  * 4.Calendar
 */
public class DateTimeTest1 {
    /*SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析
    1.两个操作：
        1.1格式化：日期-->字符串
        1.2解析：格式化的逆过程，字符串-->日期

   2.SimpleDateFormat的实例化



     */
    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat:使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化：日期-->字符串
        Date date = new Date();
        System.out.println(date);//Sun Apr 18 21:58:46 CST 2021

        String format = sdf.format(date);
        System.out.println(format);//21-4-18 下午9:58


        //解析：格式化的逆过程，字符串-->日期
//        String str = "2021-4-5";//Unparseable date: "2021-4-5"
        String str = "2021-4-5 下午9:58";//Mon Apr 05 21:58:00 CST 2021
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        //*************************
        System.out.println("********按照指定的方式格式化和解析，调用带参的构造器************");
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        //格式化
        String format1 = sdf1.format(date);
        System.out.println(format1);//2021.04.18  10:07:52
        //解析:要求字符串必须符合SimpleDateFormat识别的格式（通过构造器形参体现）
        //否则，抛异常
        Date date2 = sdf1.parse("2020.02.26 10:11:58");
        System.out.println(date2);
    }
    /*
    练习一：字符串“2020-09-08”转换为java.sql.Date
    练习二：“三天打渔两天晒网”  1990-01-01  xxxx-xx-xx打渔还是晒网
    举例：2020-09-08  总天数
    总天数 % 5 == 1,2,3:打渔
    总天数 % 5 == 4,0:晒网,除尽情况也是晒网

总天数计算？
方式一：(date1.getTime() - date2.getTime()) / (1000*60*60*24) + 1;
方式二：1990-01-01-->2021-4-18 + 2021-01-01 -->2021-4-18
     */
    @Test
    public void testExer() throws ParseException {
        String birth = "2020-09-08";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(birth);
//        System.out.println(date);//Tue Sep 08 00:00:00 CST 2020默认00:00：00
        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);//2020-09-08
    }

    /*
    Calendar日历类的使用(抽象类)

     */
    @Test
    public void test2(){
        //方式1：创建子类的对象GregorianCalendar
        //方式2：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getClass());//class java.util.GregorianCalendar

        //2.常用方法
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println(calendar.DAY_OF_YEAR);

        //set()
        calendar.set(Calendar.DAY_OF_MONTH,22);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,3);//要减去天数，改成负数
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //getTime():日历类-->Date
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime():Date-->日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

    }
}
