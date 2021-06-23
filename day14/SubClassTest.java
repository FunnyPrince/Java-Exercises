package com.day14;

/**
 * @author FunnyPrince_
 * @date 2021/4/9 - 0:48
 *
 * 父类：SuperClass
 */
public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();
//        s.method1();//Static method may be invoked on containing interface class only
        //知识点1：接口中定义的静态方法，只能通过接口来调用
        CompareA.method1();
        //知识点2:通过实现类的对象，可以调用接口中的默认方法
        //如果实现类重写了接口中的默认方法，调用时，仍然调用的是重写以后的方法
        s.method2();
        //知识点3：如果子类（或实现类）继承的父类和实现的接口中声明了同名同参数的方法
        //子类在没有重写此方法的情况下，默认调用的是父类中的同名同参数的方法
        //类优先原则

        //知识点4：如果实现类实现了多个接口，多个接口中定义了同名同参数的方法，
        //那么在实现类没有重写此方法的情况下，报错，==》接口冲突
        //这就需要我们必须在实现类中重写此方法

        s.method3();
    }
}
class SubClass extends SuperClass implements CompareA,CompareB{
//class SubClass implements CompareA,CompareB{ //接口冲突
// com.day14.SubClass inherits unrelated defaults for method3()
    // from types com.day14.CompareA and com.day14.CompareB
    @Override
    public void method2() {
        System.out.println("对接口中的默认方法的重写");
    }
    //知识点5：如何在子类（实现类）的方法中调用父类 / 接口中被重写的方法
    public void myMethod(){
        method3();//调用自己定义的重写的方法（如果重写了的话）
        super.method3();//调用的是父类中声明的
        CompareA.super.method2();//调用接口中的默认方法
    }
}