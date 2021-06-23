package com.day06;

/**
 * @author FunnyPrince_
 * @date 2021/3/28 - 13:08
 *
 * 3.1 10行8列矩阵，在main中调用
 * 3.2 并求出面积
 * 3.3 在method方法提供m、n两个参数，方法中打印m*n的*型矩阵，冰球面积，将其作为方法返回值
 * 在main中调用，接收返回值面积并打印
 */
public class ExerTest {
    public static void main(String[] args) {
        ExerTest test = new ExerTest();

   /*     //3.1 测试
        test.method();*/

/*        //3.2.1
        int area = test.method;
        System.out.println(area);
        //3.2.2
        System.out.println(test.method());*/

        //3.3测试
        System.out.println(test.method( 3,5));


    }

    //3.1
    /*public void method(){
        for(int i=0;i<10;i++){
            for(int j = 0; j < 8; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
*/



   //3.2
   /* public int method() {   //有返回值，不能void
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
//            return area;
        }
        return 10*8;
    }*/

    //3.3
    public int method(int m,int n) {   //有返回值，不能void
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }

}
