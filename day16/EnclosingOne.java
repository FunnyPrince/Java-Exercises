package com.day16;

/**
 * @author FunnyPrince_
 * @date 2021/4/11 - 14:19
 *
 * day06的刷题
 */
//import com.day16.EnclosingOne.*;
//或者使用InsideOne就导入InsideOne，使用InsideTwo就导入InsideTwo
//import com.day16.EnclosingOne.InsideOne;//   1.
public class EnclosingOne {
    //非静态内部类
    public class InsideOne{    }
    //静态内部类
    public static class InsideTwo{}

}
class EnclosingOneTest{
    public static void main(String[] args) {
        EnclosingOne eo = new EnclosingOne();
        //对于A答案
//        InsideOne ei = eo.new InsideOne();//必须import才可以  与1.结合食用
        //eo.new InsideOne();其实就是new EnclosingOne().InsideOne();
        EnclosingOne.InsideOne ei1 = eo.new InsideOne();//非静态内部类对象
        EnclosingOne.InsideTwo ei2 = new EnclosingOne.InsideTwo();//静态内部类对象
    }
}
