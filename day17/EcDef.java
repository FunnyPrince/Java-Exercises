package com.day17;

/**
 * @author FunnyPrince_
 * @date 2021/4/12 - 22:18
 * 自定义异常类
 */
public class EcDef extends Exception{
    static final long serialVersionUID = -7984116164661L;
    public EcDef(){}

    public EcDef(String msg){
        super(msg);
    }
}
