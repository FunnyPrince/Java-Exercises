package com.day18;

/**
 * @author FunnyPrince_
 * @date 2021/4/14 - 18:59
 *例子：创建三个窗口卖票，总票数100张，使用继承Thread类的方式
 *存在线程安全问题
 * 使用同步代码块解决继承Thread类的线程安全问题：
 *
 * 在继承Thread类创建多线程的方式中，我们慎用this充当同步监听器，可以使用当前类来充当同步监听器
 *
 *
 */
class Window extends Thread{
//    private int ticket = 100;//修改窗口1的票数，窗口2/3的没变
    private static int ticket = 100;//应该改为static，三个线程共享一个
//    private static Object obj = new Object();//表示唯一


    //   // //方式一：同步代码块：synchronized(同步监视器){}
/*    @Override
    public void run() {
        while(true){
            //方式一：
//            synchronized(obj){
            //方式二：
            synchronized(Window.class){//Class cla = Window2.class，Window2只会加载一次
                //错误的方式：this代表着t1,t2,t3三个对象，锁不唯一
//                synchronized (this) {

                if(ticket > 0){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                System.out.println(Thread.currentThread().getName());
                    System.out.println(getName()+"卖票，票号为:"+ticket);
                    ticket--;
                }else{
                    break;
                }
            }
        }
    }*/


    // //方式二：同步方法解决继承Thread类的方式中的线程安全问题
    @Override
    public void run() {
        while(true){
            show();
            }
    }
//错误的：
//    private synchronized void show(){//同步监视器：t1,t2,t3
    private static synchronized void show(){//同步监视器：当前类Window.class
        if(ticket > 0){

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            System.out.println(getName()+"卖票，票号为:"+ticket);
            System.out.println(Thread.currentThread().getName()+"卖票，票号为:"+ticket);
            ticket--;
        }
    }
}



public class WindowTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();
        //new了三个实例对象，每个对象都有一个obj，不唯一

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
