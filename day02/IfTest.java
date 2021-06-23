package com.day02;

/**
 * @author FunnyPrince_
 * @date 2021/3/24 - 21:08
 *
 * 分支结构中的if-else
 * 三种结果：
 * 1.  if(条件表达式){执行表达式}
 * 2.  二选一
 *      if(条件表达式1){执行表达式1}
 *       else{执行表达式2}
 *  3. n选一
 *          if(条件表达式1){执行表达式1}
 *          else if(条件表达式2){执行表达式2}
 *          ……
 *          else{执行表达式n}
 *
 */
public class IfTest {
    public static void main(String[] args) {
        //eg1.
        int heartBeats = 79;
        if(heartBeats < 60 || heartBeats > 100){
            System.out.println("需要做进一步检查");
        }
        System.out.println("正常，检查结束");

        //eg2.
        int age = 12;
        if(age < 18){
            System.out.println("还没有成年，可以看动画片");
        }else{
            System.out.println("成年了");
        }

        //eg3.
        if(age < 0){
            System.out.println("输入非法");
        }else if(age < 18){
            System.out.println("青少年");
        }else if(age < 35){
            System.out.println("青年");
        }else if(age < 60){
            System.out.println("中年");
        }else{
            System.out.println("老年");
        }


        System.out.println();
    }
}
