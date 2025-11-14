package com.myjava.tests;
import java.util.Scanner;
//这个是用来计算面积


public class MethodTest1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double c=sc.nextDouble();
        areaS(c);
    }
    public static void areaS(double a){
        double b=a*a*3.14;
        System.out.println(b);
    }
}