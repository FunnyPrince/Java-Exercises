package com.day13;

/**
 * @author FunnyPrince_
 * @date 2021/4/7 - 19:56
 * Main()方法
 * 1.main()作为程序入口
 * 2.普通的静态方法
 * 3.main()也可以作为我们与控制台交互的方式（之前：Scanner)
 *相当于自带String[]
 */
public class MainTest {
    public static void main(String[] args) {

        //通过Main类调用下面的main()
        Main.main(new String[100]);
    }
}
class Main{
    //普通的静态方法
    public static void main(String[] args) {
//        args = new String[100];
        for(int i = 0;i < args.length;i++){
            args[i] = "args" + i;
            System.out.println(args[i]);
        }
    }
}
