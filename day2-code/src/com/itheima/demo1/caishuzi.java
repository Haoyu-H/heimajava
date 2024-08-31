package com.itheima.demo1;

import java.util.Random;
import java.util.Scanner;

public class caishuzi {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int num = r.nextInt(10);
//        System.out.println(num);
       while(true){
           int n = sc.nextInt();
           if(n<num){
               System.out.println("小了");
//            break;
           }
           else if(n>num){
               System.out.println("大了");

           }
           else{
               System.out.println("中了！");
               break;
           }
       }
    }

}
