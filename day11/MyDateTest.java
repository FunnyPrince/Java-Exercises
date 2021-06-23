package com.day11;

/**
 * @author FunnyPrince_
 * @date 2021/4/6 - 0:56
 */
public class MyDateTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14,3,1976);
        MyDate m2 = new MyDate(14,3,1976);
/*没重写equals()前，都不等于
        if(m1 == m2) {
            System. out . println("m1==m2") ;
        } else {
            System. out. println("m1!=m2"); //ml != m2
        }
        if (m1.equals(m2)) {
            System. out. println("m1 is equal to m2");// ml is equal to m2
        } else {
            System. out . println("m1 is not equal to m2");
        }
*/
        System.out.println(m1.equals(m2));
    }

}
class MyDate{
    private int day;
    private int month;
    private int year;

    MyDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof MyDate){
            MyDate mydate = (MyDate)obj;
            return this.day == mydate.day && this.month == mydate.month &&
                    this.year == mydate.year;
        }
            return false;
    }
}