package com.day12;
//import org.junit.Test;
import org.junit.jupiter.api.Test;

/**
 * @author FunnyPrince_
 * @date 2021/4/6 - 18:31
 *
 * java中的Junit单元测试
 * 步骤：
 * 1.
 * 2.创建java类进行单元测试
 *            要求：  1.public
 *                   2.公共的空参的构造器
 * 3.此类中声明单元测试方法：   方法的权限是public，没有返回值，没有形参
 * 4.此单元测试方法上需要声明朱姐：@Test，并在单元测试类中导入：import org.junit.jupiter.api.Test;
 * 5.声明好单元测试方法后，可以在方法体内测试相关代码
 * 6.写完代码后，左键双击单元测试方法名，右键：run as
 */
public class JunitTest {
    int num = 10;
    @Test
    public void testEquals(){
        String s1 = "AA";
        String s2 = "BB";
        System.out.println(s1.equals(s2));

    }
}
