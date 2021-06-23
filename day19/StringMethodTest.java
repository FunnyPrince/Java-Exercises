package com.day19;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;
import org.junit.jupiter.api.Test;

/**
 * @author FunnyPrince_
 * @date 2021/4/16 - 0:11
test1():
 * int length():返回字符串的长度: return value .length
 * char charAt(int index):返回某索引处的字符return value[index]
 * boolean isEmpty():判断是否是空字符串:
 * return value.length== 0
 * String toLowerCase():使用默认语言环境，将String中的所有字符转换为小写
 * String toUpperCase():使用默认语言环境，将String中的所有字符转换为大写
 * String trim():返回字符串的副本，忽略前导空白和尾部空白
 * boolean equals(Object obj): 比较字符串的内容是否相同
 * boolean equalsIgnoreCase(String anotherString):与equals方法类似， 忽略大小写
 * String concat(String str):将指定字符串连接到此字符串的结尾。等价于用“+”
 * int compare To(String anotherString):比较两个字符串的大小
 * String substring(int beginIndex): 返回一个新的字符串，它是此字符串的从
 * beginIndex开始截取到最后的一一个子字符串。
 * String substring(int beginIndex, int endIndex) :返回- 个新字符串，它是此字
 * 符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。
 */
public class StringMethodTest {
/*
替换
String replace(char oldChar, char newChar):返回一个新的字符串，它是通过用newChar替换此字符串中出现的所有oldChar得到的。
String replace(CharSequence target, CharSequence replacement): 使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
String replaceAl(String regex, String replacement): 使用给定的replacement替换此字符串所有匹配给定的正则表达式的子字符串。
String replaceFirst(String regex, String replacement): 使用给定的replacement替换此字符串匹配给定的正则表达式的第一一个 子字符串。

匹配：
boolean matches(String regex):告知此字符串是否匹配给定的正则表达式。
切片：
String[] split(String regex):根据给定正则表达式的匹配拆分此字符串。
String[] split(String regex, int limit):根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，如果超过了，剩下的全部都放到最后一个 元素中。
*/
    @Test
    public void test4(){
        String str1 = "北京亚马逊我来啦";
        String str2 = str1.replace("北", "南");
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1.replace("北京", "上海");
        System.out.println(str3);

        System.out.println("*******************");

        String str4 = "13246hello46487world4697mysql78946";
        String str5 = str4.replaceAll("\\d+",",");
        System.out.println(str5);
        String str6 = str4.replaceAll("\\d+",",").replaceAll("^,|,$","");//^开头 |或者 $结尾有 ,
        System.out.println(str6);

        String str7 = "12345";
        //判断str7字符串中是否全部由数字组成，即有1-n个数字组成
        boolean matches = str7.matches("\\d+");// +表示多个
        System.out.println(matches);
        String tel = "0571-46797269";
        //判断这是否是一个杭州的固定电话
        boolean result = tel.matches("0571-\\d{7,8}");//0571开头，7-8位
        System.out.println(result);

        System.out.println("*************split****");
        String str8 = "hello|world|java";
        String[] strs = str8.split("\\|");
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
        System.out.println();
        String str9 = "hello.java.world";
        String[] strs1 = str9.split("\\.");
        for (int i = 0; i < strs1.length; i++) {
            System.out.println(strs1[i]);
        }


    }

    /*
    boolean endsWith(String suffix):测试此字符串是否以指定的后缀结束
    boolean startsWith(String prefix):测试此字符串是否以指定的前缀开始
    boolean startsWith(String prefix, int toffset):测试此字符串从指定索引开始的
    子字符串是否以指定前缀开始
    ● boolean contains(CharSequences): 当且仪当此字符串包含指定的char值序列
    时，返回trueI
    ● int indexOf(String str):返回指定 子字符串在此字符 串中第次出现处的索引
    ●int indexOf(String str, int fromIndex): 返回指定子字符串在此字符串中第一次出
    现处的索引，从指定的索引开始
    ●int lastIndexOf(String str):返回指定子字符串在此字符串中最右边出现处的索引
    ● int lastIndexOf(String str, int fromIndex): 返回指定子字符串在此字符串中最后
    次出现处的索引，从指定的索引开始反向搜索
    注: indexOf和lastIndexOf方法 如果未找到都是返回-1

     */
    @Test
    public void test3(){
        String str1 = "HelloWorld";
        boolean b1 = str1.endsWith("ld");
        System.out.println(b1);

        boolean b2 = str1.startsWith("ll",2);//true
        System.out.println(b2);

        String str2 = "wo";
        System.out.println(str1.contains(str2));//false,严格区分大小写

        System.out.println(str1.indexOf("lo"));//3,找从头开始找索引
        System.out.println(str1.indexOf("loll"));//没找到，返回-1

        System.out.println(str1.indexOf("lo",5));//从5开始找


        String str3 = "helloworld";
        System.out.println(str3.lastIndexOf("or"));//从后往前找，索引还是正的
        System.out.println(str3.lastIndexOf("or",6));

        //什么情况下调用indexOf()和lastIndexOf()返回值相同
        //情况一：存在唯一的str。情况二：不存在str


    }



    @Test
    public void test2(){
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "abc";
        String s4 = s3.concat("def");//拼接
        System.out.println(s4);

        String s5 = "abc";
        String s6 = new String("abe");
        System.out.println(s5.compareTo(s6));//涉及到字符串排序，相当于s5-s6,负数，当前对象小

        String s7 = "北京深信服";
        String s8 = s7.substring(2);
        System.out.println(s7);
        System.out.println(s8);

        String s9 = s7.substring(1,3);//左闭右开
        System.out.println(s9);
    }
    @Test
    public void test(){
        String s1 = "HelloWorld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));//
        System.out.println(s1.charAt(9));//
//        System.out.println(s1.charAt(10));//超出范围：java.lang.StringIndexOutOfBoundsException:

//        s1 = "";
        System.out.println(s1.isEmpty());
        String s2 = s1.toLowerCase();
        System.out.println(s1);//s1本身不可变
        System.out.println(s2);//新造的

        String s3 = " hel lo  world ";
        String s4 = s3.trim();//去除首尾空格
        System.out.println("---s3:"+s3+"----");
        System.out.println("---"+"s4:"+s4+"----");

    }
}
