package com.day05;

/**
 * @author FunnyPrince_
 * @date 2021/3/30 - 0:32
 * 冒泡排序
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr= new int[] {45,56,23,-15,46,89,-78,45,12,26};

        //冒泡排序
        for(int  i = 0; i < arr.length-1;i++){
            for(int j = 0; j < arr.length - 1 - i; j++) {//忘了{}

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }

    }
}

