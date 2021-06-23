package com.day20;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author FunnyPrince_
 * @date 2021/4/18 - 23:54
 *
 * 商品类--》指路Goods
 *
 * 一、说明：java中的对象，正常情况下，只能进行比较：== !=  不能进行<  >比较
 *     但是开发中，需要对多个对象进行排序，即表示对象的大小
 *     如何实现？使用两个接口中的任何一个：Comparable  /Comparator
 * 二、Comparable接口与Comparator的使用的对比：
 *      Comparable接口方式一旦指定，保证Comparable接口实现类的对象在任何位置都可以比较大小
 *      Comparator接口属于临时性的比较。
 *
 */

public class CompareTest {
    /*
    Comparable接口的使用：自然排序-->Goods
    1.像String、包装类等实现了Comparable接口，重写了compareTo(obj)方法，给出了比较两个对象大小的方法
    2.像String、包装类等重写了compareTo()方法以后，进行了从小到大的排列
    3.重写compareTo(obj)规则：
        如果当前对象this大于形参对象obj，则返回正整数，
        如果小于，返回负数
        如果等于，返回0
    4.对于自定义类，如果需要排序，可以让自定义类实现comparable接口，重写compareTo(obj)
        ，在compareTo(obj)方法中指明如何排序

     */
    @Test
    public void test1(){
        String[] arr = new String[]{"AA","BB","EE","GG","II","DD","CC"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//String重写了CompareTo()
    }
    @Test
    public void test2(){
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("lianxiangMouse",34);
        arr[1] = new Goods("daierMouse",52);
        arr[2] = new Goods("xiaomiMouse",88);
        arr[3] = new Goods("huaweiMouse",118);
        arr[4] = new Goods("MicroSoftMouse",52);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    /*
   Comparator接口的使用:定制排序
   1.背景:
   当元素的类型没有实现java. lang. Comparable接口而又不方便修改代码，
   或者实现Tjava. lang. Comparable接口的排序规则不适合当前的操作，
   那么可以考虑使用Comparator的对象来排序
   2.重写compare(object 01, 0bject 02)方法，比较o1 和02的大小:
   如果方法返回正整数，则表示o1大F02:
   如果返回e，表示相等;
   返回负整数，表示o1 小于o2。


    */
    @Test
    public void test3(){
        String[] arr = new String[]{"AA","BB","EE","GG","II","DD","CC"};
        Arrays.sort(arr,new Comparator(){
//          按照字符串从大到小的顺序排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 = (String)o1;
                    String s2 = (String)o2;
                    return -s1.compareTo(s2);//从大到小

                }
//                return 0;
                throw new RuntimeException("输入的数据类型不一致");
            }
        });//实现类的对象只用一次
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test4(){
        Goods[] arr = new Goods[6];
        arr[0] = new Goods("lianxiangMouse",34);
        arr[1] = new Goods("daierMouse",52);
        arr[2] = new Goods("xiaomiMouse",88);
        arr[3] = new Goods("huaweiMouse",118);
        arr[4] = new Goods("huaweiMouse",105);
        arr[5] = new Goods("MicroSoftMouse",52);

//        Arrays.sort(arr, new Comparator<Goods>() {//泛型
        Arrays.sort(arr, new Comparator() {
            //指定商品比较大小的方式：商品名称到低到高，价格按从高到低
            @Override
//            public int compare(Goods o1, Goods o2) {//泛型
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Goods && o2 instanceof Goods){
                    Goods g1 = (Goods)o1;
                    Goods g2 = (Goods)o2;

                    if(g1.getName().equals(g2.getName())){
                        return -Double.compare(g1.getPrice(), g2.getPrice());
                    }else{
                        return g1.getName().compareTo(g2.getName());
                    }
                }
                throw new RuntimeException("输入数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
