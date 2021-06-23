package com.day18;

/**
 * @author FunnyPrince_
 * @date 2021/4/13 - 23:37
 * 练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        MyThread1 m1 = new MyThread1();
//        MyThread2 m2 = new MyThread2();
//
//        m1.start();
//        m2.start();
        //方式二：
        //MyThread1只用一次，可以创建Thread匿名子类的方式
        new Thread(){//new Thread(),里面重写了run(),调用的是重写后的匿名子类的run()
            @Override
            public void run() {
                    //遍历100以内的偶数
                    for (int i = 0; i < 100; i++) {
                        if(i % 2 == 0){
                            System.out.println("100以内的偶数：\n" + Thread.currentThread().getName()+":"+i);
                        }
                    }
                }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    //遍历100以内所有奇数
                    if(i != 0){
                        System.out.println("100以内所有奇数：\n"+ Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();

    }
}
//方式一：
/*
class MyThread1 extends Thread{
    @Override
    public void run() {
        //遍历100以内的偶数
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println("100以内的偶数：\n" + Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //遍历100以内所有奇数
            if(i != 0){
                System.out.println("100以内所有奇数：\n"+ Thread.currentThread().getName()+":"+i);
            }
        }
    }
}*/
