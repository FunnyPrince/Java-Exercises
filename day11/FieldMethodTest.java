package com.day11;

/**
 * @author FunnyPrince_
 * @date 2021/4/5 - 21:17
 *练习：
 * 1.若子类重写了父类方法，就意味着子类里定义的方法彻底覆盖了父类里的同名方法，
 * 系统将不可能把父类里的方法转移到子类中。
 * 2.对于实例变量则不存在这样的现象，即使子类里定义了与父类完全相同的实例变量，
 * 这个实例变量依然不可能覆盖父类中定义的实例变量
 */
public class FieldMethodTest {
    public static void main(String[] args) {
        Sub s = new Sub();
        System. out. println(s.count);   //20   声明的是Sub，先找自己再找父类。
        s.display();  //20?  display()重写
        Base b = s;  //多态性

        //==,对于引用数据类型，比较的是两个引用数据类型变量的地址值是否相同
        System. out.println(b == s);//true
        System. out . println(b. count);  //10，多态性 看左边
        b.display();   //20  虚拟方法调用，调用父类，实际执行子类(子类重写了)
        //(成员变量/静态方法)(属性不具有多态性！)看左边，方法看右边
    }
}
