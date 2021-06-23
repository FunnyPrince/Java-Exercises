package com.day26;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * @author FunnyPrince_
 * @date 2021/4/30 - 18:22
 *
 * 其他流的使用
 * 1.标准的输入、输出流
 * 2.打印流
 * 3.数据流
 */
public class OtherStreamTest {
    /*
    1.标准的输入、输出流
    1.1
        System.in:标准的输入流，默认从键盘输入
        System.out:标准的输出流，默认从控制台输出
    1.2
        System类的setIn(InputStream is) / setOut(printStream ps)方式重新指定输入和输出的流
        直至当输入“e”或者“exit”时，退出程序。

    1.3练习:
        从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续进行输入操作，
        直至当输入“e”或者“exit”时，退出程序。
        方法一:使用Scanner实现,调用next()返回一个字符串
        方法二:使用System.in实现.System.in-->转换流-->BufferedReader的readLine()


     */

    @Test
//    public void test1(){ //test()不能从键盘输入
    public static void main(String[] args){
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            while(true){
                System.out.println("请输入字符串:");
                String data = br.readLine();
    //            if(data.equalsIgnoreCase("e") || data.equalsIgnoreCase("exit")){
                if("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)){  //这种写法避免空指针
                    System.out.println("程序结束");
                    break;
                }
                String upperCase = data.toUpperCase(Locale.ROOT);
                System.out.println(upperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
