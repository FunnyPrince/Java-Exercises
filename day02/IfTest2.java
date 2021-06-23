package com.day02;

/**
 * @author FunnyPrince_
 * @date 2021/3/24 - 22:38
 *
 *if-else可以嵌套
 *if-else中的执行语句只有一行时，{}可以省略，但不建议，会容易出错，
 *
 */
//import java之间没有.
//import.java.util.Scanner;
import java.util.Scanner;
public class IfTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("请输入第一个数字：");
        int num1 = scan.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = scan.nextInt();
        System.out.println("请输入第三个数字：");
        int num3 = scan.nextInt();

        if(num1 >= num2){
            if(num3 >= num1)
                System.out.println(num2 + "<=" + num1 + "<=" + num3);
            else if(num3 <= num2)
                System.out.println(num3 + "<=" + num2 + "<=" + num1);
            else
                System.out.println(num2 + "<=" + num3 + "<=" + num1);
            }
        //else说明上面的if不成立，则表示num1<num2
        else{
            if(num3 >= num2)
                    System.out.println(num1 + "<=" + num2 + "<=" + num3);
            else if(num3 <= num1)
                    System.out.println(num3 + "<=" + num1 + "<=" + num2);
            else
                    System.out.println(num1 + "<=" + num3 + "<=" + num2);
                //只有一行输出语句{}可以省略
            }

        System.out.println();
    }
}
