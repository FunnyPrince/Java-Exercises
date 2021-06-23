package com.day06;

/**
 * @author FunnyPrince_
 * @date 2021/3/28 - 13:29
 *
 * 4.对象数组题目：
 * 定义类Student,包含三个属性:学号number(int)，年级state(int),成绩
 * score(int)。创建20个学生对象， 学号为1到20，年级和成绩都由随机数确定。
 *      >问题一:打印出3年级(state值为3) 的学生信息。
 *      >问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示:
 * 1)生成随机数: Math.random()， 返回值类型double;
 * 2)四舍五入取整: Math.round(double d)，返回值类型long。
 *优化：StudentTest2(可以讲for遍历放进方法中)
 * 5.声明一-个日期类型MyDate:有属性:年year, 月month，日day。 创建2个日期
 * 对象，分别赋值为:你的出生日期，你对象的出生日期，并显示信息。
 * 让天下没方难学的技太
 */
public class StudentTest {
    public static void main(String[] args) {
        //同一个类型的，不必new20个可以用数组装起来
        //String[] arr = new String[];   与String类似，String也是类类型，创建一个Student类就好了
        Student[] stu = new Student[20];

        for(int i = 0; i < stu.length;i++){
            //给数组元素赋值
            stu[i] = new Student();
            //给Student对象的属性赋值
            stu[i].number = (i + 1);
            //年级：[1,6]
            stu[i].state = (int)(Math.random()*(6-1+1) + 1);//强转成int
            //成绩[0,100]
//            stu[i].score = (int)(Math.random()*((100-0+1) + 0);
            stu[i].score = (int)(Math.random()*(100-0+1));
        }

        //遍历学生数组
        for(int i = 0;i < stu.length; i++){
//            System.out.println(stu[i]);// 地址值
         //方法1
          /*  System.out.println(stu[i].number + "," + stu[i].state + ","
            + stu[i].score);*/
            //方法2
            System.out.println(stu[i].info());
        }
        System.out.println("*****************************");
        //问题一:打印出3年级(state值为3) 的学生信息。
         for(int i = 0; i < stu.length; i++){
             if(stu[i].state == 3){
                 System.out.println(stu[i].info());
             }
         }

         System.out.println("*****************************");
//问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for(int i = 0;i < stu.length;i++){
            for(int j = 0;j < stu.length -1 -i;j++){
                if(stu[j].score > stu[j + 1].score){
                    //注意啊：交换的不是成绩，而是按成绩排序的学生！学生！！
                    // 交换的是数组的元素：Student对象！！！！
          /*          int temp = stu[j].score;
                    stu[j].score = stu[j + 1].score;
                    stu[j+1].score = temp;*/
                    Student temp = stu[j];
                    stu[j] = stu[j+1];
                    stu[j+1] = temp;

                }
            }
//            for(int i = 0; i < stu.length; i++){
//                    System.out.println(stu[i].info());
        }
        //遍历学生数组
        for(int i = 0; i < stu.length; i++){
            System.out.println(stu[i].info());
            }

    }
}
class Student{
    int number;//学号
    int state;//年级
    int score;//成绩

    //方法2
    public String info(){
        return "学号：" + number + "  年级：" + state + "  成绩:" + score;
    }




}
