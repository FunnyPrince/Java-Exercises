package com.company;

/**
 * @author FunnyPrince_
 * @date 2021/3/23 - 22:43
 *
 * 比较运算符的结果是boolean类型
 *
 */
public class CompareTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        System.out.println(i==j); //false
        System.out.println(i=j);//20

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b2==b1); //false
        System.out.println(b2=b1);//true

        if(b1==true){
            System.out.println("结果为真");
        }
        else{System.out.println("结果为假");}
    }
}
