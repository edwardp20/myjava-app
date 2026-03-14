package com.myjava.tests;

import java.util.Scanner;

public class AllTest4 {
    public static void main(String[] args) {
        //1.首先，我们需要干嘛呢？获取列表
        int[] score=getScores();
        //2.那么第二步，我们要干什么呢？那肯定是比大小了
        int max = getMax(score);
        int min = getMin(score);
        

    }
    public static int[] getScores(){
        int[] score=new int[6];
        Scanner sc=new Scanner(System.in); 
        for (int i = 0; i < score.length;) {
            System.out.println("评委的打分");
            int temp=sc.nextInt();
            if (temp>=0&&temp<=100) {
                score[i]=temp;
                i++; 
            } else {
                System.out.println(114514);
            }
        }
        return score;
    } 
    public static int getMax(int[] score){
        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i]>max) {
                max=score[i]; 
            }    
        }
        return max;  
    }  
    public static int getMin(int[] score){
        int min=score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i]<min) {
                min=score[i];
            }
        }
        return min;
    }
    
    
}
