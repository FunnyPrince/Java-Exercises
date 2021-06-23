package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/28 - 20:16
 * 1.编写程序，定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 * 在主类的main ( )方法中分别用参数区别调用三个方法。
 *
 *
 * 2.定义三个重载方法max(),
 * 第一个方法求两个int值中的最大值，
 * 第二个方法求两个double值中的最大值，
 * 第三个方法求三个double值中的最大值，
 * 并分别调用三个方法。
 */
public class OverLoadExer {
    public static void main(String[] args) {
        OverLoadExer ex = new OverLoadExer();
        ex.max(1, 2);
        ex.max(1.1, 2.1, 3.1);
        ex.max(1.1, 5.1, 3.1);
        System.out.println(ex.max(4.1, 5.1, 3.1));

    }

    public void mOL(int i) {
        System.out.println("i*i");
    }

    public void mOL(int i, int j) {
        System.out.println(i * j);
    }

    public void mOL(String s) {
        System.out.println(s);
    }

    public int max(int i, int j) {
 /*       if (i > j) {
            System.out.println(i + "与" + j + "中最大的值为： " + i);
            return i;
        } else {
            System.out.println(i + "与" + j + "中最大的值为： " + j);
            return j;
        }*/
        //可以使用三元运算符：
        return (i > j) ? i : j;
    }

    public double max(double b1, double b2) {
 /*       if(b1 > b2){
            System.out.println(b1 + "与" + b2 + "中最大的值为： "+b1);
            return b1;
        }else{
            System.out.println(b1 + "与" + b2 +  "中最大的值为： "+b2);
            return b2
        }*/
        //被蠢哭了
        return (b1 > b2) ? b1 : b2;
    }

    public double max(double b1, double b2, double b3) {
        /*if(b1 > b2){
            if(b3 > b1){
                System.out.println(b1 + "," + b2 + "," + b3 + "中最大的是： " + b3);
                return b3;
//            }else if(b3 > b2){
//                System.out.println(b1 + "," + b2 + "," + b3 + "中最大的是： " + b1);
            }else{//只求最大值，没必要分这么细
                System.out.println(b1 + "," + b2 + "," + b3 + "中最大的是： " + b1);
                return b1;
            }
        }
        else if(b2 > b1){
            if(b3 > b2) {
                System.out.println(b1 + "," + b2 + "," + b3 + "中最大的是： " + b3);
                return b3;
            }else{
                System.out.println(b1 + "," + b2 + "," + b3 + "中最大的是： " + b2);
//                    return b2;
            }

        }
        return b2;
    }*/
//        return(b1 > ((b2 ? b3)?b2 : b3))? b1 : ()

        //你看你四不四撒？
        double max = (b1 > b2) ? b1 : b2;
        return (max > b3) ? max : b3;
    }
}