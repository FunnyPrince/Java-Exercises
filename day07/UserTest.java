package com.day07;

/**
 * @author FunnyPrince_
 * @date 2021/3/29 - 22:56
 * 总结：属性赋值的先后顺序
 * 1.默认初始化
 * 2.显式初始化
 * 3.构造器中赋值
 * 4.通过"对象.方法"/"对象.属性"方式
 *
 * 先后顺序：1-2-3-4
 * 123只执行一次，就是初始化，4可以反复执行，反复赋值
 *
 */
public class UserTest {
    public static void main(String[] args) {
        User u = new User();
        System.out.println(u.age);

        User u1 = new User(2);  //2
        u1.setAge(3);//3
        System.out.println(u1.age);
    }
}
class User{
    String name;
    int age = 1;
    public User(){

    }
    public User(int a){
        age = a;
    }
    public void setAge(int a){
        age = a;
    }
}
