package com.company;

/**
 * @author FunnyPrince_
 * @date 2021/3/23 - 21:48
 */
public class AriTest {
    public static void main(String[] args) {
        int num = 187;

        int bai = num / 100;
        int shi = num % 100 /10;
        int ge = num % 10;
        System.out.println("百位："+ bai);
        System.out.println("十位："+ shi);
        System.out.println("个位："+ ge);
    }
}
