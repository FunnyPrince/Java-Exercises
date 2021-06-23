package com.day07;

/**
 * @author FunnyPrince_
 * @date 2021/3/29 - 19:55
 * 递归方法
 * 1.递归方法：一个方法体内调用它自身
 * 2.方法递归包含了一种隐式的循环，会重复执行某段代码，但这种重复执行无需循环控制
 * 递归一定要向已知方向递归，否则就变成了无穷递归，类似于死循环
 */
public class RecursionTest {
    public static void main(String[] args) {

        //例子1:计算1-100之间所有自然数的和

//        int sum = 0;
//        for(int i=1;i<=100;i++){
//            sum +=i;
////            System.out.println(sum);
//        }
//        System.out.println(sum);
        RecursionTest test = new RecursionTest();
        int sum = test.getSum(100);
        System.out.println(sum);
        System.out.println(test.getSum1(500));

        System.out.println(test.f(10));
    }


        public int getSum( int n){
            if (n == 1) {
                return 1;
            } else {
                return n + getSum(n - 1);
            }
        }
    //例子1:计算1-100之间所有自然数的乘积
    public int getSum1(int m){
        if(m == 1){
            return 1;
        }
        else{
            return m * getSum(m-1);
        }
    }
    //例子3.一直一个数列：f(0) = 1,f(1)=4,f(n+2)=2*f(n+1)+f(n),
    //其中n是大于0的整数，求f(10)的值
    public int f(int n){
        if(n==0){
            return 1;
        }else if(n==1){
            return 4;
        }else{
//            return f(n+2) - 2*f(n+1);//栈溢出
            return 2*f(n-1)+f(n-2);//将f(n+2)作为f(n)
        }
    }
    //4.斐波那契数列
    //5.汉诺塔
    //6.快排

}
