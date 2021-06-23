package com.day22;


import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author FunnyPrince_
 * @date 2021/4/21 - 0:17
 */
public class TreeSetTest {
    /*
    1.向TreeSet中添加的数据，要求相同类的对象
    2.两种排序方式：自然排序(实现Comparable接口)，定制排序(Comparator接口)
    3.自然排序中，比较两个对象是否相同的标准为：compareTo()返回是否为0，不再是equals();
    4.定制排序中，比较两个对象是否相同的标准为：compare()返回是否为0，不再是equals();


     */
    @Test
    public void test1(){
        TreeSet set = new TreeSet();

        //java.lang.ClassCastException
//        set.add(123);
//        set.add(456);
//        set.add("AA");
//        set.add("BB");

        //举例1：
//        set.add(12);
//        set.add(-89);
//        set.add(125);
//        set.add(1);
//        set.add(456);

        //举例2：
        set.add(new User("Tom",12));
        set.add(new User("xiaoming",18));
        set.add(new User("huazai",20));
        set.add(new User("Jerry",12));
        set.add(new User("Jerry",55));//TreeSet只按照compareTo()比较，不按照equals()比较


        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());//-89 1 12 125 456
        }
    }


    @Test
    public void test2(){
        Comparator com = new Comparator() {
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                }else{
                    throw new RuntimeException("输入的数据类型不匹配");
                }
            }
        };
        TreeSet set = new TreeSet(com);
        set.add(new User("Tom",12));
        set.add(new User("xiaoming",18));
        set.add(new User("huazai",20));
        set.add(new User("Jerry",12));//没添加进去
        set.add(new User("Jerry",55));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
