package com.myjava.app;
import java.util.Random;
/*一个动态列表测试程序*/



public class ArrayDemo3{
    public static void main(String[] args){
        int[] number=new int[10];
        Random rd=new Random();
        for(int i=0;i<number.length;i++){
            number[i]=rd.nextInt(100)+1;
        }
        //求数组里面所有数的和
        int sum=0;
        for(int i=0;i<number.length;i++){
            sum+=number[i];
        }
        System.out.println("这个数组里面所有数的和是"+sum);
        //由数组里面所有数的平均数
        int avg=sum/number.length;
        System.out.println("这个列表的平均数是"+avg);
        //求列表里面一共有多少个值是小于平均数的
        int count=0;
        for(int i=0;i<number.length;i++){
            if(number[i]<avg){
                count++;
            }
        }
        System.out.println("这个列表里面一共有"+count+"个值是小于平均数的");
        //遍历列表
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}