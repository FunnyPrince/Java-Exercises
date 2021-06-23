package com.day22;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author FunnyPrince_
 * @date 2021/4/20 - 19:37
 *
 * jdk5.0新增了foreach循环，用于遍历集合和数组
 *
 *
 */
public class ForTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);

        //for(集合/数组中元素的类型 局部变量 集合对象/数组对象)
        //内部仍然调用了迭代器
        for(Object obj:coll){
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5,6};
        for (int i : arr){
//            System.out.println(arr[i]);//java.lang.ArrayIndexOutOfBoundsException: 6
            System.out.println(i);
        }
    }

    //笔试题：
    @Test
    public void test3(){
        String[] arr = new String[]{"AA","BB","CC"};
//        //方式一：普通for赋值：
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "DD";//用本身数组元素在赋值
//        }
        //方式二：增强for循环
        for(String s : arr){//将arr赋值给s
            s = "DD";//s是局部变量，不会改变arr[i]原本的值
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//AA BB CC

        }
    }
}
