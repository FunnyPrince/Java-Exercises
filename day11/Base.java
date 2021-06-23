package com.day11;

/**
 * @author FunnyPrince_
 * @date 2021/4/5 - 21:06
 */
class Base {
    int count = 10;
    public void display() {
        System. out. println(this. count);
    }
}
class Sub extends Base{
    int count = 20;
    public void display() {  //display()重写，调用自己
        System. out. println(this. count);
    }
}
