package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/25 - 23:21
 *break : switch-case 与 循环结构中   结束当前循环
 * continue:  循环结构中    结束当次循环
 * 相同点：关键字后面不能声明执行语句
 *
 */
public class BreakContinueTest {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if(i % 4 == 0) {
//                break; //123   123进不去，往下走输出123， 4进去终止循环
                continue;//123567910  当前这一次循环结束，进行下一次
                //sout 不可以声明执行语句
            }
            System.out.print(i);
        }
        System.out.println("\n");
//*******************************

        lable:for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 10; j++){
                if(j % 4 == 0){
//                    break;//默认跳出包裹此关键字最近的一层循环
//                    continue;
//                    break lable;// 结束指定标识的一层循环结构；
                    //用在想要在内层循环结构中结束外层循环结构
                continue lable; //结束指定标识的一层循环结构当次循环
                }
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
