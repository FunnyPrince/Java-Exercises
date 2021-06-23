package com.day13;

/**
 * @author FunnyPrince_
 * @date 2021/4/8 - 0:31
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //多态
        Employee manager = new Manager("Jane", 1001, 5000, 50000);
        manager.work();

        CommonEmployee common = new CommonEmployee();
        common.work();
    }
}
