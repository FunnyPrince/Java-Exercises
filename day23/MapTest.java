package com.day23;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author FunnyPrince_
 * @date 2021/4/21 - 19:24
 *
 *   一、Map的实现类的结构：
        |---Map:双列数据，存储key-value对的数据---类似于数学中的函数：y = f(x);
            |---HashMap:作为Map的主要实现类；线程不安全的，效率高；存储null的key/value
                |---LinkedHashMap:保证在遍历map元素时，可以按照添加的顺序实现遍历
                                原因：在原有的HashMap底层结构基础上，添加了一对指针，指向前一个和后一个元素。
                                    对于频繁的遍历操作，此类执行效率高于HashMap。
            |---TreeMap:保证按照添加的key-value进行排序，实现排序遍历。此时考虑key的自然排序和定制排序。
                        底层使用红黑树
            |---HashTable:作为古老的实现类；线程安全，效率低；不能存储null的key/value
                |---Properties:常用来处理配置文件。key/value都是String类型。

        HashMap底层：数组+链表 （jdk7之前
                    数组+链表+红黑树（jdk8

    面试题：
    1.HashMap的底层实现原理？
    2.HashMap和Hashtable的异同？
    3.CurrentHashMap和Hashtable的异同？

 二、Map结构的理解：
    Map中的key：无序的、不可重复的，使用Set存储所有key  --->key所在的类要重写equals()和hashCode()(以HashMap为例)
    Map中的value：无序的、可重复的，使用Collection存储所有的value  --->value所在的类要重写equals(),
    一个键值对：key-value构成了一个Entry对象。
    Map中的Entry：无序的、不可重复的，使用Set存储所有的Entry

 三、HashMap的底层实现原理？
    以jdk7为例说明：
        HashMap map = new HashMap();
        在实例化以后，底层创建了长度为16的一维数组Entry[] table.
        ...可能已经执行过多次put...
        map.put(key1,value1);
        首先，调用key1所在类的hashCode()计算key1哈希值，此哈希值经过某种算法计算后，得到在Entry数组中的存放位置。
        如果此位置上数据为空，此时key1-value1添加成功(entry添加成功)  ---情况1
        如果此位之上的数据不为空，(意味着此位之上存在一个或多个数据(以链表形式存在)),比较key1和已经存在的一个/多个数据的哈希值：
            如果key1的哈希值与已经存在的数据的哈希值都不相同，此时key1-value1添加成功；---情况2
            如果key1的哈希值与已经存在的某一个数据(key1-value2)的哈希值相同，继续比较：调用key1所在类的equals(),比较：
                如果equals()返回false：此时key1-value1添加成功；---情况3
                如果equals()返回true：使用value1替换相同key1的value2值。

    补充：关于情况2和情况3：此时key1-value1和原来的数据以链表的方式存储。
    在不断的添加过程中，会涉及到扩容问题，当超出临界值（且要存放的位置非空）时，默认的扩容方式：扩容为原来容量的2倍，并将原来的数据复制过来。

    jdk8 相较于 jdk7在底层实现方面的不同：
    1. new HashMap():底层没有创建一个长度为16的数组
    2.jdk8 底层的数组是：Node[], 而非Entry[]
    3.首次调用put()方法时，底层创建长度为16的数组
    4.jdk7底层结构只有：数组+链表。  jdk8中底层结构：数组+链表+红黑树。
        4.1形成链表时，七上八下（jdk7：新的元素指向旧的元素。jdk8,：旧的元素指向新的元素）
        4.2当数组的某一个索引位置上的元素以链表形式存在的数据个数 > 8且当前数组的长度 > 64,此时此此索引位置上的所有数据改为使用红黑树存储。
        默认的初始化容量：16

  四、LinkedHashMap的底层实现原理（了解）
        LinkedHashMap底层使用的结构与HashMap相同，因为LinkedHashMap继承于HashMap。
        区别：

 五、Map中定义的方法：
    添加、删除、修改操作:
    Object put(object key, object value): 将指定key-value 添加到(或修改)当前map对象中
    void putALl(Map m): 将m中的所有key-value对存放到当前map中
    object remove(Object key): 移除指定key 的key-value对,并返回value
    void clear(): 清空当前map中的所有数据
    元素查询的操作:
    object get(object key):获取指定key对应的value
    boolean containsKey(object key):是否包含指定的key
    boolean containsValue(Object value): 是否包含指定的value
    int size(): 返回map中key-value对的个数
    boolean isEmpty(): 判断当前map是否为空
    boolean equals(object obj):判断当前map和参数对象obj是否相等
    元视图操作的方法:
    Set keySet(): 返回所有key构成的Set集合
    Collection values(): 返回所有value构成的Collection集合
    Set entrySet(): 返回所有key-value对构成的set集合

总结：常用方法：
 添加：put(object key, object value)
 删除：remove(Object key)
 修改：put(object key, object value)
 查询：get(object key)
 长度：size()
 遍历：keySet() / values() / entrySet()
 插入（无序）


 */
public class MapTest {
    /*
      元视图操作的方法:
    Set keySet(): 返回所有key构成的Set集合
    Collection values(): 返回所有value构成的Collection集合
    Set entrySet(): 返回所有key-value对构成的set集合
     */
    @Test
    public void test5(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put("BB",456);
        map.put("CC",256);

        //遍历所有的key集：keySet():
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());//AA BB CC
        }
        System.out.println();

        //遍历所有的value集：values()
        Collection values = map.values();
        for(Object obj : values){
            System.out.println(obj);//123 456 256
        }
        System.out.println();


        //遍历所有的key-value：entrySet()
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while(iterator1.hasNext()){
            Object obj = iterator1.next();
            //遍历所有的key-value
            //方式一：entrySet集合中的元素都是entry
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey()+"--->"+entry.getValue());//AA--->123 BB--->456 CC--->256
//            System.out.println(iterator1.next());//AA=123 BB=456 CC=256
        }
        System.out.println();

        //方式二：
        Set set2 = map.keySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()){
            Object key = iterator2.next();
            Object value = map.get(key);

            System.out.println(key+"--->-->"+value);//AA--->-->123 BB--->-->456 CC--->-->256
        }

    }
    /*    元素查询的操作:
    object get(object key):获取指定key对应的value
    boolean containsKey(object key):是否包含指定的key
    boolean containsValue(Object value): 是否包含指定的value
    int size(): 返回map中key-value对的个数
    boolean isEmpty(): 判断当前map是否为空
    boolean equals(object obj):判断当前map和参数对象obj是否相等
     */
    @Test
    public void test4(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put("BB",456);
        map.put("CC",256);

        // object get(object key):
        System.out.println(map.get("BB"));//456
        // boolean containsKey(object key)
        boolean isExist = map.containsKey(123);//查找key
        System.out.println(isExist);//false

        isExist = map.containsValue(123);//查找value
        System.out.println(isExist);//true

        boolean equals = map.equals(456);
        System.out.println(equals);//false
        boolean equals1 = map.equals("BB");//false
        System.out.println(equals1);//false

        map.clear();
        System.out.println(map.isEmpty());//true


    }
    /*
        添加、删除、修改操作:
    Object put(object key, object value): 将指定key-value 添加到(或修改)当前map对象中
    void putALl(Map m): 将m中的所有key-value对存放到当前map中
    object remove(Object key): 移除指定key 的key-value对,并返回value
    void clear(): 清空当前map中的所有数据
     */
    @Test
    public void test3(){
        Map map = new HashMap();
        //添加
        map.put("AA",123);
        map.put("BB",456);
        map.put("CC",256);
        //修改
        map.put("AA",256);
        System.out.println(map);//{AA=256, BB=456, CC=256}

        Map map1= new HashMap();
        map1.put("CC",123);
        map1.put("DD",256);

        map.putAll(map1);
        System.out.println(map);//{AA=256, BB=456, CC=123, DD=256}

        //remove(Object key)
        Object value = map.remove("CC");
        System.out.println(value);//123,移除CC的value
        System.out.println(map);//{AA=256, BB=456, DD=256}

        //clear():
        map.clear();//map != null;只是清空数据，地址还在
        System.out.println(map.size());//0
        System.out.println(map);//{}

    }


    @Test
    public void test2(){
        Map map = new HashMap();
        map = new LinkedHashMap();

        map.put(123,"AA");
        map.put(46,"BB");
        map.put(12,"CC");
        map.put(567,"AA");
    }
    @Test
    public void test1(){
        Map map = new HashMap();
        map.put(null,null);
    }
}
