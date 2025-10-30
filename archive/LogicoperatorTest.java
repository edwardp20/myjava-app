package com.myjava.app;
import java.util.Scanner;


public class LogicoperatorTest{
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        System.out.println("请输入第一个");
        //数一
        int number1=sn.nextInt();
        System.out.println("请输入第二个");
        //数二
        int number2=sn.nextInt();
        boolean result = number1==6||number2==6||(number1+number2)%6==0;
        System.out.println(result);
        
        
        
        
    }
}
