package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/25 - 21:14
 * 100以内的所有质数的输出
 * 质数：素数，只能被1和它本身整除的自然数-->从2开始到i-1结束，都不能被i本整除身
 *  最小的质数：2
 *
 */
public class PrimeNumberTest {
    public static void main(String[] args) {

       // boolean isFlag = true; //表示j是否被i除尽，一旦除尽，修改其值
        for(int i = 2;i <= 100; i++){  //遍历100以内自然数

            boolean isFlag = true;  //或者放进for()循环体内，就不用重置
            //不过这样容易增加内存消耗，每次执行都要声明一次
            for(int j = 2; j < i; j++){//j被i除     j<=i-1,,  就等于j<i
                if(i % j == 0){ //被除尽
                    isFlag = false;  //代表一旦被i整除之后就改为false
                    //当执行到4的时候，就已经false了，但是需要重置才可以下一个继续
                }
            }
            if(isFlag == true){
                System.out.println(i);
            }
            isFlag = true; //else 重置isFlag
        }
        /*boolean isFlag = true; //表示j是否被i除尽，一旦除尽，修改其值
//        int i;
        //int sum = 0;
       *//* for(int i = 1; i <= 100; i++ ){
            if(i % 1 == 0 || i % i == 0){
                System.out.println(sum);
                sum++;
            }*//*
        for(int i = 2;i <= 100; i++){  //遍历100以内自然数
            for(int j = 2; j < i; j++){//j被i除     j<=i-1,,  就等于j<i
                if(i % j == 0){ //被除尽
                    isFlag = false;  //代表一旦被i整除之后就改为false
                    //当执行到4的时候，就已经false了，但是需要重置才可以下一个继续
                }
            }
            if(isFlag == true){
                System.out.println(i);
            }
            isFlag = true; //else 重置isFlag
        }*/

    }
}



