package com.itheima.duixiang;

import java.util.Scanner;

public class phonetest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        phone[] arr = new phone[3];
        for (int i = 0; i < 3; i++) {
            phone c = new phone();
            System.out.println("请输入手机的品牌：");
            String b = sc.next();
            c.setBrand(b);
            System.out.println("请输入手机的价格：");
            int p = sc.nextInt();
            c.setPrice(p);
            System.out.println("请输入手机的颜色：");
            String col = sc.next();
            c.setColor(col);


            arr[i] = c;
        }
        System.out.println((arr[0].getPrice()+arr[1].getPrice()+arr[2].getPrice())/3);
    }
}
