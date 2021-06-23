package com.day12;

import com.day06.Test;

/**
 * @author FunnyPrince_
 * @date 2021/4/6 - 20:08
 *
 * 包装类的使用：
 * 1.java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 * 基本数据类型、包装类、String三者之间的相互转换
 *
 * JDK5.0新特性：自动装箱与拆箱
 */
public class WrapperTest {

    public static void main(String[] args) {
        WrapperTest test = new WrapperTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();


        Order order = new Order();
        System.out.println(order.isMale);//false,此时isMale只是个变量，没有赋值，默认值
        System.out.println(order.isFemale);//null,此时Boolean型的isFemale是个类，没有赋值，为空，
        System.out.println("******************");


//        int num2 = 10;
//        //基本数据类型==？包装类的对象
//        test.method("a");
//        test.method(num2);
//        System.out.println("自动装箱了");



        //自动装箱：基本数据类型==》包装类
        int num2 = 10;
        Integer in1 = num2; //代替使用包装类的构造器

        boolean b1 = true;
        Boolean b2 = b1;//自动装箱
        System.out.println("自动装箱测试："+ in1);
        System.out.println("自动装箱测试："+ b2);
        System.out.println("相当于in1.toString()" + in1.toString()
                +"和b2.toString()" + b2.toString());

        //自动拆箱:包装类==》基本数据类型
        int num3 = in1;//自动拆箱
        System.out.println("自动拆箱测试："+ num3);
        System.out.println("******************我上面是自动装箱/拆箱***************************");

    }
    //String类型==》基本数据类型/包装类:调用包装类的parseXxx()
    public void test4(){
        String str1 = "123456";
        //可能会报NumberFormatException
        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1);

        //只有boolean型的才不会报NumberFormatException

        String str2 = "true";
        String str3 = "true132";
        boolean b1 = Boolean.parseBoolean(str2);
        boolean b2 = Boolean.parseBoolean(str3);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("*************我上面是调用包装类的parseXxx()******************************");

    }
    //基本数据类型、包装类==》String类型：调用String重载的valueOf(Xxx xxx)
    public void test3(){
        int num1 = 10;
        //方式1：连接运算
        String str1 = num1 + "";

        //方式2：调用String重载的valueOf(Xxx xxx)
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);//"12.3"

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println("str2:" + str2);
        System.out.println("str3:" + str3);
        System.out.println("*************************我上面是基本数据类型/包装类==》String类型*****************************");
    }
    //测试
    public void method(Object obj){
        System.out.println(obj);
    }
    //包装类==》基本数据类型：调用包装类的xxxValue()
    public void test2(){

        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
        System.out.println("*********我上面是：包装类==》基本数据类型*********");
    }
    //基本数据类型==》包装类：调用包装类的构造器
    public void test1(){
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());//包装类里是纯数字才可以使用Integer

//        Integer in3 = new Integer("我是错误的132abc");
//        System.out.println(in3.toString());

        Float f1 = new Float(12.3);//double型
        Float f2 = new Float("132.4");//转成float类型。必须是纯float结构
        System.out.println(f1);
        System.out.println(f2);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        System.out.println(b1);
        System.out.println(b2);

        Boolean b3 = new Boolean("true132");//源码表示与“true”不同就是false
        System.out.println(b3);//false
        System.out.println("************我上面是：基本数据类型==》包装类***************");
    }
}
class Order{
    boolean isMale;
    Boolean isFemale;
}
