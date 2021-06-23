package com.day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author FunnyPrince_
 * @date 2021/4/21 - 23:25
|---Properties:常用来处理配置文件。key/value都是String类型。


 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties pros = new Properties();
        FileInputStream fis = new FileInputStream("jdbc.properties");
        pros.load(fis);//加载流对应的文件

        String name = pros.getProperty("name");
        String psw = pros.getProperty("psw");

        System.out.println("name:"+name+",psw:"+psw);

        fis.close();

    }
}
