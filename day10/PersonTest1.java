package com.day10;

/**
 * @author FunnyPrince_
 * @date 2021/4/2 - 21:38
 *
 * 面向对象特征之三：多态性
 *
 * 理解：一个事务的多种形态
 * 何为多态性：子类对象的多态性：父类的引用指向子类的对象
 *
 *  堕胎的使用：虚拟方法调用
 *  有了对象的多态性以后，编译期，只能调用父类中声明的方法，在运行期，执行子类重写父类的方法
 *  总结：编译看左边，运行看右边
 *
 * 多态性的前提：继承 ， 方法的重写，
 * 对象多态性适用于方法，不适用与属性(编译运行都看左边)
 * *****************************************************
 *
 *
 */
public class PersonTest1 {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 27;
        man.eranMoney();

        //**************************
        //子类对象的多态性：父类的引用指向子类的对象
        System.out.println("**********************************");
        Person p2 = new Man();
//        Person p3 = new Woman();
        //多态的使用：当调用子父类同名同参的方法时，实际执行的是子类重写父类的方法--虚拟方法调用
        p2.eat();

        System.out.println(p2.id);  //打印出Person的id，对于属性编译运行都看左边
        System.out.println("**********************************");
      //不能调用子类特有的方法/属性，编译时：p2是Person类型
//        p2.eranMoney();
        //有了对象的多态性以后，内存中实际上是加载了子类特有的属性/方法，
        //但是由于变量p2声明为父类类型，导致编译时只能调用父类中声明的属性/方法


        //如何才能调用子类特有的属性/方法
        //向下转型：使用强制类型转换符
        Man m1 = (Man) p2; //强转
        m1.isSmoking = true;
        m1.eranMoney();

        //使用强转时，可能出现ClassCastException异常
       /* //instanceof:
       *instanceof 关键字的使用
       * a instancesof A:判断对象a是否是类A的实例，如果是，返回true，否则返回false
       *
       * 使用情境：为了避免在向下转型时出现ClassCastException异常，在向下转型之前，进行instanceof的判断，
       * 返回true，则向下转型，返回false则不向下转型
       *
       * 如果a instanceof A 返回true，则a instanceof B 也返回true
       * 其中，类B是类A的父类
        */
        if(p2 instanceof Woman){
            Woman w1 = (Woman)p2;
            w1.goShopping();
            System.out.println("****Woman***");
        }
        if(p2 instanceof Man){
            Man m2 = (Man)p2;
            m2.eranMoney();
            System.out.println("****Man***");
        }
    }
}
