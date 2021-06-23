/*
package myproject01.view;

import myproject01.bean.Customer;
import myproject01.service.CustomerList;
import myproject01.util.CMUtility;

*/
/**
 * @author FunnyPrince_
 * @date 2021/3/31 - 23:24
 *
 * * CustomerView为主模块，负责菜单的显式和处理用户操作
 *
 *//*


public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView(){
        Customer customer = new Customer("小白",'男',26,"13516598720","1564973@163.com");
        customerList.addCustomer(customer);
    }
    //显示《客户信息管理软件》界面的方法
    public void enterMainMenu(){
        boolean isFlag = true;
        while(isFlag) {
            System.out.println("----------------------客户信息管理软件--------------------");
            System.out.println("                       1  添加客戶");
            System.out.println("                       2  修改客戶");
            System.out.println("                       3  刪除客戶");
            System.out.println("                       4  客戶列表");
            System.out.println("                       5  退 出\n");
            System.out.println("                        请选择1-5:");

            char menu = CMUtility.readMenuSelection();
            switch(menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("确认是否退出(Y/N):");
                   char isExit =  CMUtility.readConfirmSelection();
                   if(isExit == 'Y'){
                       isFlag = false;
                   }//输入'N',则表示不进入case'5',继续循环
            }



        }
    }
    //添加客户的操作
    private void addNewCustomer(){
//        System.out.println("添加客户的操作");
        System.out.println("--------------------------添加客户--------------------------\n");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);
        System.out.print("性别：");
        char gender = CMUtility.readChar("性别(" + cust.getGender() + "):");
        System.out.println("年龄");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(13);
        System.out.print("邮箱：");
        String email = CMUtility.readString(30);

        //将上述数据封装到对象中
        Customer customer = new Customer(name,gender,age,phone,email);
        boolean isSuccess = customerList.addCustomer(customer);
        if(isSuccess){
            System.out.println("--------------------------添加完成-------------------------\n");
        }else{
            System.out.println("---------------------客户目录已满，添加失败-------------------\n");
        }
    }
    //修改客户信息
    private void modifyCustomer(){
//        System.out.println("修改客户的操作");
//        System.out.println("修改客户的操作");
        System.out.println("--------------------------修改客户-------------------------\n");

        Customer cust;//声明拿出去
        int number;
        for(;;){
            System.out.println("请选择待修改客户编号(-1退出)：");
//           int number = CMUtility.readInt();
            number = CMUtility.readInt();//number也声明在外面
            if(number == -1){
                return;   //退回到主界面；return，此modifyCustomer()方法结束，switch(menu)结束，继续while(isFlag)
            }
            //用户的1相当于我们的1-1，我们看索引
//          Customer cust = customerList.getCustomer(number-1); 分开
            cust = customerList.getCustomer(number-1);  //声明在外面，赋值在里面
            if(cust == null){
                System.out.println("无法找到指定的客户！");
            }else{ //找到了相应编号的客户
                break;
            }
        }
        //修改客户信息 ,循环结束代表找到了
        //cust变量定义在循环里，循环外部不能用，拿到外面number也是在里面获取，
        // 所以Customer cust;//声明拿出去；cust = customerList.getCustomer(number-1); 在里面赋值
        System.out.print("姓名("+cust.getName() + "):");
        String name = CMUtility.readString(10,cust.getName());
        System.out.print("性别("+cust.getGender() + "):");
        char gender = CMUtility.readChar("性别("+cust.getGender()+"):");
        System.out.print("年龄("+cust.getAge() + "):");
        int age = CMUtility.readInt(cust.getAge());
        System.out.print("电话("+cust.getPhone() + "):");
        String phone = CMUtility.readString(13,cust.getPhone());
        System.out.print("邮箱("+cust.getEmail() + "):");
        String email = CMUtility.readString(30,cust.getEmail());

        Customer newCust = new Customer(name,gender,age,phone,email); //new一个新的
        boolean isReplaced = customerList.replaceCustomer(number-1,newCust);
        if(isReplaced) {
            System.out.println("--------------------------修改完成-------------------------\n");
        }else {
            System.out.println("--------------------------修改失败-------------------------\n");
        }
    }
    //删除客户的操作
    private void deleteCustomer(){
        System.out.println("--------------------------删除客户-------------------------\n");

        int number;
       for(;;) {
           System.out.println("请选择待删除客户编号(-1退出)：");
           number = CMUtility.readInt();

           if (number == -1) {
               return;
           }
           Customer customer = customerList.getCustomer(number-1);
           if(customer == null){
               System.out.println("无法找到指定客户！");
           }else{
               break;
           }
       }
       //找到了指定的客户
        System.out.println("确认是否删除(Y/N):");
       char isDelete = CMUtility.readConfirmSelection();
       if(isDelete == 'Y'){
           boolean deleteSuccess = customerList.deleteCustomer(number-1);
           if(deleteSuccess) {
               System.out.println("--------------------------删除完成-------------------------\n");
           }else{
               System.out.println("--------------------------删除失败-------------------------\n");
           }

       } else{   //else自动回到主界面
            return;
       }
    }
    //显示客户列表的操作
    private void listAllCustomers(){
//        System.out.println("显示客户的操作");
        System.out.println("-------------------------客户列表--------------------------\n");

        int total = customerList.getTotal();
        if(total == 0){
            System.out.println("没有客户记录");
        }else{
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer[] custs = customerList.getAllCustomers();
            for(int i = 0;i < custs.length;i++){//custs.length=total
                Customer cust = custs[i];
                System.out.println((i+1) + "\t" + cust.getName()+"\t"+cust.getGender()
                +"\t" + cust.getAge()+"\t" +cust.getPhone()+"\t"+cust.getEmail());  //'\t'表示加法了：整型+字符型

            }
        }



        System.out.println("-----------------------客户列表完成------------------------\n");
    }
    public static void main(String[] args){
        CustomerView view = new CustomerView();
        view.enterMainMenu();

    }

}
*/
