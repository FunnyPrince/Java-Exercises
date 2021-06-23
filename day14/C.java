package com.day14;

/**
 * @author FunnyPrince_
 * @date 2021/4/9 - 0:10
 */
interface A{
    int x = 0;//全局常量
}
class B{
    int x = 1;
}
class C extends B implements A{
    public void pX(){
//        System.out.println(x);//编译不通过，x不明确
        System.out.println(super.x);//1
        System.out.println(A.x);//0
    }
    public static void main(String[] args){
        new C().pX();
    }
}
