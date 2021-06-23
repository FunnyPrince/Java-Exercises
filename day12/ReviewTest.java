package com.day12;

/**
 * @author FunnyPrince_
 * @date 2021/4/6 - 23:22
 *
 * 数组可以看成是特殊的类，也可以继承Object类的方法
 */
public class ReviewTest {
    public static void main(String[] args) {
        ReviewTest test = new ReviewTest();
        int[] arr = new int[]{1,2,3};
        test.print(arr);
        test.test1();
        System.out.println(arr.getClass());//自己的类：class [I
        System.out.println(arr.getClass().getSuperclass());//父类:class java.lang.Object
    }
    //关于toString()
    public void test1(){
        String s = "abc";
        s = null;
        System.out.println(s);//null
        System.out.println("当s!=null时，上下两个语句一样");
        System.out.println(s.toString());//NullPointerExcepetion
    }
    public void print(Object obj){
        System.out.println(obj);
    }

}
