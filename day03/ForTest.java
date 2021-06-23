package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/25 - 12:57
 *
 * 循环结构的4个要素
 * 1.初始化条件
 * 2.循环条件  ---boolean类型
 * 3.循环体
 * 4.迭代体
 *
 * for循环的结构
 * for(1;2;4){
 *     3
 * }
 * 执行过程：1-2-true-3-4-2-trye-3……false-2
 */
public class ForTest {
    public static void main(String[] args) {
        for(int i = 0; i <=500; i++){
            System.out.println("我要循环500次。");
        }
        //i只在for循环内有效，出了for循环失效
        //System.out.println(i);

        //练习:
        int num = 1;
        //for表达式里只能有两个分号( ; ; )
        // System.out.println("b"), num++ 使用 , 的原因：让它以为是1个整体
        for(System.out.println("a"); num <= 3; System.out.println("b"), num++){
            System.out.println("c");
            //num = 1, 进入循环条件，输出a，1<=3;执行输出c,然后再num++, num = 2继续
            //输出：acbcbcb
        }

        //遍历100以内的偶数,输出所有偶数的和，输出偶数的个数
        int sum = 0; //记录所有偶数的和
        int count = 0;//记录偶数的个数
        for(int i = 1; i <=100; i++){
            if(i % 2 ==0){
                System.out.println("遍历100以内的偶数：" + i);
                //System.out.println(i);
                sum += i;//必须要执行完之后给sum加一次，重新赋值的意思
                count ++;
            }
            //不可以写在这里，在for循环体内，表示每次都要执行
           // System.out.println("总和为："+ sum);
        }
        System.out.println("总和为："+ sum);
        System.out.println("偶数个数为："+ count);

    }
}
