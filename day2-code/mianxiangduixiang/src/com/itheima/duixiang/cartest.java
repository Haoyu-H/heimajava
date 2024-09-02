package com.itheima.duixiang;

import java.sql.SQLOutput;
import java.util.Scanner;

public class cartest {
    public static void main(String[] args) {
//        car c1 = new car("audi",500000,"black");
//        car c2 = new car("bmw",600000,"red");
        Scanner sc = new Scanner(System.in);
//        for(int i=0;i<3;i++){
//        System.out.println("请输入汽车品牌");
//        String[] b;
//        b[i]
//        System.out.println("请输入汽车价格");
//        int p
        car[] arr = new car[3];
        for (int i = 0; i < 3; i++) {
            car c = new car();
            System.out.println("请输入汽车的品牌：");
            String b = sc.next();
            c.setBrand(b);
            System.out.println("请输入汽车的价格：");
            int p = sc.nextInt();
            c.setPrice(p);
            System.out.println("请输入汽车的颜色：");
            String col = sc.next();
            c.setColor(col);


            arr[i] = c;
        }



}
}
