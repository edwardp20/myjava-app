package com.myjava.tests;

public class AllTest2 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 101; i <=200 ; i++) {
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
    }
}
