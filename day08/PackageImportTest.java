package com.day08;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

import static java.lang.System.*;
import static java.lang.Math.*;

/**
 * @author FunnyPrince_
 * @date 2021/3/31 - 22:00
 *
 * 一、Package关键字：
 * 1.为了更好地实现项目中类的管理，提供包的概念；
 * 2.使用package声明类或接口所属的包，声明在源文件首行
 *3.包，属于标识符，遵循标识符的命名规则、规范(abhs)小写，见名知意
 *4.每"  .  "一次，就代表一层文件目录
 *
 * 补充：同一个包下，不能命名同一个接口/类
 *      不同包可以
 *
 * 二、import关键字
 *import：导入
 *1.在源文件中显式地使用import结构导入指定包下的类、接口
 * 2.声明在包和类之间
 * 3.如果需要导入多个结构，则并列
 * 4.可以使用"xxx.*",表示可以导入xxx包下所有结构
 * 5.java.lang包中/本包中定义的。可以省略import
 * 6.如果在源文件中使用了不同包下的同名的类，最少有一个要以全类名的方式来写
 * 7.使用" xxx.* "示可以使用xxx包下所有结构，若使用子包下的类，还需显式导入
 * eg: import java.lang.reflect.Field;
 * 8.import static：导入指定类/接口中静态结构：属性/方法
 */
public class PackageImportTest {
    public static void main(String[] args) {
        String info = Arrays.toString(new int[]{1,2,3});
        HashMap map = new HashMap();
        Field field = null;
        out.println();  //static System已经导入了
        Math.round(123.265);
    }

}
