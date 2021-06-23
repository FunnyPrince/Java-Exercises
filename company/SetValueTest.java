package com.company;

/**
 * @author FunnyPrince_
 * @date 2021/3/23 - 22:19
 */
public class SetValueTest {
    public static void main(String[] args) {
//        int i1 = 10;
//        int j1 = 10;
        int i2,j2;
        i2 = j2 = 10;//连续赋值
        int i3 = 10,j3 = 10;

        int num1 = 10;
        num1 +=2;
        System.out.println(num1);

        int num2 = 12;
        num2 %= 5; //num2=num2%5;
        System.out.println(num2);

        //****************************
        short s1 = 10;
        s1 +=2;//不会改变变量的数据类型
        //s1 = s1 + 2; 会变成int
        System.out.println(s1);

        //开发中，如果实现+2操作，推荐：
//        num +=2;
//        如果实现变量+1，推荐：
//        num++;
        //Practice1:
        int i = 1;
        i *= 0.1;  //不会改变数据类型，即为0
        System.out.println(i);//0
        i++;
        System.out.println(i); //1
        //Practice2:
        int m = 2;
        int n = 3;
        n *= m++; //n= n * m++;
        System.out.println("m="+m);
        System.out.println("n="+n);

        //Practice3:
        int n2 = 10;
        //      n = 10 + 10(括号内先运算为10，后自增为n=11) +12
        n2 +=(n2++) + (++n2);     //n = n + (n++) + (++n);
        System.out.println(n2);  //32






    }
}
