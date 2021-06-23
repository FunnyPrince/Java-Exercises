package com.day05;

/**
 * @author FunnyPrince_
 * @date 2021/3/27 - 23:27
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.name = "Jerry";
        p1.age = 22;
//        p1.sex = 1;
        p1.study();
        p1.showAge();
        int newAge = p1.addAge(2);   //p1调用的addAge，所以在p1指向的age中修改了
        System.out.println(p1.name + "的新年龄：" + newAge);  //24  只是show出来了
        System.out.println(p1.age); //24

        Person1 p2 = new Person1();
        p2.showAge();  //0    新new的
        p2.addAge(10);
        System.out.println(p2.age);  //10
    }


}



//public class Person1 {    不可以在同一个类中定义两个public的类，类名与public修饰的类同名
class Person1 {
    String name;
    int age;
    //sex:0,女性，sex:男性
    int sex;

    public void study(){

        System.out.println("studying");
    }
    public void showAge(){
        System.out.println("age " + age);
    }
    public int addAge(int i){
        age += i;
        return age;
    }
}

