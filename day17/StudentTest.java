package com.day17;

/**
 * @author FunnyPrince_
 * @date 2021/4/12 - 21:33
 */
public class StudentTest {
    public static void main(String[] args) {

        try {  //在这里处理throws抛出的异常
            Student s = new Student();
//            s.regist(1001);
//            System.out.println(s);
            s.regist(-1001);
            System.out.println(s);//上条出现异常，不执行词句
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}


class Student{
    private int id;
    public void regist(int id) throws Exception {//注册
        if(id > 0){
            this.id = id;
        }else{
//            System.out.println("输入非法");
            //手动抛出异常对象 throw
            //1.
//            throw new RuntimeException("您输入的数据非法");//通过构造器赋值
            //RuntimeException运行时异常，不处理

            //2.
//            throw new Exception();//Exception异常包括编译时/运行时异常，要处理编译时异常
            //在regist()方法后处理异常（throws抛出）
            throw new MyException("不能输入负数");//new异常类对象
        }
    }
    public String toString(){
        return "Student id = [" + id + "]";
    }
}