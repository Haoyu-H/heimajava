package com.itheima.demo1;
import java.util.Scanner;


public class zhishu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        int n = sc.nextInt();
        if(n==2){
            System.out.println(2+"是质数");
        }
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                System.out.print(n + "不是质数");
                break;
            }
            else {
                System.out.println(n + "是质数");
            }
        }
    }
}
