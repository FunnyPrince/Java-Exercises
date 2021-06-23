package com.day23;

/**
 * @author FunnyPrince_
 * @date 2021/4/21 - 0:24
 */
public class User implements Comparable{
    private String name;
    private int age;

    public User(){}

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }


    //重写compareTo():
    //按照姓名从大到小排列,年龄从小到大排列
    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            User user = (User)o;
            //从小到大
//            return this.name.compareTo(user.name);
            //从大到小
          //  return -this.name.compareTo(user.name);//只比较name
            //要想添加成功，需要修改compareTo(),对name，age都排序。

            int compare = -this.name.compareTo(user.name);
            if(compare != 0){
                return compare;
            }else{
                return Integer.compare(this.age,user.age);
            }

        }else{
            throw new RuntimeException("输入的类型不一致");
        }
    }
}
