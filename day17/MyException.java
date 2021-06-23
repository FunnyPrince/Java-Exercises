package com.day17;

/**
 * @author FunnyPrince_
 * @date 2021/4/12 - 21:50
 * 如何自定义异常类？
 * 1.继承现有的异常结构：RuntimeException、Exception
 * 2.提供全局常量：SerialVersionUID
 *3.提供重载的构造器
 * 使用在StudentTest
 */
public class MyException extends Exception{//RuntimeException
    static final long serialVersionUID = -76149665664313L;

    public MyException(){

    }
    public MyException(String msg){
        super(msg);
    }
}
