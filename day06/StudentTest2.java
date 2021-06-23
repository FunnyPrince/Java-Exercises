package com.day06;

/**
 * @author FunnyPrince_
 * @date 2021/3/28 - 14:07
 *
 *  * 4.对象数组题目：
 *      * 定义类Student,包含三个属性:学号number(int)，年级state(int),成绩
 *      * score(int)。创建20个学生对象， 学号为1到20，年级和成绩都由随机数确定。
 *      *      >问题一:打印出3年级(state值为3) 的学生信息。
 *      *      >问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
 *      * 提示:
 *      * 1)生成随机数: Math.random()， 返回值类型double;
 *      * 2)四舍五入取整: Math.round(double d)，返回值类型long。
 *
 *      改进：将操作数组的功能，封装进方法中
 */
public class StudentTest2 {
        public static void main(String[] args) {
           Student1[] stu1 = new Student1[20];

            for(int i = 0; i < stu1.length;i++){
                //给数组元素赋值
                stu1[i] = new Student1();
                //给Student1对象的属性赋值
                stu1[i].number = (i + 1);
                //年级：[1,6]
                stu1[i].state = (int)(Math.random()*(6-1+1) + 1);//强转成int
                //成绩[0,100]
//            stu1[i].score = (int)(Math.random()*((100-0+1) + 0);
                stu1[i].score = (int)(Math.random()*(100-0+1));
            }

            StudentTest2 test = new StudentTest2();
            //遍历学生数组
//            System.out.println(test.print(stu1));// 不可以，是因为print没有返回值
            test.print(stu1);
            System.out.println("我上面是遍历学生数组信息*****************************");

            //问题一:打印出3年级(state值为3) 的学生信息。
            test.searchState(stu1,3);
            System.out.println("我上面是3年级学生信息*****************************");
            //问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
            test.sort(stu1);
            System.out.println("我上面是使用冒泡排序后的学生数组信息，没有输出，但是已经排序啦*****************************");
            //遍历学生数组
            test.print(stu1);
            System.out.println("我上面是遍历学生数组信息(注意是排好序后遍历的哦)*****************************");
        }
        //方法 不可以声明在main()方法里！！！！！！！！！
    //遍历Student1[] 数组的操作
    public void print(Student1[] stu1){
        for(int i = 0;i < stu1.length; i++){
            System.out.println(stu1[i].info());
        }
    }
    //查找Student[]中指定年级的学生信息
    public void searchState(Student1[] stu1,int state){  //从student[]数组中找state
        for(int i = 0; i < stu1.length; i++){
            if(stu1[i].state == state){
                System.out.println(stu1[i].info());
            }
        }
    }

    //使用冒泡排序按学生成绩排序，并遍历所有学生信息
    public void sort(Student1[] stu1){  //给Student[]数组排序
        for(int i = 0;i < stu1.length;i++){
            for(int j = 0;j < stu1.length -1 -i;j++){
                if(stu1[j].score > stu1[j + 1].score){
                    Student1 temp1 = stu1[j];
                    stu1[j] = stu1[j+1];
                    stu1[j+1] = temp1;
                }
            }
        }
    }

}
    class Student1{
        int number;//学号
        int state;//年级
        int score;//成绩

        //方法2
        public String info(){
            return "学号：" + number + "  年级：" + state + "  成绩:" + score;
        }


}
