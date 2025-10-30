package com.myjava.app;
import java.util.Scanner;

public class IfDemo2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        if(money>=100){
            System.out.println("吃网红");
        } else{
            System.out.println("吃沙县");
        }
        
        
        
    }
}
