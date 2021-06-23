package com.day17;

import sun.security.pkcs11.Secmod;

/**
 * @author FunnyPrince_
 * @date 2021/4/12 - 22:14
 * 本编写应用程序EcmDef .java, 接收命令行的两个参数，要求不能输入负数，计算两数相除。
 * 对数据类型不一致(NumberFormatException)、缺少命令行参数(ArrayIndexOutOfBoundsException.
 * 除0(ArithmeticException)及输入负效(EcDef自定义的异常)进行异常处理。
 * 提示:
 * (1)在主类(EcmDef)中定义异常方法(ecm)完成两数相除功能。
 * (2)在main( )方法中使用异常处理语句进行异常处理。
 * (3)在程序中，自定义对应输入负数的异常类(EcDef)。
 * (4)运行时接受参数java EcmDef 20 10  //args[0]="*20”args[1]=**10"
 * (5) Integer类的static方法parseInt(String s )将S转换成对应的int值。
 * 如: int a=Integer. parseInt(**314");
 * //a=314;
 */
public class EcmDef {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);//String类型转换为int
            int j = Integer.parseInt(args[1]);
            int result = ecm(i, j);
            System.out.println(result);
        }catch(NumberFormatException e){
            System.out.println("数据类型不一致");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch(ArithmeticException e){
            System.out.println("除0");
        }catch(EcDef e){
            System.out.println(e.getMessage());
        }
    }

    public static int ecm(int i,int j) throws EcDef{//非运行时异常
        if(i < 0 || j < 0){
            throw new EcDef("分子/分母为负数了");
        }
        return i / j;
    }
}
