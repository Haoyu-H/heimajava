package com.itheima.test;

import java.util.Random;

public class test3 {
  public static void main(String[] args) {
      Random rand = new Random();
      int[] num1 = new int[4];
      for(int i = 0; i < num1.length; i++){
          num1[i] = rand.nextInt(52);
      }
//      int num2 = rand.nextInt(26);
      int[] arr1 = new int[52];
//      int[] arr2 = new int[26];

      for (int i = 0; i < 25; i++) {
          arr1[i] = 'a' + i;
      }
      for(int i =25;i<51;i++){
          arr1[i] = 'A' + i-25;
      }
      char[] arr= new char[4];
      for(int i =0;i<4;i++){
        arr[i] = (char)arr1[num1[i]];
      }
      int num = rand.nextInt(9);
      for(int i =0;i<arr.length;i++){
      System.out.print(arr[i]);
      }
      System.out.println(num);
  }

}
