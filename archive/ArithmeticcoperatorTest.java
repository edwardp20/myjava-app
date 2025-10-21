package com.myjava.app;
import java.util.Scanner;


public class ArithmeticcoperatorTest{
    public static void main(String[] args){
        //输入一个百位数，获得它的个位十位百位并打印在控制台
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入整数");
        int number=sc.nextInt();
        //个 x%10
        System.out.println(number%10);
        //十x/10%10
        System.out.println(number/10%10);
        //百x/100%10
        System.out.println(number/100%10);
        
        
        
        
        
        
     
    }
}
