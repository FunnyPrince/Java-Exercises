package com.day22;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FunnyPrince_
 * @date 2021/4/20 - 23:15
 * 笔试题
 */
public class ListExer {
    /*
    区分list中remove(int index)和remove(Object obj)

     */
    @Test
    public void testListRemove(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);//以包装类的形式存储
        list.add(3);
        updateList(list);
        System.out.println(list);//
    }

    private void updateList(List list) {
//        list.remove(2);//删除的是索引,不装箱，直接删
        list.remove(new Integer(2));//若要删除数据2，则要装箱
    }
}
