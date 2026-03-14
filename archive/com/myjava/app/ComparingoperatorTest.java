package com.myjava.app;
import java.util.Scanner;


public class ComparingoperatorTest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入我们自己衣服的时髦程度");
        int w=sc.nextInt();
        System.out.println("请输入对方衣服的时髦程度");
        int t=sc.nextInt();
        boolean a=w>t;
        System.out.println(a);
        
    }
}
