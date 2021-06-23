package com.day14;

/**
 * @author FunnyPrince_
 * @date 2021/4/8 - 23:05
 *
 * 接口的使用
 * 1.接口的多态性
 * 2.接口，实际上可以看做是一种规范
 * 3.开发中，体会面向接口编程
 *
 */
public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        com.transferData(flash);

        //2.创建了接口的非匿名实现类的匿名对象
        com.transferData(new Printer());

        //3.创建了接口的匿名实现类的非匿名对象
//        new Flash().start();\
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        com.transferData(phone);//phone对象非匿名
        //4.创建了接口的匿名实现类的匿名对象
        com.transferData(new USB(){
            public void start() {
                System.out.println("MP3开始工作");
            }
            public void stop() {
                System.out.println("MP3结束工作");
            }
        });

    }
}
class Computer{
    public void transferData(USB usb){//USB usb = new Flash
        usb.start();
        System.out.println("实现细节");
        usb.stop();

    }
}
interface USB{
    //常量：长、宽、最大最小的传输速率
    void start();
    void stop();
}
class Flash implements USB{
    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}
class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}