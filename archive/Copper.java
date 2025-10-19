package com.myjava.app;
//导Scanner
import java.util.Scanner;

public class Copper{
    public static void main(String[] args){
        //欢迎词
        System.out.println("欢迎来到本计算器");
        Scanner sc=new Scanner(System.in);
        //第一个数
        System.out.println("请输入第一个数");
        //Scanner
        int number1=sc.nextInt();
        System.out.println("请输入第二个数");
        //第二个数
        int number2=sc.nextInt();
        int number3=number1+number2;
        //输出结果
        System.out.println("结果");
        System.out.println(number3);
    }
}
