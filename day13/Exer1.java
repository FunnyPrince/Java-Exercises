package com.day13;

/**
 * @author FunnyPrince_
 * @date 2021/4/7 - 23:06
 * 1.static修饰的属性，相较于实例变量，特别之处（>=3点）、
 * 随着类的加载而加载；早于对象的创建；只要权限允许，可以通过“对象.static属性”的方式进行调用；存在于方法区的静态域
 * 2.final可以用来修饰那些结构，分别表示什么意思？
 *
 */
public class Exer1{
    public static void main(String[] args) {
        Other o = new Other();
        new Exer1().addOne(o);
    }
    public void addOne(final Other o){
//        o = new Other();//Cannot assign a value to final variable 'o'
        o.i++;//o是常量，但是i是变量，可以给i++
    }

}
class Other{
    public int i;
}
class Something {
    public int addOne(final int x){
//        return ++x;//表示x先自增，再return，常量不可以自增！Cannot assign a value to final variable 'x'
        return x + 1; //return 常量+ 1
    }
}
