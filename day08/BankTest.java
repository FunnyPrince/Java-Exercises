package com.day08;

/**
 * @author FunnyPrince_
 * @date 2021/3/31 - 21:13
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Smith","Jane"); //在Bank里空指针异常，需要在调用之前先初始化
        bank.getCustomer(0).setAccount1(new Account1(2000));//new匿名对象
        bank.getCustomer(0).getAccount1().withdraw(500);

        double balance = bank.getCustomer(0).getAccount1().getBalance();
        System.out.println("客户："+ bank.getCustomer(0).getFirstName()+"的账户余额为:"
                        + balance);
//账户声明在客户的类里作为属性，客户存在Bank里，Bank里的属性是数组类型，银行对象调用数组，数组元素调用堆空间的客户里的账户，账户调用余额
        System.out.println("*************************");
        bank.addCustomer("白","静婷");
        System.out.println("银行的客户个数为："+bank.getNumberOfCustomers());
    }
}
