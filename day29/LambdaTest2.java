package com.day29;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author FunnyPrince_
 * @date 2021/5/7 - 21:41
 * java内置的4大核心函数式接口
 * 消费型接口 Consumer<T> void accept(T t)
 * 供给型接口 Supplier<T> T get()
 * 函数型接口 Function<T,R> R apply(T t)
 * 断定型接口 Predicate<T>  boolean test(T t)
 *
 */
public class LambdaTest2 {
    @Test
    public void test1(){
        happyTime(500, money -> System.out.println("Lambda表达式"));
    }

    public void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }

    @Test
    public void test2(){

        List<String> list = Arrays.asList("郭麒麟","范丞丞","白敬亭","秦霄贤","范冰冰");
        List<String> filterStrs = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("范");
            }
        });
        System.out.println(filterStrs);


        System.out.println("使用Lambda表达式来表达：");
        List<String> filterStrs1 = filterString(list,s -> s.contains("范"));
        System.out.println(filterStrs1);
    }

    //根据给定的规则，过滤集合中的字符串。此规则由Predicate的方法决定
    public List<String> filterString(List<String> list, Predicate<String> pre){
        ArrayList<String> filterList = new ArrayList<>();
        for(String s : list){
            if(pre.test(s)){
                filterList.add(s);
            }
        }
        return filterList;
    }
}
