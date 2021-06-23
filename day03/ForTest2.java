package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/25 - 19:40
 * 输入两个正整数m, n ,求其最大公约数和最小公倍数
 * 比如：12和20最大公约数是4，最小公倍数是60
 * 说明：break关键字的使用
 */
import java.util.Scanner;
public class ForTest2 {
    public static void main(String[] args) {

        Scanner  scan = new Scanner(System.in);
        System.out.println("请输入第一个正整数：");
        int m = scan.nextInt();

        System.out.println("请输入第二个正整数：");
        int n = scan.nextInt();


        //获取两个数中较小者   公约数不大于m,n
       // for(int i = 1; )
        int min = (m > n)?m : n;
        //遍历获取
        for(int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println(m + "和" + n + "n的最大公约数为：" + i);
                break;//一旦执行到break就跳出循环
            }
        }
        //获取最小公倍数  最小公倍数肯定大于m,n 大的那个
        int max = (m > n)?m : n;
        for(int i = max; i <= m*n; i++ ){
            if(i % m == 0 && i % n ==0){
                System.out.println(m + "和" + n + "n的最小公倍数为：" + i);
                break;
            }
        }


    }
}
