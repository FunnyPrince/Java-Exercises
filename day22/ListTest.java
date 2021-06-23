package com.day22;

import com.day21.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author FunnyPrince_
 * @date 2021/4/20 - 20:25
 * 1.List接口框架
 * *     |___Collection接口：单列集合：用来存储一个一个的对象
 *  *         |---List接口：存储有序的、可重复的数据。-->“动态”数组,替换数组
 *  *             |---ArrayList: 作为List接口的主要实现类；线程不安全的，效率高；底层使用Object[] elementData存储 jdk1.2
 *                |---LinkedList:对于频繁的插入、删除操作，使用此类效率比ArrayList高；底层使用双向链表存储
 *                |---Vector: 作为List接口的古老实现类，线程安全的，效率低；底层使用Object[] elementData存储 jdk1.0
 *
 *  2. ArrayList源码分析：
 *  2.1 jdk7情况：==》类似饿汉式
 *   ArrayList list = new ArrayList(); //底层创建了长度是10的Object[]数组elementData
 *   List.add(123);  //elementData[0] = new Integer(123);
 *   ...
 *   List.add(11); //如果此次添加到底层elementData数组容量不够，则需要扩容，
 *   默认情况下，扩容为原来容量的1.5倍，同时需要将原有数组中的数据复制到新的数组中。
 *
 *   结论：建议开发中使用带参的构造器 ArrayList list = new ArrayList(int capacity);
 *
 *   2.2 jdk8中ArrayList的变化 ==》类似懒汉式
 *   ArrayList list = new ArrayList(); //底层Object[] elementData初始化为{},并没有创建长度为10的数组
 *   List.add(123);  //第一次调用add()时，底层才创建了长度为10的数组，并将数据123添加到elementData数组中。
 *  ...后续的添加和扩容操作与jdk7同
 *
 *  2.3小结：jdk7中的ArrayList的对象的创建类似于单例模式的饿汉式，jdk8中的ArrayList的对象的创建类似于单例模式的懒汉式，
 *  延迟了数组的创建，节省内存
 *
 * 3.LinkedLost源码分析：内部声明了Node类型的first和last属性，默认值为null，
 * list.add(123);//将123封装到Node中，创建了Node对象、
 *  其中，Node定义为：体现了LinkedList的双向链表的说明
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
        this. item = element;
        this.next = next;
        this.prev = prev;
        }
    }

    4.Vector的源码分析：jdk7和jdk8中通过Vector()构造器创建对象时，底层都创建了长度为10的数组
    扩容方面，默认扩容为原来数组长度的2倍。

    5.List接口的常用方法
 *
 *  LinkedList list = new LinkedList():
面试题：比较ArrayList、LinkedList、Vector 三者的异同？
    同：三个类都实现了List接口，存储数据的特点相同：存储有序的、可重复的数据
 */
public class ListTest {
    /*
    void add(int index, object ele): 在index位置插入ele元素
    boolean addAll(int index, Collection eles): 从index位置开始将eles中的所有元素添加进来
    object get(int index): 获取指定index位置的元素
    int index0f(Object obj): 返@obj在集合中首次出现的位置
    int lastIndex0f(object obj): 返回bj在当前集合中末次出现的位置
    object remove(int index): 移除指定index位置的元素，并返回此元素
    object set(int index, object ele): 设置指定index位置的元素为ele
    List sublist(int fromIndex, int toIndex) :返回从fromIndex到toIndex位置的子集合

     */
    @Test
    public void test2(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");

        //方式一：Iterator迭代器方式：
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //方式二：增强for循环
        for(Object obj : list){
            System.out.println(obj);
        }
        //方式三：普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",12));
        System.out.println(list);//[123, 456, AA, Person{name='Tom', age=12}]

        //void add(int index, object ele): 在index位置插入ele元素
        list.add(1,"BB");
        System.out.println(list);//[123, BB, 456, AA, Person{name='Tom', age=12}]
        //boolean addAll(int index, Collection eles): 从index位置开始将eles中的所有元素添加进来
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
        System.out.println(list.size());//8

        //object get(int index): 获取指定index位置的元素
        System.out.println(list.get(1));//BB
        //int index0f(Object obj): 返@obj在集合中首次出现的位置。如果不存在返回-1
        int index = 456;
        System.out.println(list.indexOf(index));//2
        //object remove(int index): 移除指定index位置的元素，并返回此元素
        Object obj = list.remove(0);
        System.out.println(obj);//123,返回删除的元素
        System.out.println(list);//[BB, 456, AA, Person{name='Tom', age=12}, 1, 2, 3]

        //object set(int index, object ele): 设置指定index位置的元素为ele
        list.set(1,"CC");
        System.out.println(list);//[BB, CC, AA, Person{name='Tom', age=12}, 1, 2, 3]

        //List sublist(int fromIndex, int toIndex) :返回从fromIndex到toIndex位置的子集合
        //不会对原本的list造成改变
        List subList = list.subList(1, 4);
        System.out.println(subList);//返回subList：[CC, AA, Person{name='Tom', age=12}]
        System.out.println(list);//[BB, CC, AA, Person{name='Tom', age=12}, 1, 2, 3]
    }
}
