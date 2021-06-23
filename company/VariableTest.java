package com.company;

import javax.xml.transform.Source;

/**变量
 * @author FunnyPrince_
 * @date 2021/3/23 - 0:45
 */
public class VariableTest {
    public static void main(String[] args){
        //变量需定义
        int myAge = 22;
        //变量使用
        System.out.println(myAge);

        //编译错误，使用myNumber之前未定义
        //System.out.println(myNumber);

        //变量声明
        int myNumber;
        //编译错误，在使用myNumber之前未初始化/赋值
        //System.out.println(myNumber);
        myNumber = 456;
        System.out.println(myNumber);
       //超过了myclass的作用域
        // System.out.println(myClass);
        byte b1 = 12;
        //错误提示：java: 不兼容的类型: 从int转换到byte可能会有损失
        //超出-128-127的范围
        //byte b2 = 465;
        System.out.println(b1);
//        System.out.println(b2);
        short s1 = 486;
        int i1 = 156313;
        //声明long型变量，必须以l/L结尾
        long l1 = 465131456l;
        System.out.println(l1);
        double d1 = 465.131;
        System.out.println(d1 + 1);
        float f1 = 456.45F;
        System.out.println(f1);
//通常使用double，float定义后面需加f/F

        //3.字符型
        //定义char型变量，通常使用一对'',内部只能写一个字符
        char c1 = 'a';
        c1 = 'A';
        System.out.println(c1);
//表示方式 1.声明一个字符   2.转义字符
        char c5 = '\n';  //h换行符
        char c6 = '\t';   //制表符
        System.out.println("hello" + c5 + "world");
//3.直接使用unicode值来表示
        char c7 = '\u0043';
        System.out.println(c7);
        //boolean型  true/false
        boolean bb1 = true;
        System.out.println(bb1);


        //条件判断、循环结构
        boolean isMarried = true;
        if(isMarried){
            //输入语句里\n表示换行，\\n可正常输出\n,""表示输出内容的引号，若要输出引号，加\"  \"
            System.out.println("结婚啦,lalalal\"嗯嗯\"lala\\nhahaha");
        }else{
            System.out.println("d单身");

        }






    }
    public void method(){
        int myClass = 1;

    }

}
