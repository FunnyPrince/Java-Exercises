package com.day28;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author FunnyPrince_
 * @date 2021/5/3 - 21:20
 *
 * ClassLoader类加载器
 */
public class ClassLoaderTest {
    @Test
    public void test1(){
       // 对于自定义类，使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //调用系统类加载器的getParent():获取扩展类加载器
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);//sun.misc.Launcher$ExtClassLoader@8efb846

        //调用扩展类加载器的getParent():无法获取引导类记载器
        //扩展类加载器主要负责加载java的核心类库，无法加载自定义类。
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);//null

        ClassLoader classLoader3 = String.class.getClassLoader();
        System.out.println(classLoader3);//null
    }

    /*
    Properties:用来读取配置文件
     */
    @Test
    public void test2() throws IOException {

        Properties pros = new Properties();
        //读取配置文件方式一：
        //此时的文件默认在当前的module下
//        FileInputStream fis = new FileInputStream("jdbc.properties");
//        FileInputStream fis = new FileInputStream("src\\jdbc.properties");//指明路径才可以读到src下的
//        pros.load(fis);

        //方式二：使用ClassLoader
        //配置文件默认识别为：当前module下的src下
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc.properties");
        pros.load(is);

        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println("user = " + user + ",password: " + password);


    }
}
