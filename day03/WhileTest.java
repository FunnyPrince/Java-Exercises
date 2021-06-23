package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/25 - 19:57
 *  * 循环结构的4个要素
 *  * 1.初始化条件
 *  * 2.循环条件  ---boolean类型
 *  * 3.循环体
 *  * 4.迭代体
 *
 *  while循环的结构:
 *  1.
 *  while(2){
 *      3;
 *      4;
 *  }
 *   1--2--3--4--2--3--4…… --2
 *  写while循环不要丢了迭代条件，否则可能导致死循环
 *  写程序要避免死循环
 *   for循环和while循环可以相互转换
 *
 *  算法：有限性
 */
public class WhileTest {
    public static void main(String[] args) {

        int i = 1;
        while(i <= 100){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println(i);//i定义在while外面，可以输出，i++后=101

    }
}
