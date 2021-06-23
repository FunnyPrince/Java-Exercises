package com.day15;

/**
 * @author FunnyPrince_
 * @date 2021/4/10 - 0:29
 *规定：
 * 在局部内部类的方法中（比如show())，如果调用局部内部类所声明的方法(比如method())中的局部变量(比如num)的话，
 *要求此局部变量声明为final的
 */
public class InnerClassTest2 {

    public void method(){
        int num = 10; //JDK8以上可以省略final，但是final
        class AA{
            public void show(){
//                num = 20;//Variable 'num' is accessed from within inner class,
                // needs to be final or effectively final
                System.out.println(num);
            }
        }
    }
}
