package com.day20;

import org.junit.jupiter.api.Test;

/**
 * @author FunnyPrince_
 * @date 2021/4/18 - 21:12
 *
 * 获取两个字符串中最大相同子串，比如：
 * str1 = "abhsgihsnksjdowioinsdhihhello"; str2 = "bhsnksnksjhihello";
 * 提示：将短的那个串进行长度依次递减的子串与较长的串比较
 */
public class StringDemo2 {

    public String getMaxSameString(String str1,String str2){
       if(str1 != null && str2 != null){

           String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
           String minStr = (str1.length() < str2.length()) ? str1 : str2;
           int length = minStr.length();

           for (int i = 0; i < length; i++) {//外层几个大轮：min长度个大轮


               //小串从0开始到length，，假如直接包含最大的subStr，就直接是小串

               for (int x = 0, y = length - i; y <= length ; x++,y++) {
                   String subStr = minStr.substring(x,y);
                   if(maxStr.contains(subStr)){//maxStr要是有subStr,第一轮开始，subStr=minStr
                       return subStr;//就返回subStr
                   }
               }
           }
       }
        return null;
    }

    @Test
    public void testGetMaxSameString(){
        String str1 = "abhsgihsnksjdowioinsdhihhello";
        String str2 = "bhsnksnksjhihello";
        String maxSameString = getMaxSameString(str1,str2);
        System.out.println(maxSameString);
    }
}
