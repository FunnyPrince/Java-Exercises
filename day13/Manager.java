package com.day13;

/**
 * @author FunnyPrince_
 * @date 2021/4/8 - 0:25
 * 对于Manager类，他既是员工，还具有将近(bonus)的属性
 */
public class Manager extends Employee{
    private double bonus;//奖金

    public Manager(double bonus){
        super();
        this.bonus = bonus;
    }
    public Manager(String name,int id,double salary,double bonus){
        super(name,id,salary);
        this.bonus = bonus;
    }
    @Override
    public void work() {
        System.out.println("管理员工工作");
    }
}
