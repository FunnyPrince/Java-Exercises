package com.day18;

/**
 * @author FunnyPrince_
 * @date 2021/4/13 - 23:13
 * 多线程的创建
 * 方式一：继承thread类
 * 1.创建一个继承于thread类的子类
 * 2.重写thread类的run()-->将此线程执行的操作声明在run()中
 * 3.创建thread类的子类对象
 * 4.通过此对象调用start()：①启动当前线程;②调用当前线程的run()
 *
 *
 * 方式二：指路ThreadTest1
 * 例子：遍历100以内的所有偶数
 *方式三：--》指路day19.ThreadNew
 * 方式四：--》指路day19.ThreadPool
 */
//1.创建一个继承于thread类的子类
class MyThread extends Thread{
    //2.重写thread类的run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+ ":" + i);
            }
        }
        
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        //3.创建thread类的子类对象
        //main()的主线程 调用t1对象
        MyThread t1 = new MyThread(); //alt + Enter
        //4.通过此对象调用start():①启动当前线程;②调用当前线程的run()
        t1.start();//调用start(),执行run()之后，t1的分线程执行

        //问题一：我们不能通过直接调用run()的方式启动线程。
        t1.run();//相当于只是在main()中调用run方法，并不是Thread中的run(),没有启动线程交互

        //问题二：再启动一个线程，遍历100以内的偶数,不可以还让已经start()的线程去执行，会报 java.lang.IllegalThreadStateException
//        t1.start();
        //需要重新创建一个线程的对象
        MyThread t2 = new MyThread();
        t2.start();


        //仍然在main线程中执行，线程交互
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+ ":" + i + "******main()****************");
            }
        }
    }
}
