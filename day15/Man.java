package com.day15;

/**
 * @author FunnyPrince_
 * @date 2021/4/9 - 22:28
 */
public class Man extends Father implements Filial,Spoony{
    public void help(){
        System.out.println("听爸爸的话");
    }

    public static void main(String[] args) {
        Man man = new Man();
        man.help();
    }
}
interface Filial{//孝顺的
    default void help(){
        System.out.println("老妈和媳妇掉河里，先救老妈");
    }
}
interface Spoony{//痴情的
    default void help(){
        System.out.println("老妈和媳妇掉河里，先救媳妇");
    }
}
class Father{
    public void help(){
        System.out.println("救你老妈");
    }
}