package com.day19;

/**
 * @author FunnyPrince_
 * @date 2021/4/15 - 11:11
 *
 * 线程通信的应用:经典例题:生产者/游费者闷题
 * 生产者(Productor)将产品交给店员(Clerk),而消费者(Customer)从店员处取走产品，
 * 店员-次只能持有固定数量的产品(比如:20)，如果生产者试图生产更多的产品，店员
 * 会叫生产者停一下，如果店中有空位放产品了再遇知生产者继续生产:如果店中没有产品
 * 了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品。
 * 分析:
 * 1.是否是多线程问题?是，生产者线程，消费者线程
 * 2.是否有共享教据?是，店员《或产品
 * 3.如何解决线程的安全问题？同步机制
 * 4.是否涉及线程的通信？是
 */

class Clerk{

    private int productCount = 0;

    //生产产品
    public synchronized void produceProduct() {
        if(productCount < 20){
            productCount++;//先加加一次，生产第一个产品
            //先++，后输出.当productCount=0时，表示开始生产第一个chanp
            System.out.println(Thread.currentThread().getName()+":开始生产第"
            +productCount +"个产品");

            notify();

        }else{
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //消费产品
    public synchronized void consumeProduct() {
        if(productCount > 0){
            System.out.println(Thread.currentThread().getName()+":开始消费第"
            +productCount+"个产品");
            productCount--;//先输出，后--；表示先有产品才能消费

            notify();

        }else{
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
class Producer extends Thread{//生产者
    private Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName()+"开始生产产品" );
        while(true){

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}
class Consumer extends Thread{//消费者
    private Clerk clerk;

    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }

    public void run() {
        System.out.println(getName()+"开始消费产品" );
        while(true){

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");

        Consumer c1 = new Consumer(clerk);
        c1.setName("消费者1");
        Consumer c2 = new Consumer(clerk);
        c2.setName("消费者2");

        p1.start();
        c1.start();

    }
}
