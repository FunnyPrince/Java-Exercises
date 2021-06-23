package com.day08;

/**
 * @author FunnyPrince_
 * @date 2021/3/31 - 20:43
 */
public class Customer1 {
    private String firstName;
    private String lastName;
    private Account1 account1;

    public Customer1(String f,String l){
        this.firstName = f;
        this.lastName = l;
    }
    public Account1 getAccount1() {
        return account1;
    }
    public void setAccount1(Account1 account1){
        this.account1 = account1;
    }
   public String getFirstName(){
        return firstName;
    }
    public String  getLastName(){
        return lastName;
    }
}
