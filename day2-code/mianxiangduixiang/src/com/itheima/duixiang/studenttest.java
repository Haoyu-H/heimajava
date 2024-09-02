package com.itheima.duixiang;

public class studenttest {
    public static void re12(student stu,student[] arr){
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getId()==stu.getId()){
                System.out.println("重复添加，添加失败！");
                flag=1;
            }
//            else{
//                student[] arr1=new student[arr.length+1];
//                for(int j=0;j<arr.length;j++){
//                    arr1[j]=arr[j];
//                }
//                arr1[arr.length]=stu;
//            }
        }
        if(flag==0){
        student[] arr1=new student[arr.length+1];
                for(int j=0;j<arr.length;j++){
                    arr1[j]=arr[j];
                }
                arr1[arr.length]=stu;
            for(int i=0;i<arr1.length;i++){
                System.out.println(arr1[i].getId());
                System.out.println(arr1[i].getName());
                System.out.println(arr1[i].getAge());
            }
        }

    }

    public static void re34(int id, student[] arr) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId() == id) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = null; // 或者不设置，视情况而定
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("删除失败！");
        }
    }

    public static void re5(int id, student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getId() == id) {
                arr[i].setAge(arr[i].getAge() + 1);
                return; // 如果找到了就返回，避免重复打印“查无此人！”
            }
        }
        System.out.println("查无此人！");
    }

    public static void main(String[] args) {
        student s1=new student(101,"李雷",20);
        student s2=new student(102,"张三",22);
        student s3=new student(103,"王丽",21);
        student s4=new student(104,"邱成浩",21);
        student[] arr=new student[3];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        re12(s4,arr);
        re34(101,arr);
        re5(102,arr);
    }
}
