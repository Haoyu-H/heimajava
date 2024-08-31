package com.itheima.test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int[] arr = new int[10];
        int num = 0;
        int temp = n;

        // 计算数字的位数
        while (temp > 0) {
            num++;
            temp /= 10;
        }
//        char[] arr2 = new char[10];
//        int[] arr1 = new int[10];
//        int m=(int) Math.pow(a,b); 幂运算
        for(int i = num-1;i >= 0;i--){
            arr[i]=n%10;
            n/=10;
        }
        for(int i = 0;i < num;i++){
            arr[i]+=5;
            arr[i]%=10;
        }
        for(int i = num-1;i >= 0;i--){
            System.out.print(arr[i]);
        }
    }
}
