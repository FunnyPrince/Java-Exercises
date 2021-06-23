package com.day08;

/**
 * @author FunnyPrince_
 * @date 2021/3/31 - 20:37
 */
public class Account1 {
    private double balance;
    public Account1(double init_balance){
        this.balance = init_balance;
    }
    public double getBalance(){
        return balance;
    }
    //存钱操作
    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
            System.out.println("存入成功：" + amt);
        }
    }
    //取钱操作
    public void withdraw(double amt){
        if(balance >= amt){
            balance -= amt;
            System.out.println("取钱成功:"+amt);
        }
        else{
            System.out.println("余额不足");
        }
    }
}
