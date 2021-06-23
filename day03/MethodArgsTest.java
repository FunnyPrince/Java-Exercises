package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/28 - 20:55
 * <p>
 * 可变个数形参的方法
 * 1.jdk5.0新增的内容
 * 2.具体使用
 * >2.1 可变个数形参的格式： 数据类型 ... 变量名
 * >2.2 当调用可变个数形参的方法时，传入的参数个数可以是0，，,,2，n个
 * >2.3 可变个数形参的方法与本类中方法名相同，形参不同(个数、类型)的方法之间构成重载
 * >2.4可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载/  二者不能共存
 * >2.5可变个数形参在方法的形参中，最多只能声明一个可变形参必须声明在末尾
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(12);
        test.show("hello");

        test.show("hello", "world");
        test.show();  //String ... strs
        test.show(new String[]{"AA", "BB", "CC"});  //也可以调用

        test.show(1,"Hello",",","World");
    }

    public void show(int i) {

    }

    public void show(String s) {

    }

    public void show(String... strs) {
        System.out.println("show(String ... strs)");
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }//哇塞！可以和数组通用
    }
//    public void show(String[] strs){}//与String ... strs重复了
    public void show(int i, String ... strs){
        System.out.println("int 在前，可变的String在后");
    }
}
