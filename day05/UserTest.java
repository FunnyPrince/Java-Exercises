package com.day05;

/**
 * @author FunnyPrince_
 * @date 2021/3/27 - 22:34
 *
 * 属性（成员变量）  vs  局部变量
 * 1.相同点：
 *          >定义变量的格式
 *          先声明，后使用
 *          变量都有其对应的作用域
 *
 * 2.不同点：
 *      >1.在类中声明的位置不同
 *      属性：直接定义在类的一对{}内
 *      局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
 *      >2.关于权限修饰符的不同
 *      属性：可以子啊声明属性时，致命其权限，使用权限修饰符
 *      常用：private/public/缺省(默认)/protected
 *      局部变量：不可以使用权限修饰符
 *      >3.默认初始化值：
 *      属性：根据其类型，有默认初始化值
 *      整型(byte/short/int/long):0
 *      浮点型(float/double)0.0
 *      字符型(char):0  /  ('\u0000')
 *      布尔型(boolean):false
 *
 *      局部变量：没有初始化值
 *      意味着，在调用局部变量前，必须要显式赋值
 *      特别的：形参在调用是，赋值
 *      >4.在内存中加载的位置
 *      属性：加载到堆空间中(非static
 *      局部变量：栈内存
 *
 */
public class UserTest {
    public static void main(String[] args) {

        User u1 = new User();
//        u1.language("汉语");
        u1.talk("汉语");

    }


}
class User{
    //属性/成员变量
    String name;
    int age;
    boolean isMale;

    public void talk(String language){// 形参，也是局部变量
        System.out.println("使用的语言：" + language);

    }

    public void eat(){
        String food = "烙饼"; //局部变量
        System.out.println(food);

    }

}
