package com.day22;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author FunnyPrince_
 * @date 2021/4/21 - 1:31
 * *创建该类的5个对象，并把这些对象放入TreeSet 集合中(下一章: TreeSet 需使用泛型来定义)
 * 分别按以下两种方式对集合中的元素进行排序，井遍历输出:
 * 1).使Employee 实现Comparable接口，并按name排序
 * 2).创建TreeSet时传入Comparator对象，按生日日期的先后排序。
 */
public class EmployeeTest {

    //问题2：俺生日日期先后排序
    @Test
    public void test2(){

        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;

////                    int compare = compare(((Employee) o1).getBirthday(), ((Employee) o2).getBirthday());
////                    Employee{name='Jerry', age=56, birthday=com.day22.MyDate@6536e911}
//                    int compare = compare(e1.getBirthday(),e2.getBirthday());
//                    System.out.println(compare);

                    MyDate d1 = e1.getBirthday();
                    MyDate d2 = e2.getBirthday();

                    //方式一：
//                    //比较年
//                    int minusYear = d1.getYear() - d2.getYear();
//                    if(minusYear != 0){
//                        return minusYear;
//                    }
//                    //比较月
//                    int minusMonth = d1.getMonth() - d2.getMonth();
//                    if(minusMonth != 0){
//                        return minusMonth;
//                    }
//                    //比较日
//                    return d1.getDay() - d2.getDay();

                    //方式一：
                    return d1.compareTo(d2);
                }
                throw new RuntimeException("数据类型不一致");
            }
        });


        Employee e1 = new Employee("Tom",55,new MyDate(1956,4,30));
        Employee e2 = new Employee("liangchaowei",62,new MyDate(1978,4,10));
        Employee e3 = new Employee("liudehua",60,new MyDate(1967,5,20));
        Employee e4 = new Employee("Jerry",56,new MyDate(1955,3,17));
        Employee e5 = new Employee("Liujialing",52,new MyDate(1979,6,1));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    //问题1：自然排序
    @Test
    public void test1(){
        TreeSet set = new TreeSet();
        Employee e1 = new Employee("Tom",55,new MyDate(1956,4,30));
        Employee e2 = new Employee("liangchaowei",62,new MyDate(1978,4,10));
        Employee e3 = new Employee("liudehua",60,new MyDate(1967,5,20));
        Employee e4 = new Employee("Jerry",56,new MyDate(1955,3,17));
        Employee e5 = new Employee("Liujialing",52,new MyDate(1979,6,1));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
