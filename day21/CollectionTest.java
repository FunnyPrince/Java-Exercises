package com.day21;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author FunnyPrince_
 * @date 2021/4/19 - 23:28
 *
 * 一、集合框架的概述
 *
 * 1.集合、数组都是对多个数据进行存储操作的结构，简称java容器
 *      说明：此时的存储，主要指的是内存层面的存储，不涉及到持久化的存储（.txt,.ijp,.avi,数据库中）
 *
 * 2.数组再存储多个数据方面的特点：
 *      ①一旦初始化以后，其长度确定了；
 *      ②数组一旦定义好，其元素类型也就确定了,我们只能操作指定类型的数据。
 *      比如：String[] arr, int[] arr1, Object[] arr2;
 * 3.数组在存储多个数据方面的缺点：
 *      ①一旦初始化以后，其长度不可修改
 *      ②数组中提供的方法非常有限，对于添加、删除、插入数据等操作，非常不方便，同时效率不高
 *      ③获取数组中实际元素的个数的需求，数组没有现成的属性/方法可用
 *      ④数组存储数据的特点：有序、可重复。对于无需、不可重复的需求，数组不能满足。
 *  二、集合框架
 *     |___Collection接口：单列集合：用来存储一个一个的对象
 *         |---List接口：存储有序的、可重复的数据。-->“动态”数组
 *             |---ArrayList、LinkedList、Vector==》指路day22.ListTest.java
 *
 *         |---Set接口：存储无序的，不可重复的数据。-->类似于数学的“集合”
 *             |---HashSet、LinkedHashSet、TreeSet
 *
 *     |---Map接口：双列集合，用来存储一对一对的（key-value）数据。-->函数
 *         |---HashMap、LinkedHashMap、TreeMap、HashTable、Properties
 *
 *Collection接口中的方法==>指路CollectionTest1
 *
 */
public class CollectionTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();

        //add(Object e):将元素e添加到集合coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(123);//自动装箱
        coll.add(new Date());

        //size():获取添加的元素的个数
        System.out.println(coll.size());//4

        //addAll(Collection coll1):将coll1集合中的元素添加到当前的集合中
        Collection coll1 = new ArrayList();
        coll1.add(46);
        coll1.add("CC");
        coll.addAll(coll1);
        System.out.println(coll.size());//6
        System.out.println(coll);//[AA, BB, 123, Tue Apr 20 00:00:49 CST 2021, 46, CC]

        //isEmpty():判断当前集合是否为空,size是否为0
        System.out.println(coll.isEmpty());//false
        //clear():清空集合元素
        coll.clear();
        System.out.println(coll.isEmpty());//true

    }
}
