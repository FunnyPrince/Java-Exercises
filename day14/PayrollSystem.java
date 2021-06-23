package com.day14;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author FunnyPrince_
 * @date 2021/4/8 - 19:42
 *
 * Employee HourlyEmployee SalariedEmployee PayrollSystem
 * 定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用
 * 。
 * 利用循环结构遍历数组元素，输出各个对象的类型，name，number，birthday.
 * 当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 */
public class PayrollSystem{
    public static void main(String[] args) {
        //方式一：
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入当前月份：");
//        int month = scanner.nextInt();

        //方式二：
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);//获取当前月份
        System.out.println(month);//一月份：0


        Employee[] emps = new Employee[2];//new的是数组，堆空间存储的是数组，数组类型是Employee类型，不是Employee对象
        //抽象类不能new
        emps[0] = new SalariedEmployee("Marry",1002,new MyDate(1998,4,6),12000);//birthday是自定义的类，可以new
        emps[1] = new HourlyEmployee("Kitty",1003,new MyDate(1996,5,8),70,240);

        for(int i = 0;i < emps.length;i++){
            System.out.println(emps[i]); //toString()
            double salary = emps[i].earnings();
            System.out.println("您的月工资为：" + salary + "元");

            //我们的月份是程序月份+1
            if((month+1) == emps[i].getBirthday().getMonth()){
                salary +=1000;
                System.out.println(emps[i].getName()+"生日快乐！奖励1000元,您的工资变更为："+ salary + "元");
            }
        }
    }
}
