package com.day10;

/**
 * @author FunnyPrince_
 * @date 2021/4/2 - 21:55
 *
 * 多态性使用
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
//        test.func(new Cat());
    }

    public void func(Animal animal){ //Animal animal = new Dog();
        animal.eat();
        animal.shout();
    }
}
class Animal{
    public void eat(){
        System.out.println("动物吃饭");
    }
    public void shout(){
        System.out.println("动物叫声");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("Dog吃饭");
    }
    public void shout(){
        System.out.println("Dog汪汪");
    }

}
class Cat extends Animal {
    public void shout() {
        System.out.println("Cat喵喵");
    }
}
