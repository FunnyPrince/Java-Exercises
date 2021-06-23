package com.day13;

/**
 * @author FunnyPrince_
 * @date 2021/4/7 - 20:04
 */
public class MainDemo {
    public static void main(String[] args) {
        for(int i = 0;i < args.length;i++){
            System.out.println("***" + args[i]);

            int num = Integer.parseInt(args[i]);
        }
    }
}
