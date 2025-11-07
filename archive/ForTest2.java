package com.myjava.tests;
import java.util.Scanner;


public class ForTest2{
    public static void main(String[] args){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=1;i<=k;i++){
            sum+=i;
        }
        System.out.println(sum);
        
    }
}