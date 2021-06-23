package com.day19;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author FunnyPrince_
 * @date 2021/4/15 - 20:13
 *
 * 创建线程的方式三：实现Callable接口。--JDK5.0新增
 * 如何理解实现Callable接口的方式创建多线程比实现Runnable接口创建多线程方式强大？
 * 1.call()可以有返回值；
 * 2.call()可以抛出异常，被外面的操作捕获，获取异常信息；
 * 3.callable是支持泛型的
 *
 * 方式四：--》指路day19.ThreadPool
 */
//1.创建一个实现Callable的实现类
class NumThread implements Callable {
    //2.实现call方法，将此线程需要执行的操作声明在call()中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
public class ThreadNew {
    public static void main(String[] args) {
        //3.创建Callable解耦实现类的对象
        NumThread numThread = new NumThread();
        //4.将此Callable接口实现类的对象作为参数传递到FutureTask的构造器中，创建futureTask的对象
        FutureTask futureTask = new FutureTask(numThread);
        //5.将futureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
        new Thread(futureTask).start();//futureTask实现了Runnable接口

        try {
            //6.后去Callable中call()的返回值

            //get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值
            Object sum = futureTask.get();
            System.out.println("总和为："+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
