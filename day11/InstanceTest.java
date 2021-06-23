package com.day11;

/**
 * @author FunnyPrince_
 * @date 2021/4/5 - 21:31
 *
     * 建立InstanceTest 类，在类中定义方法method(Person e);
     * 在method中:
     * (1 )根据e的类型调用相应类的getInfo()方法。
     * (2 )根据e的类型执行:
 *
     * 如果e为Person类的对象，输出:
     * a person2 ;
 *
     * 如果e为Student类的对象，输出:
     * “a student”
     * a person
     * ”
     * 如果e为Graduate类的对象，输出:
     * “a graduated student
     * a student
     * “a person'
     */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Student());
    }

    public void method(Person e) {
        //虚拟方法调用
        String info = e.getInfo();
        System.out.println(info);
//        System.out.println(e.getInfo());
//循环语句从小到大写
        //方式一：
/*        if(e instanceof Graduate){
            System.out.println("a graduated student");
            System.out.println("a student");
            System.out.println("a person");
        }else if(e instanceof Student){
            System.out.println("a student");
            System.out.println("a person");
        }else{
            System.out.println("a person");

        }*/
        //方式二：
        if (e instanceof Graduate) {  //进graduate就会进student
            System.out.println("a person");
        } else if (e instanceof Student) {//进student就会进person
            System.out.println("a student");
        } else {
            System.out.println("a person");
        }
    }
}
class Person {
    protected String name= "person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}
class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return
                "Name: "+ name + "\nage: "+ age
                        + "\nschool: "+ school;
    }
}
class Graduate extends Student {
    public String major = "IT";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school + "\nmajor:" + major;
    }
}
