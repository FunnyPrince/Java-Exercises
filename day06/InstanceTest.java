package com.day06;

/**
 * @author FunnyPrince_
 * @date 2021/3/28 - 15:31
 *
 * “万事万物皆对象”如何理解
 * 1.在java语言范畴中，我们都将功能、结构等封装到类中，通过类的实例化，来调用具体的具体结构
 *          >Scanner,String
 *          >文件：File
 *          >网络资源：URL
 * 2.涉及到java语言与前段HTML、后端数据库交互时，前后端的结构在java层面交互时，都体现为类、对象
 *
 *二、  内存解析的说明
 * 1.引用类型的变量，只能存储两类值：null  或 地址值(含变量的类型)
 *
 * 三、匿名对象的使用
 * 1.我们创建的对象，没有显式的赋给一个变量名，为匿名对象
 * 2.特征：匿名对象只能调用一次
 * 3.
 */
public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);

        p.sendEmail();
        p.playGame();

        //匿名对象
//        new Phone().sendEmail();
//        new Phone().playGame();

        new Phone().price = 1999;
        new Phone().showPrice();//0.0  给上面的price赋值了，但是这里new了一个新的，默认为0.0,double型

//*******************************************************
        PhoneMall mall = new PhoneMall();
//        mall.show(p);
        //匿名对象的使用,这个用法可以用很多次
        //相当于把这个匿名对象赋给了phone对象
        mall.show(new Phone());
    }
}

class PhoneMall{

    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}
class Phone{
    double price;

    public void sendEmail(){
        System.out.println("发送Email");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
    public void showPrice(){
        System.out.println("手机的价格为：" + price);
    }
}
