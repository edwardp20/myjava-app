package com.myjava.app;
import java.util.Scanner;

public class IfTest2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        //判断是否合法
        if(score<=100){
            if(score<=100&&score>=95){
                System.out.println("自行车");
            } else if(score<=94&&score>=80){
                System.out.println("游乐场");
            } else{
                System.out.println("揍一顿");
            }
        } else{
            System.out.println("滚");
        }
        
        
        
    }
}
