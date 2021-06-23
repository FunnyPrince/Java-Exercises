package com.day15;

/**
 * @author FunnyPrince_
 * @date 2021/4/9 - 23:12
 *
 *  4.3开发中局部内部类的使用
 */
public class InnerClassTest1 {

    //开发中很少见
    public void method(){
        //局部内部类
        class AA{

        }
    }

    //返回一个Comparable接口类的对象:局部内部类
    //方式一：
    public Comparable getComparable(){//getComparable()方法不能少()
        //创建一个实现了Comparable接口的类
        //方式一：
//        class MyComparable implements Comparable{
//            public int compareTo(Object o){
//                return 0;
//            }
//
//        }
//        return new MyComparable();

        //    //方式二：创建了接口的匿名实现类的匿名对象
            return new Comparable(){
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };


    }



}
