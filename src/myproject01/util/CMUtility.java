/*
package myproject01.util;

import java.util.Scanner;

*/
/**
 * @author FunnyPrince_
 * @date 2021/3/31 - 23:25
 *//*

public class CMUtility {
    private static Scanner scan = new Scanner(System.in);

    //用於界面菜單的選擇，该方法读取键盘，如果输入1-5任意字符，则方法返回，返回值为用户输入的字符
    public static char readMenuSelection() {
        char c;
        for(;;){
            String str = readKeyBoard(1,false);
            c = str.charAt(0);
            if(c != '1' && c != '2' && c != '3'
                    && c != '4'&& c != '5'){
                System.out.println("选择错误，请重新输入：");
            }else break;
        }
        return c;

    }

//    private static String readKeyBoard(int i, boolean b) {
    private static String readKeyBoard(int i, boolean b) {
        return "java";
    }

    //用于确认选择的输入，该方法从键盘读取"Y"/"N",并将其作为方法的返回值
    public static char readConfirmSelection(){
        char c;
        for(;;){
            String str = readKeyBoard(1,false);
            c= str.charAt(0);
            if(c == 'Y' || c == 'N'){
                break;
            }else{
                System.out.println("选择错误，请重新输入:");
            }
        }
        return c;
    }

    public static String readString(int i) {
        return "aaaa";
    }

    public static char readChar(String s) {
        return 'a';
    }

    public static int readInt() {
        return 'a';
    }

    public static String readString() {
        return "a";
    }

    public static String readString(int i, String name) {
        return "a";
    }
}
*/
