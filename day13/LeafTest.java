package com.day13;

/**
 * @author FunnyPrince_
 * @date 2021/4/7 - 22:04
 *
 * 总结：由父及子，静态先行
 */
public class LeafTest {
    public static void main(String[] args) {
        new Leaf();
        System.out.println("********");

        new Leaf();
    }
}
class Root{
    static{
        System.out.println("root的静态初始化块");
    }
    {
        System.out.println("root的非静态初始化块");
    }
    public Root(){
        //super();省略了 ==》Object
        System.out.println("root的无参构造器");
    }
}
class Mid extends Root{
    static{
        System.out.println("Mind的static初始化块");
    }
    {
        System.out.println("Mind的非static初始化块");
    }
    public Mid(){
        System.out.println("Mid的无参构造器");
    }
    public Mid(String msg){
        //通过this调用同一类中重载的构造器
        //super();省略了==》Root
        this();
        System.out.println("mid的带参构造器,参数为：" +msg);
    }
}
class Leaf extends Mid{
    static{
        System.out.println("Leaf的static初始化块");
    }
    {
        System.out.println("Leaf的非static初始化块");
    }
    public Leaf(){
        //通过super调用父类中午餐狗奥奇
        super();
        System.out.println("Leaf的无参构造器");
    }
}