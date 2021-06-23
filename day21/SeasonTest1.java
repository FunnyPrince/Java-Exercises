package com.day21;

/**
 * @author FunnyPrince_
 * @date 2021/4/19 - 19:11
 *一、枚举类的使用
 * 1.枚举类的理解，类的对象只有有限个，确定的。我们称此类为枚举类
 * 2.当需要定义一组常量时，强烈建议使用枚举类
 * 3.如果枚举类中只有一个对象，则可以作为单例模式的实现方式
 *
 * 二、如何定义枚举类
 * 方式一：jdk5.0之前，自定义枚举类
 * 方式二：jdk5.0，可以使用enum关键字定义枚举类
 *
 * 三、Enum类中的常用方法
 *  values()方法:返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
 *  value0f(String str):可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象
 *  toString():返回当前枚举类对象常期的名称
 *
 * 四、使用枚举类实现接口的情况：
 * 情况一：实现接口，在enum类中实现抽象方法
 * 情况二：让枚举类的对象分别实现接口中的抽象方法
 *
 * 使用enum关键字枚举类
 * 说明：定义的枚举类默认继承于java.lang.Enum类
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring);//SPRING,输出不是地址值，表明toString()被重写过

        //说明父类不是Object，获取它的父类
        System.out.println(Season1.class.getSuperclass());//class java.lang.Enum
        System.out.println("********************");

        //toString():
        System.out.println(spring.toString());
        //values():
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }
        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }

        //valueOf(String objName):返回枚举类中对象名是objName的对象。
        //如果没有objName的枚举类对象，则抛异常：java.lang.IllegalArgumentException
//        Season1 winter = Season1.valueOf("WINTER1");//抛异常
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);//WINTER

        winter.show();//针对情况二，调用winter自己的show(),针对情况一，无论谁调用，结果都一样

    }
}

interface Info{
    void show();//public final abstract

}
//使用enum关键字枚举类
enum Season1 implements Info{

    //1.提供当前枚举类的对象，多个对象之间用" , "隔开，末尾对象" ; "结束
    SPRING ("春天","春"){
        public void show(){//情况二：
        //让每个枚举类对象都实现Info接口的抽象方法：
            System.out.println("spring的show()");
        }
    },
    SUMMER("夏天","夏"){
        @Override
        public void show() {
            System.out.println("winter的show()");
        }
    },
    AUTUMN("秋天","秋"){
        @Override
        public void show() {
            System.out.println("autumn的show()");
        }
    },
    WINTER("冬天","冬"){
        @Override
        public void show() {
            System.out.println("winter的show()");
        }
    };

    //2.声明Season对象的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //3.私有化类的构造器
    //构造器里赋值，并给对象赋值
    private Season1(String seasonName,String seasonDesc){


        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4.其他诉求：获取枚举类对象的属性


    public String getSeasonName() {
        return seasonName;
    }
    public String getSeasonDesc() {
        return seasonDesc;
    }

  /*  @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';*/

    //枚举类实现接口的情况一：实现接口，在enum类中实现抽象方法
//    @Override
//    public void show() {
//        System.out.println("重写接口的抽象方法");
//    }
    //在任何一个地方调用show(),都返回一样的结果,为了在不同地方调用返回不同结果，有了情况二
}
