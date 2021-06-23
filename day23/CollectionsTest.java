package com.day23;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author FunnyPrince_
 * @date 2021/4/21 - 23:39
 *
 * Collections：操作Collection、Map的工具类

 * 面试题：Collection和Collections的区别？

 */
public class CollectionsTest {
    /*
    reverse(List): 反转List 中元素的顺序
    shuffle(List): 对List 集合元素进行随机排序
    sort(List): 根据元素的自然顺序对指定List 集合元素按升序排序
    sort(List, Comparator): 根据指定的Comparator 产生的顺序对List集合元素进行排序
    swap(List, int， int): 将指定list 集合中的i处元素和j处元素进行交换

    object max(Collection): 根据元素的自然顺序，返回给定集合中的最大元素
    object max(Collection, Comparator): 根据Comparator指定的顺序，返回给定集合中的最大值
    object min(Collection)
    object min(Collection, Comparator)
    int frequency(Collection, object): 返回指定集合中指定元素的出现次数
    void copy(List dest,List src): 将src中的内容复制到dest中
    boolean replaceALl(List list, object oldVal, object newVal): 使用新值替换List对


     */
    @Test
    public void test1(){
        List list = new ArrayList();
       list.add(123);
       list.add(-97);
       list.add(654);
       list.add(654);
       list.add(654);
       list.add(465);
       list.add(0);
        System.out.println(list);//[123, -97, 654, 654, 654, 465, 0]
        //reverse(List)
        ////方法本身是void，表明list本身被修改
//        Collections.reverse(list);//[0, 465, 654, 654, 654, -97, 123]
        //shuffle(List)
//        Collections.shuffle(list);//随机
//        Collections.swap(list,1,2);//[123, 654, -97, 654, 654, 465, 0]
//        int frequency = Collections.frequency(list, 654);
//        System.out.println(frequency);//3


        System.out.println(list);

        //报异常：java.lang.IndexOutOfBoundsException: Source does not fit in dest
//        List dest = new ArrayList();
//        Collections.copy(dest,list);

        //正确的
        List dest = Arrays.asList(new Object[list.size()]);//造一个Object[],数组长度为list.size()
        System.out.println(dest.size());//list.size = 7
        Collections.copy(dest,list);
        System.out.println(dest);

        /*
        Collections类中提供了多个synchronizedXxx()方法，该方法可将
        指定集合包装成线程同步的集合，从而解决多线程并发访问集合时的线程安全问题
         */
        //返回的list1即为线程安全的List
        List list1= Collections.synchronizedList(list);

    }
}
