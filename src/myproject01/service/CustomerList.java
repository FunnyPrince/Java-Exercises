/*
package myproject01.service;

import myproject01.bean.Customer;

*/
/**
 * @author FunnyPrince_
 * @date 2021/3/31 - 23:25
 *
 *  * CustomerList 为Customer对象的管理模块，
 *  * 内部用数组管理一组Customer对象，并提供相应的增删改和遍历方法
 *  * 供CustomerView调用
 *//*

public class CustomerList {
    private Customer[] customers; //用来保存客户对象的数组
    private int total = 0;//记录已保存客户对象的数量

    //用来初始化customers数组的构造器
    //totalCustomer:指定数组的长度
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer]; //动态初始化,不知道数组长度
    }
    //将指定的客户添加到数组中
    //param:  customer
    //return : true:添加成功   false:添加失败
    public boolean addCustomer(Customer customer){
        if(total >= customers.length){
            return false;
        }
        //放在total的位置，首次调用total=0
//        customers[total] = customer;
//        total++;
        customers[total++] = customer;
        return true;
    }
    //修改指定索引位置的客户信息
    //param:  index
    //param:  cust
    //return : true:修改成功   false:修改失败
    public boolean replaceCustomer(int index,Customer cust){
//        if(index < 0 && index > customers.length)
        if(index < 0 || index >=total){ //total = 3, Maxindex =2
            return false;
        }
        customers[index] = cust;
        return true;
    }
    //删除指定索引位置的客户信息
    //param:  index
    //return : true:删除成功   false:删除失败
    public boolean deleteCustomer(int index){
        if(index < 0 || index >= total){
            return false;
        }
//        return customers[total--] = customer; 错误
        for(int i = index;i < total -1; i++){  //total-1表示数组下标最多
            customers[i] = customers[i+1]; //后一个补上前一个
        }
        //最后有数据的元素需要置空
//        customers[total-1] = null;
//        total--;合并
        customers[--total] = null;//没有total索引的元素，需要先-1，--total
        return true;
    }
    //获取所有客户的信息

    public Customer[] getAllCustomers(){
//不能直接return customers;  可能会有空
        Customer[] custs = new Customer[total];  //custs的长度=total 注意：长度length=total,索引index=total-1
        for(int i = 0;i <total;i++){
            custs[i] = customers[i];  //不是复制了每个customers的对象，只是复制了地址值
        }
        return custs;
    }
    //获取指定索引位置上的客户
    //param:  index
    //return ：如果找到了元素，则返回； 如果没有找到，则返回null
    public Customer getCustomer(int index){
        if(index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }
    //获取存储的客户的数量
    public int getTotal(){
        return total;  //total=存储的客户数量，customers.length=数组长度，有可能没有存满
        //return customers.length;   错误
    }



}
*/
