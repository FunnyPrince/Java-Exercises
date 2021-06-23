package com.day21;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author FunnyPrince_
 * @date 2021/4/20 - 0:27
 *
 * Collection接口声明的方法的测试
 * 结论：
 * 向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals()
 */
public class CollectionTest1 {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
//        Person p = new Person("Jerry",22);//指路-->Person
//        coll.add(p);  // 1.

        coll.add(new Person("Jerry",22));


        //1. contains(Object obj):判断当前集合中是否包含obj
        //我们在判断时会调用obj对象所在类的equals().
        boolean contains = coll.contains(123);
        System.out.println(contains);//true


        System.out.println(coll.contains(new String("Tom")));
        //true,String调用的是equals(),比较的是内容，不是调用==

        //        System.out.println(coll.contains(p));//true   1.直接比较的变量p，地址值相同

        System.out.println(coll.contains(new Person("Jerry",22)));
        //false，比较地址值，没有重写equals(),调用的就是Object类中的equals(),和==一样

        //Person类重写equals(),即可变为true

        //2. containAll(Collection coll1):判断形参coll1中所有元素是否都在当前集合中
        Collection coll1 = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));//true

        Collection coll2 = Arrays.asList(123,4567);
        System.out.println(coll.containsAll(coll2));//false

        System.out.println("************************************");
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);

        //3. remove(Object obj):从当前集合中移除obj元素
//        coll.remove(123);//先判断集合中是否有123
//        System.out.println(coll);//若是有，则删除

        coll.remove(1234);//先判断集合中是否有1234
        System.out.println(coll);//没有找到

        //4.removeAll(Collection coll1):从当前集合中移除coll1中所有元素
        Collection coll1 = Arrays.asList(123,4567);
        coll.removeAll(coll1);
        System.out.println(coll);


//        //5. retainAll(Collection coll1):交集：获取当前集合与coll1集合的交集，并返回给当前集合
//        coll.retainAll(coll1);
//        System.out.println(coll);// [] ,交集

        //6. equals(Object obj):要想返回true，需要当前集合和形参集合的元素都相同
        System.out.println(coll.equals(coll1));//false

        //7.hashCode():返回当前对象的哈希值
        System.out.println(coll.hashCode());//3081738

        //8.集合-->数组 ：toArray()
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//遍历数组：456 /n Tom /n false
        }
        //9.拓展：数组-->集合：调用Arrays类的静态方法asList()
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);//[AA, BB, CC]
        List<Object> list1 = Arrays.asList(arr);
        System.out.println(list1);//[456, Tom, false]
        System.out.println(arr);//[Ljava.lang.Object;@6536e911

        List<int[]> list2 = Arrays.asList(new int[]{123, 456});
        System.out.println(list2);//[[I@520a3426]
        System.out.println(list2.size());//1

        //要想输出123,456,不能用int[],用Integer[]
        List<Integer> list3 = Arrays.asList(new Integer[]{132, 456});
        System.out.println(list3);//[132, 456]
        System.out.println(list3.size());//2

        //iterator():返回Iterator接口的实例，用于遍历集合元素
        //指路day22.iterator.java
    }
}
