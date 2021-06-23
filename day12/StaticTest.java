package com.day12;

/**
 * @author FunnyPrince_
 * @date 2021/4/6 - 23:44
 *
 * static关键字
 * 1.static可以用来修饰：属性、方法、代码块、内部类
 *   不能修饰构造器（比构造器早加载）
 * 2.static修饰属性：静态变量/类变量，
 *         2.1 属性，按是否使用static修饰，又分为静态属性 vs 非静态属性(实例变量)
 *          实例变量：当创建了类的多个对象，每个对象都独立拥有一套类中的非静态属性，当修改非静态属性时，
 *          不会导致其他对象种同样的属性值修改
 *          静态变量：创建了类的多个对象，多个对象共享一个静态变量。当通过其中某一个对象修改静态变量时，
 *          会导致其他对象调用此静态变量时是修改过的
 *          2.2static修饰属性的其他说明：
 *           ①静态变量随着类的加载而加载，可以通过“类.静态变量" 的方式进行调用
 *           ②静态变量的加载早于对象的创建
 *           ③由于类只会加载一次，则静态变量在内存中只会存在一份，存在方法区的静态域中
 *           ④       类变量          实例变量
 *           类        yes            no（此时还没有对象）
 *           对象       yes            yes
 *           2.3静态属性举例：System.out;Math.PI;
 *
 *3.使用static修饰方法：静态方法
 *      ①随着类的加载而加载，可以通过“类.静态方法”方式调用
 *      ②           静态方法      非静态方法
 *           类        yes            no（此时还没有对象）
 *           对象       yes            yes
 *      ③静态方法中，只能调用静态的方法/属性（生命周期一致）
 *      非静态方法，既可以调用非静态方法/属性，也可以调用静态的方法/属性
 *
 *4.static注意点：
 *       4.1在静态方法内，不能使用this关键字、super关键字
 *       4.2关于静态属性/方法的使用，从生命周期角度理解
 *
 * 5.开发中如果确定一个属性是否要声明为static
 *      >属性是可以被多个对象所共享的，不会随着对象的不同而不同
 *      >类中的常量也常常声明为static，eg:PI
 * 开发中如果确定一个方法是否要声明为static
 *      >操作静态属性的方法，通常设置为static
 *      >工具类中的方法，习惯上声明为static（没必要造对象）eg:Math/Arrays/Collections
 *
 */
public class StaticTest {
    public static void main(String[] args) {
        //在创建对象之前，这里已经加载了nation属性
        Chinese.nation = "中国";

        Chinese c1 = new Chinese();
        c1.name = "白敬亭";
        c1.age = 26;
        c1.nation = "CHN";

        Chinese c2 = new Chinese();
        c2.name = "小白";
        c2.age = 27;
        c2.nation = "China";

        System.out.println(c1.nation);
        System.out.println(c2.nation);

    }
}
class Chinese{
    String name;
    int age;
    static String nation;//

    public void eat(){
        System.out.println("吃吃吃");
        walk();
        System.out.println(nation);//Chinese.nation
    }
    public static void show(){
        System.out.println("中国人");
//        eat();
//        name = "Tom";  非静态的方法/属性生命周期不够，此时还没加载
        System.out.println(nation);  //省略的是Chinese
        walk();
    }
    public static void walk(){
        System.out.println("走走走");
    }
    public void info(){
        System.out.println(name+age+nation);
    }
}
