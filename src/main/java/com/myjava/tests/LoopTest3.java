package com.myjava.tests;
import java.util.Random;
import java.util.Scanner;
/**
 * 猜数字游戏
 * 程序随机生成1-100的数字，用户通过输入猜测数字
 * 程序会根据用户的猜测给出"大了"、"小了"的提示，直到猜中为止
 */


public class LoopTest3{
    public static void main(String[] args){
        // 创建随机数生成器，用于生成1-100的随机数字
        Random rd=new Random();
        int number=rd.nextInt(100)+1;// nextInt(100)生成0-99，+1后得到1-100的随机数
        Scanner sc=new Scanner(System.in);// 创建扫描器对象，用于读取用户输入
        // 无限循环，直到用户猜对数字才会退出
        while(true){
            int guessNumber=sc.nextInt();
            if(guessNumber>number){
                System.out.println("大了");
            } else if(guessNumber<number){
                System.out.println("小了");
            } else{
                System.out.println("你猜对了");
                break;
            }
            
        }
    }
}