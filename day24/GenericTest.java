package com.day24;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author FunnyPrince_
 * @date 2021/4/27 - 19:32
 *
 * 泛型的使用
 1.jdk5.0新增的特性
 2.在集合中使用泛型：
   总结：
    ①集合接口或集合类在jdk5.0都修改为带泛型的结构。
    ②在实例化集合类时，可以指明具体的泛型类型。
    ③指明完后，在集合类或接口中凡是定义类或接口时，内部结构（构造器，方法，属性等）使用到类的泛型的位置，都指定为实例化的泛型类型。
    比如：add(E e) --> 实例化后： add(Integer e)
    ④注意：泛型的类型必须是类，不能是基本数据类型，可用包装类替换
    ⑤如果实例化时，没有指明泛型的类型，默认类型为java.lang.Object类型。
 3.如何自定义泛型结构：泛型类、泛型接口、泛型方法 ==>指路GenericTest1.java

 */
public class GenericTest {

    //在集合中使用泛型之前的情况：
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        //需求：存放学生成绩
        list.add(78);
        list.add(87);
        list.add(99);
        list.add(66);
        //问题一：类型不安全
//        list.add("Tom");

        for(Object score:list){
            //问题二：强转时，有可能出现ClassCastException
            int stuScore = (int)score;//Integer可自动拆箱，但是Object可转换成int
            System.out.println(stuScore);
        }
    }

    //在集合中使用泛型的情况：ArrayList为例
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<Integer>();//泛型不能使用基本数据类型，需用包装类
        list.add(78);
        list.add(87);
        list.add(99);
        list.add(66);
        //编译时，会进行类型检查，保证数据安全
//        list.add("Tom");

        //方式一：
//        for(Integer score : list){
//            //避免了强转操作
//            int stuScore = score;
//            System.out.println(stuScore);
//        }

        //方式二：
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer stuScore = iterator.next();
            System.out.println(stuScore);

        }
    }

    //在集合中使用泛型的情况：HashMap为例
    @Test
    public void test3(){
//        Map<String,Integer> map = new HashMap<String,Integer>();
        //jdk7新特性：类型推断
        Map<String,Integer> map = new HashMap<>();//前后类型一致，后面的可省略
        map.put("Tom",87);
        map.put("Jerry",99);
        map.put("Alice",88);
        map.put("July",87);

        //泛型的嵌套
        Set<Map.Entry<String,Integer>> entry =  map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> e = iterator.next();
            Integer value = e.getValue();
            String key = e.getKey();
            System.out.println(key+"-->"+value);
        }

    }

}
