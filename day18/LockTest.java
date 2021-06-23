package com.day18;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author FunnyPrince_
 * @date 2021/4/14 - 23:25
 *
 * 解决线程安全问题的方式三：lock锁---JDK5.0新增
 *
 * 1.面试题：synchronized与lock异同？
 * 同：解决线程安全问题
 * 异：synchronized机制在执行完相应的同步代码以后，自动地释放同步监视器
 *      lock需要手动启动同步lock()/手动结束同步unlock()
 *2.优先使用顺序：Lock-->同步代码块(已经进入了方法体，分配了相应资源)-->同步方法(在方法体外)
 *
 * 面试题：如何解决线程安全问题？有几种方式？
 */
class Window22 implements Runnable{

    private int  ticket = 100;
    //1.实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();//空参默认false
    @Override
    public void run() {
        while(true){

            try{
                //2.调用锁定方法lock()
                lock.lock();

                if(ticket > 0){
                    //只是为了让阻塞概率变大
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+"售票:票号为"+ticket);
                    ticket--;
                }else{
                    break;
                }
            }finally{
                //3.调用解锁方法unlock()
                lock.unlock();
            }
        }
    }
}
public class LockTest {
    public static void main(String[] args) {
        Window22 w = new Window22();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();


    }
}
