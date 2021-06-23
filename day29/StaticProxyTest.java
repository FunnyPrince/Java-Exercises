package com.day29;

/**
 * @author FunnyPrince_
 * @date 2021/5/6 - 20:33
 */
//静态代理特点：代理类和被代理类在编译期间，就确定下来了
interface ClothFactory{
    void produceCloth();
}

//代理类
class ProxyClothFactory implements ClothFactory{
    private ClothFactory factory; //用被代理类对象进行实例化
    public ProxyClothFactory(ClothFactory factory){
        this.factory = factory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理工厂开始工作");
        factory.produceCloth();
        System.out.println("代理工厂调用produceCloth()");
    }
}

//被代理类
class LiningClothFactory implements ClothFactory{
    public void produceCloth(){
        System.out.println("李宁工厂(被代理类)生产一批潮流运动服");
    }
}
public class StaticProxyTest {

    public static void main(String[] args) {
        //创建被代理类的对象
        LiningClothFactory lining = new LiningClothFactory();
        //创建代理类的对象
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(lining);

        proxyClothFactory.produceCloth();

    }
}
