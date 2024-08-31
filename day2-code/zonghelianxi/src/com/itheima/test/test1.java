package com.itheima.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        double ticket = sc.nextInt();
        System.out.println("请输入当前的月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的座位");
        int seat = sc.nextInt();
        if(month<=10 && month>=5 && seat ==1 ){
            ticket = ticket *0.9;
        }
        else if(month<=10 && month>=5 && seat ==0 ){
            ticket = ticket *0.85;
        }
        else if((month<=12 && month>=11) || (month<=4 && month>=1) && seat ==1 ){
            ticket = ticket *0.7;
        }
        else{
            ticket = ticket *0.65;
        }
        System.out.println(ticket);













    }
}
