package com.day07;


/**
 * @author FunnyPrince_
 * @date 2021/3/29 - 22:10
 * 1.创建程序，在其中定义两个类: Person和PersonTest类. 定义如下:
 * 用setAge( )设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 * 在PersonTest类中实例化Person类的对象b，调用setAge( )和getAge()方法，体会Java的封装性
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(12);
        System.out.println(p1.getAge());
    }
}

class Person{
    private int age;
    public void setAge(int a){
        if(a<0 || a>130){
        throw new RuntimeException("传入的数据非法");
        }else{
            age = a;
        }
    }
    public int getAge(){
        return age;
    }
}


