package com.day11;

/**
 * @author FunnyPrince_
 * @date 2021/4/5 - 23:47
 *
 * 面试题： ==  /  equals()的区别
 * 1.== :运算符
 * 1.可以使用在基本数据类型变量和引用类型变量中
 * 2.如果比较的是基本数据类型变量，比较两个变量保存的数据是否相等(不一定类型相同，可以自动类型提升
 * 3.如果比较的是引用数据类型，比较的是两个对象的地址值是否相等，即两个引用是否指向同一个对象实体
 *补充：==使用时，必须保证两边的变量类型一致，否则编译不通过
 * System.out.println("hello" == new java.util.Date());//左右两边类型不一致 编译不通过
 *
 * equals()方法：
 * 1.是一个方法，不是运算符
 * 2.只适用于引用数据类型
 * 3.Object类的equals()方法源码：
 *       public boolean equals(Object obj){
 *             return (this == obj);
 *         }
 *
 * 说明：Object类中定义的equals()和==作用相同
 *4.String、Date、File、包装类等都重写了Object类中的equals()方法,
 * 重写后，比较的不是两个引用地址是否相同，而是比较两个对象的“实体内容”是否相同(String,Date等内部属性是否相同)
 *5.通常情况下，自定义的类，如果使用equals()的话，也通常比较的两个对象的“实体内容”是否相同。
 * 就需要对object类中的equals()进行重写
 *
 */
public class EqualsTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i==j);//true
        System.out.println(i==d);// true 自动类型提升

//        System.out.println("hello" == new java.util.Date());//左右两边类型不一致 编译不通过
        boolean b = true;
        char c = 10;
        System.out.println(i==c);//true ASCIId对应的10

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1==c2);//true

        //引用类型
        String str1 = new String("java");
        String str2 = new String("java");
        System.out.println(str1 == str2);//false,new了两次，地址值不同

        Customer cust1 = new Customer("Jerry",12);
        Customer cust2 = new Customer("Jerry",12);
        System.out.println(cust1==cust2);//false


        System.out.println("****************");


        //equals()
    /*  Object类的equals()方法源码：
      public boolean equals(Object obj){
            return (this == obj);
        }

     */
        System.out.println(cust1.equals(cust2));//false  与==相同
        System.out.println(str1.equals(str2)); //true  String中重写过equals()方法，不过按照Object类的equals来调用


    }
}
class Customer {
    String name;
    int age;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写equals()
    //重写原则：比较两个对象的实体内容（name，age）是否相同
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Customer) {
            Customer cust = (Customer) obj;
            //比较两个对象的每个属性是否都相同
/*            if(this.age == cust.age && this.name.equals(cust.name)){//name是String，不能用==表示的是地址
                return true;
            }else{
                return false;
            }*/
            //或
            return this.age == cust.age && this.name.equals(cust.name);
        }
        return false;
    }

    //重写toString() ，详细讲解在ToStringTest类
    public String toString() {
        return "Customer[name = " + name + ",age" + age + "]";
    }
}