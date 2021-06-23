package com.day13;

/**
 * @author FunnyPrince_
 * @date 2021/4/8 - 1:01
 *
 * 抽象类的应用：模板方法的设计模式
 */
public class TemplateTest {
    public static void main(String[] args) {
        Template t = new SubTemplate();
        t.spendTime();
    }
}
abstract class Template{
    //计算某段代码执行所花费的时间
    public void spendTime(){
        long start = System.currentTimeMillis();
        code(); //不确定的部分，易变的部分
        // 省略了this,对于上面的调用，code()调用的是子类重写的code()
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end-start));

    }
    public abstract void code();
}
class SubTemplate extends Template{
    public void code(){
        //1000以内的质数
        for(int i = 2;i <= 1000;i++){
            boolean isFlag = true;//外层for循环里，不用每次重置
            for(int j = 2;j <= Math.sqrt(i);j++){
                if(i % j == 0){
                    isFlag = false;
                    break;
                }
                if(isFlag){
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }
}