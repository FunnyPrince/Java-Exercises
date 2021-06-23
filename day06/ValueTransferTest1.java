package com.day06;

/**
 * @author FunnyPrince_
 * @date 2021/3/28 - 21:31
 *
 * 方法的形参的传递机制：值传递
 * 1.  形参：方法定义时，声明的()内的参数
 *     实参：调用方法时，实际传递给形参的数据
 * 2.值传递机制：值传递
 *     如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值
 *      如果参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址值
 *
 *
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {

        //交换两个变量的值操作
        int m = 10;
        int  n = 20;
        System.out.println();
        System.out.println("m = " + m + ", n = " + n);

/*        int temp = m;
        m = n;
        n = temp;
        System.out.println("交换后 m = " + m + ", n = " + n);*/

        ValueTransferTest1 test = new ValueTransferTest1();
        test.swap(12,15);//执行完swap(),swap()内定义的变量就出栈了，
        //再执行打印语句就是main()中的了
        System.out.println("调用main():m = " + m + ", n = " + n); //10,20

        Data data = new Data(); //
        test.swap1(data);//实参data传给形参data,
        System.out.println("调用swap1():i=" + data.i + " ,j=" + data.j);


    }
    public void swap(int m,int n){
        int temp = m;
        m = n;
        n = temp;
        System.out.println("调用swap():交换后 m = " + m + ", n = " + n);// 交换了：15,12
        //想要打印出交换后的，即swap()中的，就要在swap()中执行打印语句
        // 局部变量的作用域在自己的代码块内！！！！
    }
    public void swap1(Data data){
        int temp = data.i;
        data.i = data.j;
        data.j = temp;
    }
}
class Data{
    int i = 11;
    int j = 12;

}

