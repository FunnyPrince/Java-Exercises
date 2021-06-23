package com.day13;

/**
 * @author FunnyPrince_
 * @date 2021/4/7 - 22:17
 */
class Father{
    static {
        System.out.println("Father的static初始化代码块");
    }
    {
        System.out.println("father的非static初始化代码块");
    }
    public Father(){
        System.out.println("father的无参构造器");
    }
}
public class Son extends Father{
    static{
        System.out.println("son的static初始化块");
    }
    {
        System.out.println("son的非static初始化块");
    }
    public Son(){
        System.out.println("son的无参构造器");
    }
//调用static方法之前得先加载类
    public static void main(String[] args) {
        System.out.println("main()的执行语句1");
        System.out.println("**************接下来newson()**********");
        new Son();
        System.out.println("***************new son()完成*********");

        new Son();
        System.out.println("*************再次new son()完成，下面是new father()*************");
        new Father();

    }
}
