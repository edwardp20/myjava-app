package com.myjava.tests;

import java.util.Scanner;

public class AllTest2 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in); 
        int start=sc.nextInt(); 
        int end=sc.nextInt();
        for (int i = start; i <=end ; i++) {
            boolean flag=true;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    flag=false;
                }
                
            }
            if (flag) {
                    System.out.println("质数"+i);
                    count++;
            }
        
        }
        System.out.println("一共有"+count+"个质数");
        sc.close(); 
    }
}
