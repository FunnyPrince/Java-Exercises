package com.day06;
/**
 * @author FunnyPrince_
 * @date 2021/3/28 - 16:06
 *
 * 定义一个工具类
 */
public class ArrayUtil {
    public int getMax(int[] arr){
        int maxValue = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public int getMin(int[] arr){
        int minValue = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(minValue > arr[i]){
                minValue = arr[i];
            }
        }
        return minValue;
    }
    public int getSum(int[] arr){
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
//            sum += i;
            sum += arr[i];
        }
        return sum;
    }
    public int getAvg(int[] arr){
//        return sum/
        return getSum(arr) / arr.length;
    }
    //反转数组
    public void reverse(int[] arr){
        for(int i = 0;i < arr.length / 2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
    //复制数组
    public int[] copy(int[] arr){
        int arr1[] = new int[arr.length];
        for(int i = 0;i < arr.length; i++){
            arr1[i] = arr[i];
        }
        return arr1;
    }
    //数组排序
    public void sort(int[] arr){
        //冒泡排序
        for(int i = 0;i < arr.length -1;i++){  //外层遍历次数
            for(int j = 0;j < arr.length-1-i; i++){  //跑完一层比较与排序
                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;//交换的索引位置的元素

                    //错误：
//                    swap(arr[j],arr[j+1]);
                    //正确：
                    swap1(arr,j,j + 1);//交换j / j+1位置的索引！
                    //相当于上面3行代码，需要写一个swap()
                }
            }
        }
    }
//    //错误：交换数组中指定两个位置元素的值
//    public void swap(int i, int j){
//        int temp = j;
//        i = j;
//        j = temp;
//    }
//    正确:交换数组中指定两个位置元素的值
    public void swap1(int[] arr, int i, int j){ //   i/j不是要交换的数，是对应的索引！！！
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //遍历数组
    public void print(int[] arr){
        for(int i = 0;i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
//        System.out.println();
    }
    //查找指定数组
    public int getIndex(int[] arr,int dest){
        //线性查找
        for(int i = 0; i < arr.length;i++){
            if(dest == arr[i]){
                return i;
            }
        }
        return -1;// 返回一个负数，表示没有找到
    }
}
