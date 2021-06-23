package com.day28;

import com.day27.Person;
import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @author FunnyPrince_
 * @date 2021/5/3 - 21:43
 * 通过反射创建对应的运行时类的对象
 */
public class NewInstanceTest {
    @Test
    public void test1() throws IllegalAccessException, InstantiationException {
        //获取运行时类的对象
        Class<Person> clazz = Person.class;
        //带泛型的自动识别为Person类型
//        Person person = clazz.newInstance();
        /*
        newInstance():调用此方法，创建对应的运行时类的对象。内部调用了运行时类的空参构造器
        要想此方法正常创建运行时类的对象，要求：
        1.运行时类必须提供空参的构造器
        2.空参构造器的访问权限得足够，通常设置为public

        在javabean中要求提供一个public的空参构造器。
        原因：
            1.便于通过反射，创建运行时类的对象
            2.便于子类继承此运行时类时，默认调用super()时，保证父类有此构造器
         */
//        Object obj = clazz.newInstance();
        Person obj = (Person)clazz.newInstance();
        System.out.println(obj);//是Person类型，Person{name='null', age=0}
    }

    //反射的动态性
    //通过反射的方式，只有运行时才知道调用哪个对象
    @Test
    public void test2(){

        for (int i = 0; i < 100; i++) {

            int num = new Random().nextInt(3);
            String classPath = "";
            switch(num){
                case 0:
                    classPath = "java.util.Date";
                    break;
                case 1:
//                    classPath = "java.sql.Date";
                    //随机的，一旦调到sql.Date就抛异常java.lang.InstantiationException
                    //因为sql.Date没有空参构造器
                    classPath  = "java.lang.Object";
                    break;
                case 2:
                    //copy/paste special-->copy Reference
                    classPath = "com.day27.Person";
                    break;
            }
            Object obj = null;

            try {
                obj = getInstance(classPath);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }

            System.out.println(obj);
        }
    }

    /*
    创建一个指定类的对象
    classPath：指定类的全类名
     */
    public Object getInstance(String classPath) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName(classPath);
        return clazz.newInstance();
    }
}
