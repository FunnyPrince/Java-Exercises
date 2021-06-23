package com.day24;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @author FunnyPrince_
 * @date 2021/4/27 - 23:00
 *
 * File类的使用
 * 1.File类的一个对象，代表一个文件或一个文件目录（文件夹）。
 * 2.File类声明在java.io包下
 * 3.File类中涉及到关于文件或文件目录的创建、删除、重命名、修改时间、文件大小等方法，并不会写入或读取文件内容的操作。
 * 如果需要读取或写入文件内容，必须使用IO流完成。
 * 4.后续File类的对象常会作为参数传递到流的构造器中，指明读取或写入的“终点”。
 *
 *
 * 如果使用Junit中的单元测试方法，相对路径即为当前Module下；
 * 如果使用main()，相对路径在当前Project下。
 */
public class FileTest {
    /*
    1.如何创建File类的实例
        File(String filePath)
        File(String parentPath,String childPath)
        File(File parentFile,String childPath)
    2.相对路径：相较于某个路径下，指明的路径
    绝对路径：包含盘符在内的文件/文件目录的路径
     */
    @Test
    public void test1(){
        //构造器1
        File file1 = new File("hello.txt");//相对于当前module
        File file2 = new File("F:\\idea\\day24\\he.txt");
        System.out.println(file1);
        System.out.println(file2);

        //构造器2
        File file3 = new File("F:\\idea\\day24","he.txt");
        System.out.println(file3);

        //构造器3
        File file4 = new File(file3,"hi.txt");
        System.out.println(file4);
    }

    /*
    public String getAbsolutePath(): 获取绝对路径
    public String getPath() ;获取路径
    public String getName() :获取名称
    public String getParent(): 获软上层文件目录路径。若无，返回null
    public long Length() :获敏文件长度(即:字节数)。不能获敢目录的长度。
    public long lastModified() :获取最后一次的修改时间，毫秒值
    public string[] list() :获取指定目录下的所有文件或者文件目录的名称数组
    public File[] listFiles() :获取指定目录下的所有文件或者文件目录的File数组

     */
    @Test
    public void test2(){
        File file1 = new File("hello.txt");
        File file2 = new File("f:\\io\\hi.txt");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());

        System.out.println();
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());

    }

    /*
    public boolean isDirectory(): 判断是否是文件目录
    public boolean isFile() :判断是否是文件
    public boolean exists() :判断是否存在
    public boolean canRead() :判断是否可读
    public boolean canWrite() :判断是否可写
    public boolean isHidden() :判断是否隐藏

     */
    /*
    创建硬盘中对应的文件/文件目录
    public boolean createNewFile():创建文件。若文件存在，则不创建，返回false
    public boolean mkdir() :创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
    public boolean mkdirs():创建文件目录。如果上层文件目录不存在，一并创建
    注意事项:如果创建文件或者文件目录没有写盘符路径，那么，就默认在项目路径下。

    删除磁盘中的文件/文件目录
    public boolean delete(): 删除文件或者文件夹
    删除注意:事项:
    Java中的删除不走回收站。
    要删除-个文件目录，请注意该文件目录内不能包含文件或者文件目录


     */
    @Test
    public void test3() throws IOException {
        //文件的创建
        File file1 = new File("hi.txt");
        if(!file1.exists()){
            file1.createNewFile();
            System.out.println("创建成功");
        }else{//文件存在
            file1.delete();
            System.out.println("文件已删除");
        }
    }

    @Test
    public void test4(){
        //文件目录的创建：
        File file1 = new File("f:\\io\\ioio1\\io3");
        //io存在的情况下，创建ioio1/ioio2,mkdir()和mkdirs()无区别
        //即要创建的文件上一层目录不存在，mkdirs()会帮助创建上一层目录，mkdir()则不会。
        boolean mkdir = file1.mkdir();
        if(mkdir){//对于已经存在的文件目录，这里为false，就不再进入
            System.out.println("创建成功11111");
        }

        File file2 = new File("f:\\io\\ioio2\\io4");
        boolean mkdirs = file1.mkdirs();
        if(mkdir){
            System.out.println("创建成功2222");
        }
        //要想删除成功，io3文件目录下不能有子目录/文件
        File file3 = new File("f:\\io\\ioio1\\io3");
        System.out.println(file3.delete());//true
        file3 = new File("f:\\io");
        System.out.println(file3.delete());//false

    }
    @Test
    public void test5(){
        Map<String,Integer> map = new HashMap<>();
        map.put("AA",1001);
        map.put("BB",1002);
        map.put("CC",1003);
        //遍历key
        Set<String> keySet = map.keySet();
        for(String key : keySet){
            System.out.println(key);
        }
        //遍历value
        Collection<Integer> value = map.values();
        Iterator<Integer> iterator = value.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());//Integer类型
        }
        //遍历key-value
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator1 = entrySet.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }

    //提供一个方法，用于遍历获取HashMap<String,String>中的所有value,并存放在List中返回。考虑集合和泛型的使用
    //泛型没有子父类关系
        public List<String> getValueList(HashMap<String,String> map){
           Collection<String> values = map.values();
           List<String> valueList = new ArrayList<>();
           for(String value : values){
               valueList.add(value);

           }
           return valueList;
        }


}
