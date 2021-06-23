package com.day17;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author FunnyPrince_
 * @date 2021/4/12 - 21:16
 *
 * 方法重写的规则之一：
 * 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 *
 *
 *
 */
public class OverrideTest {
    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        test.display(new SubCLass());
    }
    public void display(SuperClass s){
        try{
            s.method();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

class SuperClass{
    public void method() throws IOException {

    }
}
class SubCLass extends SuperClass{
    public void method() throws FileNotFoundException {

    }
}