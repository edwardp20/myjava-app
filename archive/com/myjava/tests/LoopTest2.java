package com.myjava.tests;
import java.util.Scanner;



public class LoopTest2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<number;i++){
            if(number==2){
                
            
                flag=false;
            } else{
                if(number%i==0){
                    flag=false;
                    break;
                }
            }
        
        }
        if(flag){
            System.out.println("a");
        } else{
            System.out.println("b");
        }
    }
}