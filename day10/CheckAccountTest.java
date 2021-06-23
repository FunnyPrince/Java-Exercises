package com.day10;

/**
 * @author FunnyPrince_
 * @date 2021/4/2 - 21:25
 * 写一个用户程序测试CheckAccount类。
 * 在用户程序中，创建一个账号为1122、 余额为20000、年利率4. 5%，可透支限额为5000元的CheckAccount对象。
 * 使用withdraw方法提款5000元，并打印账户余额和可透支额。
 * 再使用withdraw方法提款18000元，并打印账户余额和可透支额。
 * 再使用withdraw方法提款3000元，并打印账户余额和可选支额。
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount acct = new CheckAccount(1122,20000,0.045,500);
        acct.withdraw(5000);
        System.out.println("账户余额："+ acct.getBalance());
        System.out.println("可透支额度为："+ acct.getOverdraft());
        acct.withdraw(18000);
        System.out.println("账户余额："+ acct.getBalance());
        System.out.println("可透支额度为："+ acct.getOverdraft());

    }
}
