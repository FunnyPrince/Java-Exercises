package com.day29;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author FunnyPrince_
 * @date 2021/5/7 - 18:34
 * 动态代理
 */
interface Human{
    String getBelief();
    void eat(String food);
}
//被代理类
class SuperMan implements Human{
    @Override
    public String getBelief() {
        return "I believe";
    }

    @Override
    public void eat(String food) {
        System.out.println("eat " + food);
    }
}
/*
要实现动态代理，需要解决的问题？
1.如何根据加载到内存中的被代理类，动态地创建一个代理类及其对象？
2.当通过代理类的对象调用方法时，如何动态地调用被代理类中的同名方法。

 */
class ProxyFactory{
    //调用此方法，返回一个代理类的对象。
    public static Object getProxyInstance(Object obj){//obj:被代理类的对象
        MyInvocationHandler handler = new MyInvocationHandler();

        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);//被代理类所实现的接口，代理类也实现
    }
}
class MyInvocationHandler implements InvocationHandler {

    private Object obj;//赋值时也需要使用被代理类的对象进行赋值。
    public void bind(Object obj){
        this.obj = obj;
    }
    //当我们通过代理类的对象，调用方法A时，就会自动调用下面的invoke()
    //将被代理类要执行的方法A的功能声明在invoke()中

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //method:即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
        //obj:被代理类的对象
        Object returnValue = method.invoke(obj,args);
        //上述方法的返回值就作为当前类中的invoke()的返回值
        return returnValue;
    }
}
public class ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        //proxyInstance:代理类的对象
        Human proxyInstance = (Human)ProxyFactory.getProxyInstance(superMan);
        //当通过代理类对象调用此方法时，会自动调用被代理类中同名的方法
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("rice");

        System.out.println("*****************");

        LiningClothFactory liningClothFactory = new LiningClothFactory();
        ClothFactory proxyClothFactory = (ClothFactory) ProxyFactory.getProxyInstance(liningClothFactory);
        proxyClothFactory.produceCloth();



    }
}
