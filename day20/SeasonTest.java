package com.day20;

/**
 * @author FunnyPrince_
 * @date 2021/4/19 - 1:10
 *
 *
 * ==》指路day21.SeasonTest1
 * 一、枚举类的使用!
 * 1.枚举类的理解:类的对象只有有限个，确定的。我们称此类为校举类
 * 2.当需要定义一-组常量时，强烈建议使用枚举类
 * 3.如果故举类中只有一个对象，则可以作为单例模式的实现方式。
 *
 * 二、如何定义枚举类
 * 方式1：jdk5.0之前，自定义枚举类
 * 方式2：jdk5.0，可以使用enum关键字定义枚举类
 *
 * 三、Enum类中的常用方法
 *  *  values()方法:返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
 *  *  value0f(String str):可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象
 *  *  toString():返回当前枚举类对象常期的名称
 *  *
 *  * 四、使用枚举类实现接口的情况：
 *  * 情况一：实现接口，在enum类中实现抽象方法
 *  * 情况二：让枚举类的对象分别实现接口中的抽象方法
 *  *
 *  * 使用enum关键字枚举类
 *  * 说明：定义的枚举类默认继承于java.lang.Enum类
 */
public class SeasonTest {
    public static void main(String[] args) {
       Season spring = Season.SPRING;
        System.out.println(spring);
    }
}

    //自定义枚举类
class Season{
    //1.声明Season对象的属性：private final修饰
        private final String seasonName;
        private final String seasonDesc;
    //2.私有化类的构造器
        //构造器里赋值，并给对象赋值
        private Season(String seasonName,String seasonDesc){
            this.seasonName = seasonName;
            this.seasonDesc = seasonDesc;
        }
        //3.提供当前枚举类的对象:public static final的
        public static final Season SPRING = new Season("春天","春");
        public static final Season SUMMER = new Season("夏天","夏");
        public static final Season AUTUMN = new Season("秋天","秋");
        public static final Season WINTER = new Season("冬天","冬");

        //4.其他诉求：获取枚举类对象的属性


        public String getSeasonName() {
            return seasonName;
        }
        public String getSeasonDesc() {
            return seasonDesc;
        }

        @Override
        public String toString() {
            return "Season{" +
                    "seasonName='" + seasonName + '\'' +
                    ", seasonDesc='" + seasonDesc + '\'' +
                    '}';
        }
}



