package com.day08;

/**
 * @author FunnyPrince_
 * @date 2021/3/31 - 14:44
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cus = new Customer("Smith", "Jane");

        Account acct = new Account(1000,2000,0.0123);
        cus.setAccount(acct);

        cus.getAccount().deposit(1000);
        cus.getAccount().withdraw(500);
        cus.getAccount().withdraw(3000);//注意：原来账户就有2000，再存入1000
        System.out.println("Customer["+cus.getFirstName()+","+ cus.getLastName()+"] has account id is: "
                +cus.getAccount().getId()+", balance is: "+ cus.getAccount().getBalance()+
                ",annualInterestRate is:"+cus.getAccount().getAnnualInterestRate());
    }
}
class Customer{
    private String firstName;
    private String lastName;
    private Account account;//Account类的属性

    public Customer(String f,String l){
        this.firstName = f;
        this.lastName = l;
    }
    public Account getAccount(){
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

