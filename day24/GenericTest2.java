package com.day24;

import com.day09.Student;
import org.junit.jupiter.api.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author FunnyPrince_
 * @date 2021/4/27 - 21:49
 * 1.泛型在继承方面的体现
 *
 * 2.通配符的使用
 */
public class GenericTest2 {

    /*
    1.泛型在继承方面的体现:
    虽然类A是类B的父类，但是G<A> 和 G<B>二者不具有子父类关系，并列关系
    补充：类A是类B的父类，A<G>是B<G>的父类


     */
    @Test
    public void test1(){
        Object obj = null;
        String str = null;

        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;

        List<Object> list1 = null;
        List<String> list2 = null;
        //此时list1与list2的类型不具有子父类关系
        //编译不通过
//        list1 = list2;

    }
    @Test
    public void test2(){
        AbstractList<String> list1 = null;
        List<String> list2 = null;
        ArrayList<String> list3 = null;

        list1 = list3;
        list2 = list3;

    }

    /*
    2.通配符的使用
    通配符: ?
    类A是类B的父类，G<A> 和 G<B>共同的父类是G<?>

     */
    @Test
    public void test3(){
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list = null;

        list = list1;
        list = list2;

        //编译不通过
//        print(list1);
//        print(list2);

        //
        List<String> list3 = new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");

        list = list3;
        //添加（写入）：对于list<?> 就不能向其内部添加数据
        //除了添加null之外。
//        list.add("DD");
        list.add(null);

        //获取（读取）：允许读取数据，读取的数据类型为Object。
        Object o = list.get(0);
        System.out.println(o);
    }
    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

    /*
    3.有限制条件的通配符的使用
    ? extends A:
            G<? extends A>可以作为G<A>,G<B>的父类的，其中B是A的子类
    ? Super A:
                    G<? extends A>可以作为G<A>,G<B>的父类的，其中B是A的父类
     */
    @Test
    public void test4(){
        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;

        List<Student> list3 = new ArrayList<Student>();
        List<Person> list4 = new ArrayList<Person>();
        List<Object> list5 = new ArrayList<Object>();

        //extends  <=
//        list1 = list3;
        list1 = list4;
//        list1 = list5;

        //  super >=
//        list2 = list3;
        list2 = list4;
        list2 = list5;

        //读取数据：
        list1 = list4;
       Person p = list1.get(0);// <= Person
       //编译不通过
//       Student s= list1.get(0);

        list2 = list4;
        Object obj = list2.get(0);
    }
}
