package com.day11;

/**
 * @author FunnyPrince_
 * @date 2021/4/6 - 0:30
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001,"java");
        Order order2 = new Order(1002,"java");
        System.out.println(order1.equals(order2)); //false   1

        Order order3 = new Order(1002,"java");
        System.out.println(order2.equals(order3));//true   使用equals()和==效果一样 常量池 2

        Order order4 = new Order(1002,new String("java"));
        System.out.println(order2.equals(order4));  //true 使用==就false，新new的一个，不是常量池里拿出来的

    }
}
class Order{
    private int orderId;
    private String orderName;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
    Order(int orderId,String orderName){
        super();
        this.orderId = orderId;
        this.orderName = orderName;
    }
    //重写equals()
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Order){
            Order order = (Order)obj; //不转就不能调用Order属性,但是我可以哈哈哈
//            return this.orderId == ((Order) obj).orderId && this.orderName.equals(((Order) obj).orderName);
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
            //下面也是true,是因为order2new的已经存在常量池了/order3可以直接从常量池调用，但不建议这样写
            //在上面的2处与==相同，在3处不同
//            return this.orderId == order.orderId &&
//            this.orderName == order.orderName;


        }
        return false;
    }

}