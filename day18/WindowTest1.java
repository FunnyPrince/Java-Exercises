package com.day18;

/**
 * @author FunnyPrince_
 * @date 2021/4/14 - 19:50
 * 例子：创建三个窗口卖票，总票数100张，使用实现Runnable接口的方式
 *1.问题：买票过程中出现了重票和错票--》出现了线程安全问题
 * 2.出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票
 * 3.如何解决：当线程A在操作共享数据（ticket）时，其他进程不能参与进来，直到线程A
 * 操作完成时，其他线程才可以开始操作ticket。这种情况即使线程A出现了阻塞也不能被改变。
 * 4.在Java中，我们`通过同步机制，来解决线程安全问题`。
 *
 * 方式一：同步代码块：synchronized(同步监视器){
 *     需要被同步的代码
 * }
 * 说明：1.操作共享数据的代码，即为需要被同步的代码。--》不能多也不能少
 *      2.共享数据：多个线程共同操作的变量。如ticket
 *      3.同步监视器：俗称：锁。任何一个类的对象，都可以充当锁。
 *          >要求：多个线程必须要共用同一把锁。
 *     补充：在实现Runnable接口创建多线程的方式中，我们可以使用this充当同步监听器
 *
 *
 * 方式二：同步方法：
 *      如果操作共享数据的代码完整的声明在一个方法中，可以将这个方法声明成同步的。
 *   总结：
 *        1.同步方法仍然设计到同步监视器，只是不需要我们显式的声明。
 *        2.非静态的同步方法，同步监视器是：this
 *           静态的同步方法，同步监视器是：当前类本身
 *
 *5.同步的方式，解决了线程安全问题。
 * but操作同步代码时，只能有一个线程参与，恰现成等待。相当于是一个单线程的过程，效率低。
 *
 *
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的--》指路BankTest
 * 死锁演示--》指路ThreadTest2
 */
class Window1 implements Runnable{

    private int ticket = 100;//不用加static，本身共享数据
//    Object obj = new Object();//同一把锁


    // //方式一：同步代码块：synchronized(同步监视器){}
 /*   @Override
    public void run() {
//          Object obj = new Object();
        while (true) {
            //方式一：同步代码块：synchronized(同步监视器){}
//            synchronized (obj) {//方式二：
            synchronized (this) {//方式一：此时的this：唯一的Window1的对象
                if (ticket > 0) {
                    //线程安全问题出现
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票:票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }*/

    // //方式二：同步方法
    @Override
    public void run() {
        while(true){
            show();
        }
    }

    //方式二：同步方法
    private synchronized void show(){//同步监视器：this
        if (ticket > 0) {
            //线程安全问题出现
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票:票号为" + ticket);
            ticket--;
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();
//        Window1 w2 = new Window1();
//        Window1 w3 = new Window1();没必要new三个对象

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);//三个线程共享一个Window1对象

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();


    }
}
