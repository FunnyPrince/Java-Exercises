package com.day26;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author FunnyPrince_
 * @date 2021/4/30 - 19:14
 * 对象流的使用
 * 1.ObjectInputStream和ObjectOutputStream
 * 2.作用：
 * 3.要想一个java对象是可序列化的，需要满足相应的要求。-->指路Person.java
 * */public class ObjectInputOutputStreamTest {
     /*
     序列化过程：将内存中的java对象保存到磁盘中或通过网络传输出去
     使用ObjectOutputStream实现
      */
    @Test
    public void testObjectOutputStream(){
        ObjectOutputStream oos = null;
        try {
            //1.
            oos = new ObjectOutputStream((new FileOutputStream(new File("Object.dat"))));
            //2.
            oos.writeObject(new String("Beijing"));
            oos.writeObject(new Person("Tom",23));
            oos.flush();

            oos.flush();//刷新操作
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    反序列化:将磁盘文件中的对象还原为内存中的java对象
    使用ObjectInputStream实现
     */
    @Test
    public void testObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Object.dat"));
            Object obj = ois.readObject();
            String str = (String)obj;

            Person p = (Person)ois.readObject();


            System.out.println(str);
            System.out.println(p);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
