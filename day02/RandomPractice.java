package com.day02;

/**
 * @author FunnyPrince_
 * @date 2021/3/24 - 23:22
 *
 *
 * 如何获取一个随机数：10-99
 * 注意：double value = Math.random(); //[0.0,  1.0) 左闭右开
 *注意：(Math.random()*(b-a+1)+a)必须加(),不然先运算(int)Math.random()=0  0*(b-a+1)=0  0+a=a;
 * 公式：  [a,b]:  (int)(Math.random()*(b-a+1)+a)
 * random()*的数字=99-10+1(右-左+1)  然后再+10(左边的数)
 */
public class RandomPractice {
    public static void main(String[] args) {
        //double value = Math.random(); //[0.0,  1.0) 左闭右开
        //10-99的随机数
        // [0.0,  1.0)-->[0.0 , 90.0)-->[10.0, 100.0)
        //random()*的数字=99-10+1(右-左+1)  然后再+10(左边的数)
        int value =(int)(Math.random() * 90 + 10); //通过强转获得int整型
        System.out.println(value);






    }
}
