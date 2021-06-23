package com.day07;

/**
 * @author FunnyPrince_
 * @date 2021/3/29 - 21:05
 * 面向对象的特征一：封装与隐藏
 *1.当我们创建一个类的对象以后，可以通过"对象.属性"对对象的属性进行赋值，
 * 这里的赋值操作要受到属性的数据类型和存储范围的制约。无其他制约条件
 * 实际，往往要给属性加一个额外的限定，不能再属性声明时体现，只能通过方法进行限制条件的添加
 * 比如setLegs();
 * 同时要避免用户在使用“对象.属性”的方式对属性进行赋值，则需要声明属性为private
 * -->此时，针对于属性就体现了封装性
 *2.封装性的体现：
 * 将类的属性xxx 私有化private，同时，提供公共的public方法来获取(getXxx)和设置(setXxx)属性的值
 *拓展：封装性的体现：1.上面  2.不对外暴露的私有的方法  3.单利模式  。。。。
 * 3.封装性的体现需要权限修饰符来配合
 *     >java规定的4种权限，从小到大：private /default缺省/protected /public
 *     >4中权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 *     >修饰类，只能缺省、public
 *
 *
 *
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a =new Animal();
        a.name = "花花";
//        a.legs = 4;
        a.getLegs();
        a.setLegs(6);
        a.setLegs(-6);
        a.show();


    }
}
class Animal{
    String name;
    int age;
    private int legs;
   //对于属性的设置
    public void setLegs(int l){
        if(l >=0 && l % 2 ==0){
            legs = l;
        }else{
            legs = 0;
            //抛出一个异常
        }

    }
    //对属性的获取
    public int getLegs(){
        return legs;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void show(){
        System.out.println("名字: " + name +" 腿: " + legs);
    }
}
