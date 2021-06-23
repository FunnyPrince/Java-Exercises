package com.day20;

import org.junit.jupiter.api.Test;

/**
 * @author FunnyPrince_
 * @date 2021/4/19 - 0:03
 *
 * 商品类__>排序指路CompareTest
 */
public class Goods implements Comparable{
    private String name;
    private double price;

    public Goods(){}

    public Goods(String name,double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //致命商品比较大小的方式:按照价格从低到高排序,再按照商品名称从低到高排序
    public int compareTo(Object o){
        if(o instanceof Goods){
            Goods goods = (Goods)o;
//            方式一：
            if(this.price > goods.price){
                return 1;
            }else if(this.price < goods.price){
                return -1;
            }else{
//                return 0;
                return this.name.compareTo(goods.name);//String类已经重写了compareTo()
//                return -this.name.compareTo(goods.name);//商品名称从高到低
            }
            //方式二：
//            return Double.compare(this.price,goods.price);
        }
        throw new RuntimeException("传入的数据类型不一致");
    }


}
