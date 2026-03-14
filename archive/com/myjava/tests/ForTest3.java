package com.myjava.tests;
import java.util.Scanner;


public class ForTest3{
    public static void main(String[] args){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=1;i<=k;i++){
            if(i%2==0){
            sum+=i;
            }
        }
        System.out.println(sum);
        
    }
}