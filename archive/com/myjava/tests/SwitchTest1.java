package com.myjava.tests;
import java.util.Scanner;//导包
public class SwitchTest1{
    public static void main(String[] args){
        //1.声明开始
        Scanner sc=new Scanner(System.in);
        //2.开始录入
        int week=sc.nextInt();
        //3.Switch开始
        switch(week){
            case 1 -> {
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3 -> {
                System.out.println("三");
            }
            default -> {
                System.out.println("不是一或二或三");
            }
        }
    }
}