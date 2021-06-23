package com.day18;

/**
 * @author FunnyPrince_
 * @date 2021/4/14 - 22:34
 *
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的-
 */
public class BankTest {
}
class Bank{
    private Bank(){}

    private static Bank instance = null;

//    public static synchronized Bank getInstance(){//Bank.class
    public static Bank getInstance(){//Bank.class

        //方式一：效率稍差，买手机，一个人进去买买完拿走，其他人在门口排队进去，没有手机再出来
/*        synchronized (Bank.class) {
            if(instance == null){
                instance = new Bank();
            }
            return instance;
        }*/
        //方式二：效率更高
        if(instance == null){
            synchronized (Bank.class) {
                if(instance == null){

                    instance = new Bank();
                }
            }
        }
        return instance;
    }

}