package com.day04;

/**
 * @author FunnyPrince_
 * @date 2021/3/27 - 12:43
 *
 * 算法的考察：数组的复制、翻转、查找（线性查找、二分法查找）
 *
 *
 */
public class ArrayExer4 {
    public static void main(String[] args) {
        String[] arr = new String[]{"AB","AC","AD","AE","AF","AG"};


        //数组的复制(区别于数组变量的赋值，arr1=arr)
        String[] arr1 = new String[arr.length];
        for(int i = 0;i < arr.length; i++){
            arr1[i] = arr[i];
        }
        //数组的反转
/*        //方法1：
        for(int i = 0; i < arr.length / 2;i++){
            String temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }*/

        // 方法2:
        //i,j同个类型，一起定义并初始化，for()里只能有2个 ;  i<j,防止i与j重新换回来
        //i++,i向右走，j--,j向左走
/*        for(int i =0,j = arr.length -1; i < j; i++, j--){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }*/
        //遍历
        for(int i = 0;i < arr.length;i++ ){
            System.out.println(arr[i] + " ");
        }

        //查找
        //线性查找
        String dest = "AB";

        boolean isFlag = true;
        for(int i = 0;i < arr.length;i++){
            if(dest.equals(arr[i])){
                System.out.println("找到了dest指定的元素，位置为：" + i);
                isFlag = false;
                break;
            }
            if(isFlag){
                System.out.println("很遗憾，没有找到dest指定元素的值");
            }
        }

        //二分法查找
        //前提：索要查找的数组必须有序
//        int[] arr2 = new int[]{-98,56,78,45,15,-56,46};
        int[] arr2 = new int[]{-98,-56,12,45,56,78,89,98};

        int dest1 = -56;
        int head = 0; //初始的首索引
        int end = arr.length -1;//初始的末索引
        boolean isFlag1 = true;
//        for(int i = 0;i < arr2.length / 2; )
        while(head <= end){
            int middle = (head + end) / 2;
            if(dest1 == arr2[middle]){
                System.out.println("找到了dest1指定的元素，位置为：" + middle);
                isFlag1 = false;
                break;
            }else if(arr2[middle] > dest1){
//                end = arr2[middle-1];
                  end = middle -1;
            }else{  //arr2[middle] < dest1;
                head = middle +1;
            }
        }
        if(isFlag1) {//isFlag==true
            System.out.println("很遗憾，没有找到dest1指定的值");
        }




    }
}
