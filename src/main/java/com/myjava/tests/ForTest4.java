package com.myjava.tests;
import java.util.Scanner;

public class ForTest4{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("请输入一个数字表示范围的开始");
    	int start=sc.nextInt();
    	System.out.println("请输入一个数字表示范围的结束");
    	int end = sc.nextInt();
    	int sum=0;
    	for(int inFor=start;inFor<=end;inFor++){
    	    if(inFor%3==0 && inFor%5==0){
    	        sum+=1;
    	        System.out.println(inFor);
    	    } 
    	}
    	System.out.println(sum);
    } 
} 
