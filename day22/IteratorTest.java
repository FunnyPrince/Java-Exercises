package com.day22;

import com.day21.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author FunnyPrince_
 * @date 2021/4/20 - 19:04
 *
 * 集合元素的遍历操作，使用迭代器Iterator接口
 * 1.内部方法：hasNext(),next()
 * 2.集合对象每次调用iterator()方法都得到一个全新的迭代器对象，
 * 默认游标都在集合的第一个元素之前
 * 3.内部定义了remove(),可以在遍历的时候，删除集合中的元素，此方法不同于集合直接调用remove()
 */
public class IteratorTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",22));
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();

        //方式一：开发中不这样写
//        System.out.println(iterator.next());//123
//        System.out.println(iterator.next());//456
//        System.out.println(iterator.next());//com.day21.Person@6536e911
//        System.out.println(iterator.next());//Tom
//        System.out.println(iterator.next());//false
//        //抛异常：NoSuchElementException
//        System.out.println(iterator.next());

        //方式二：不推荐
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        //方式三：推荐：while
        while(iterator.hasNext()){//先看有没有，有再进入
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 22));
        coll.add(new String("Tom"));
        coll.add(false);
    //错误方式一：NoSuchElementException

        Iterator iterator = coll.iterator();
//        while((iterator.next()) != null){//在判断123的时候
//            System.out.println(iterator.next());//先输出了456
//        }

        //错误方式二：指针一直在第一个元素之前
//        while(coll.iterator().hasNext()){
//            System.out.println(coll.iterator().next());//死循环，不停输出123
//        }

    }

    @Test
    public void test3() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 22));
        coll.add(new String("Tom"));
        coll.add(false);

        //删除集合中“Tom”
        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
//            iterator.remove();  //java.lang.IllegalStateException
            Object obj = iterator.next();
            if("Tom".equals(obj)){//iterator遍历，找到就移除Tom
                iterator.remove();
            }
        }

        //上一次的遍历，指针已经在最后面了，
        //遍历集合:再次判断已经没有了，需要重新生成
        iterator = coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());//已经没有Tom了
        }
    }

}
