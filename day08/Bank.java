package com.day08;

/**
 * @author FunnyPrince_
 * @date 2021/3/31 - 20:49
 */
public class Bank {
    private Customer1[] customers;//存放多个客户的数组
    private int numberOfCustomers;//记录客户的个数

    public Bank(){
        customers = new Customer1[10];
    }
   //添加客户
    public void addCustomer(String f,String l){
        Customer1 cust = new Customer1(f,l);
//        customers[numberOfCustomers] = cust;
//        numberOfCustomers++;
        customers[numberOfCustomers++] = cust;   //NullPointerException,需在调用之前初始化，构造器内或类内
    }
    //获取客户的个数
    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }
    //获取指定位置上的客户
    public Customer1 getCustomer(int index){
        //return customers[index];//容易角标越界/空指针异常
        //或者数组元素为10，但只有3个客户，若是调用4也不可
        //所以index < 客户数目
        if(index >= 0 && index < numberOfCustomers){
            return customers[index];
        }
        return null;
    }
}
