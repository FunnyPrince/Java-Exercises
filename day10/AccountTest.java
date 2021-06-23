package com.day10;

/**
 * @author FunnyPrince_
 * @date 2021/4/2 - 21:02
 *
 * 写一个用户程序测试Account类。在用户程序中，
 * 创建一个账号为1122、余额为20000.年利率4. 5%的Account对象。
 * 使用wi thdraw方法提款30000元，并打印余额。
 * 再使用withdraw方法提款2500元，
 * 使用deposit方法存款3000元，然后打印余额和月利率。
 */
public class AccountTest {
    public static void main(String[] args) {

        Account acct = new Account(1122,20000,0.045);
        acct.withdraw(30000);
        System.out.println("账户余额："+acct.getBalance());
        acct.withdraw(2500);
        System.out.println("账户余额："+acct.getBalance());
        acct.deposit(6000);
        System.out.println("账户余额："+acct.getBalance());

        System.out.println("月利率为："+(acct.getMonthlyInterest() * 100) +"%");


    }
}
