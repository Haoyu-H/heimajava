package com.itheima.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        for(int i=101;i<=200;i++){
            test(i);
        }

    }
    public static void test(int n) {
        boolean flag = false;
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                flag = false;
            }
            else{
                flag = true;
            }
        }
        if(flag == true) {
            System.out.println(n);
        }

    }
}
