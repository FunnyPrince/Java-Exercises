package com.day09;

/**
 * @author FunnyPrince_
 * @date 2021/4/1 - 22:11

 (1)定义一个ManKid类，包括
 * ➢成员变量int sex和int salary;
 * ➢方法void manOrWoman():根据sex的值显示“man”(sex==1)或者“woman"(sex==0);
 * ➢方法void employeed():根据salary的值 显示“no job" (salary==0)或者“jb"(salary!=0)。
 *
 * (2)定义类Kids继承ManKind,并包括
 * ➢成员变量int yearsOld; .
 * ➢方法printAge()打印yearsOld的值。
 * (3)定义类KidsTest，在类的main方法中实例化Kids的对象someKid,用该对象访问
 * 其父类的成员变量及方法。
 */
public class Mankind {
    private int sex;
    private int salary;

    public Mankind(){

    }
    public Mankind(int sex,int salary){

    }

    public void manOrWoman(){
        if(sex == 1){
            System.out.println("男");
        }else if(sex == 0){
            System.out.println("女");
        }
    }
    public void employeed(){
       String jobInfo = (salary == 0)?"no job" : "job";
        System.out.println(jobInfo);
    }
    public int getSex(){
        return sex;
    }
    public void setSex(int sex){
        this.sex = sex;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

}
