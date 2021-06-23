package com.day28;

import java.io.Serializable;

/**
 * @author FunnyPrince_
 * @date 2021/5/4 - 0:14
 */
public class Creature <T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("调用生物呼吸breath()");
    }
    public void eat(){
        System.out.println("调用生物eat()");
    }
}
