package com.day02;

/**
 * @author FunnyPrince_
 * @date 2021/3/25 - 0:16
 *
 *
 * switch-case中，若多个case的执行语句一样，可以合并多个case
 */
public class SwitchTest1 {
    public static void main(String[] args) {
        int score = 80;

    /*    switch(score){
            case 0:

            case 100:
            太麻烦
            */
        //最优应该是switch(score / 60)
        switch(score / 10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:

                System.out.println("不及格");
                break;
            case 5:
                System.out.println("及格");



        }

    }
}
