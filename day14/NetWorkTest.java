package com.day14;

/**
 * @author FunnyPrince_
 * @date 2021/4/8 - 23:45
 *
 * 接口的应用：代理模式
 */
public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();//NetWork实现类的对象，多态
        ProxyServer proxyServer = new ProxyServer(server); //代理类对象
        proxyServer.browse();//代理类调用方法，实际上重写了被代理类的方法
        //被代理类实现操作，代理类提供检查等额外操作
    }
}
interface NetWork{
    public void browse();
}
//被代理类
class Server implements NetWork{
    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}
//代理类
class ProxyServer implements NetWork{
    private NetWork work;
    public ProxyServer(NetWork work){
        this.work = work;
    }
    public void check(){
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();
        work.browse();//代理类调用方法
    }
}