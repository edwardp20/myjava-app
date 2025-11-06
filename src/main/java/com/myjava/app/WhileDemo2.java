package com.myjava.app;
import java.util.Scanner;

public class WhileDemo2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 

        int a=sc.nextInt();
        int tmp=a;
        int count=0;
        while(a!=0){
            count=count*10+a%10;
            a= a/10;
        }
        System.out.println(count==tmp); 
    }  
} 
