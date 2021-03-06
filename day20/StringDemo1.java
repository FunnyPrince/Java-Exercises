package com.day20;

import org.junit.jupiter.api.Test;

/**
 * @author FunnyPrince_
 * @date 2021/4/18 - 20:51
 *
 * 获取一个字符串在另一个字符串中出现的次数
 * 比如：获取“ab”在“abhshsoabsdshdeuihsbhjabshfab”中出现的次数
 */
public class StringDemo1 {

    //后去subStr在mainStr中出现的次数
    public int getCount(String mainStr,String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;

        if(mainLength >= subLength){
//            if((index = mainStr.indexOf(subStr)) != -1){//if找到一次就跳出
            //方式一：
          /*  while((index = mainStr.indexOf(subStr)) != -1){//while找到继续找
                count++;
                mainStr = mainStr.substring(index + subStr.length());//截取找到的subStr之后，后面的子串重新充当mainStr
            }*/

            //方式二：对方式一的改进
            while((index = mainStr.indexOf(subStr,index)) != -1){
                count++;
                index += subLength;
            }


            return count;
        }else{
            return 0;
        }
    }

    @Test
    public void testGetCount(){
        String mainStr = "abahshsoabasdshdeuihsbhjabshfaba";
        String subStr = "aba";
        int count = getCount(mainStr,subStr);
        System.out.println(count);
    }
}
