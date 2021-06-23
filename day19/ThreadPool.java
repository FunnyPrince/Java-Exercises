package com.day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author FunnyPrince_
 * @date 2021/4/15 - 21:42
 * 创建线程的方式四：使用线程池
 *
 * 好处:
 * 1.提高响应速度(减少了创建新线程的时间)
 * 2.降低资源消耗(重复利用线程地中线程，不需要每次都创建)
 * 3.便于线程管理!
 * corePoolSize:核心池的大小
 * maximumPoolSize:最大线程教
 * keepAliveTime:线程没有任务时最多保持多长时间后会终止
 *
 * 创建多线程有几种方式？四种
 */
class NumberThread implements Runnable{//ctrl+shift+t

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        //1.提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
//ExecutorService是接口，里面的属性都是常量和抽象方法，所以想调它的方法就用它的实现类，向下转型
        ThreadPoolExecutor service1 = (ThreadPoolExecutor)service;
        service1.setCorePoolSize(15);
        //相当于：
        //((ThreadPoolExecutor) service).setKeepAliveTime(10);

        //设置线程池的属性
        //class java.util.concurrent.ThreadPoolExecutor
        //public class ThreadPoolExecutor extends AbstractExecutorService {
        //public abstract class AbstractExecutorService implements ExecutorService {
        //相当于ThreadPoolExecutor是ExecutorService的子类
        System.out.println(service.getClass());


        //2.执行指定的线程的操作，需要提供实现Runnable接口/Callable接口实现类的的对象
        service.execute(new NumberThread());//适合适用于Runnable
        service.execute(new NumberThread1());//适合适用于Runnable
//        service.submit(Callable callable);//适合适用于Callable

        //3.关闭线程池
        service.shutdown();
    }
}
