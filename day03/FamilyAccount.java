package com.day03;

/**
 * @author FunnyPrince_
 * @date 2021/3/25 - 23:59
 */
//public class FamilyAccount {
//    public static void main(String[] args) {
//        boolean isFlag = true;
//        //用于记录用户的收入和支出的详情
//        String details = "收支\t账户金额\t收支金额\t说明 \n";
//        int balance = 10000;
////        while(true){
//        while(isFlag){
//            System.out.println("----------------------家庭收支记账软件--------------------");
//            System.out.println("                       1  收支明细");
//            System.out.println("                       2  登记收入");
//            System.out.println("                       3  登记支出");
//            System.out.println("                       4  退 出\n");
//            System.out.println("                        请选择1-4:");
//
//            //获取用户的选择
////            char selection = Utility.readMenuSelection();
//            switch(selection){
//                case '1':
//                    System.out.println("----------------------当前收支明细记录--------------------");
////                    System.out.println("收支\t账户金额\t收支金额\t说明 \n");
//                    System.out.println("-------------------------------------------------------");
//                    System.out.println(details);
//
//
//                    break;
//                case '2':
//                    System.out.println("本次收入金额:");
////                    int addMoney =  Utility.readNumber();
//                    System.out.println("本次收入说明:");
////                    String addInfo = Utility.readString();
//
//                    //处理balance
////                    balance += addMoney;
//
//                    //处理details
////                    details += "收入\t" + balance + "\t\t" + addMoney + "\t\t" + addInfo + "\n";
//
//                case '3':
//                    //因为上个case中没有break，可能定义的money/info会延续到这个case继续使用，避免重名
//                    System.out.println("本次支出金额:");
////                    int minusMoney =  Utility.readNumber();
//                    System.out.println("本次支出说明:");
////                    String minusInfo = Utility.readString();
//                    System.out.println("------------------------登记完成-----------------------");
//
//                    //处理balance
////                    if(balance >= minusMoney){
////                        balance -= minusMoney;
//
//                        //处理details
//                        details += "收入\t" + balance + "\t\t" + minusMoney + "\t\t" + minusInfo + "\n";
//
//                    }else{
//                        System.out.println("支出超出账户额度，支付失败");
//                    }
//
//                case '4':
//                    System.out.println("确认是否退出(Y/N):");
////                    char isExit = Utility.readConfirmSelection();
//                    if(isExit == 'Y'){
//                        isFlag = false;
//                    }
//
//
//            }
//
//
//
//
//            isFlag = false;
//        }
//
//
//
//    }
//}
