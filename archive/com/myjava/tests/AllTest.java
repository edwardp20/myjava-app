package com.myjava.tests;

import java.util.Random;
import java.util.Scanner;

public class AllTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入当前票价");
        int ticketYuan=scanner.nextInt();
        System.out.println("请输入当前月份");
        int nowMonth=scanner.nextInt();
        Random rd=new Random();
        double random=rd.nextDouble(10);
        if (nowMonth>12) {
            System.out.println("没有这个月份");
        } else {
            if (nowMonth>6) {
                System.out.println("票价是"+ticketYuan*random);
            } else {
                System.out.println("票价是"+ticketYuan*random);
            }
        } 
        scanner.close();
    }
}
