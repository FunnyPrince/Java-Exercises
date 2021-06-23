package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/25 - 19:32
 */
public class ReviewTest {
    public static void main(String[] args) {
        //int sum;  编译不通过，变量在使用前必须赋值，
        //int sum;之后，去掉for(),可以编译通过，不走if，就走else
        //不然sum不赋值，很可能进不去for()
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 ==0){
                System.out.println(i);
                sum = i;
            }else sum = 2;
        }
        System.out.println(sum);
    }
}
