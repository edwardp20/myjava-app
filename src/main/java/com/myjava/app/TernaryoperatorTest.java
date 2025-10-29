package com.myjava.app;
import java.util.Scanner;

public class TernaryoperatorTest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //老虎体重
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        //开始比较
        String ma=number1==number2?"相同":"不同";
        System.out.println(ma);
        
    }
}
