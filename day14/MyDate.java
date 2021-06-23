package com.day14;

/**
 * @author FunnyPrince_
 * @date 2021/4/8 - 19:13
 *
 * Employee HourlyEmployee SalariedEmployee PayrollSystem
 * * MyDate类包含:
 * private成员变量year, month,day↑
 * toDatestring( )方法返回日期对应的字符事: xxxx年Xx月xx日
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year,int month,int day){
//        return;
        super();
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toDateString(){
        return year + "年" + month + "月" + day + "日";
    }
}
