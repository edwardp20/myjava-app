package com.myjava.app;
import java.util.Scanner;

public class IfTest1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ticket=sc.nextInt();
        if(ticket<=100&&ticket>0){
            if(ticket%2==1){
                System.out.println("左");
            } else{
                System.out.println("右");
            }
        }
        
        
    }
}
