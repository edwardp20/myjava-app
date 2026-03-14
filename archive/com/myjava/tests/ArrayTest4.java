package com.myjava.tests;
import java.util.Random;
/*程序可以用来打乱
列表*/


public class ArrayTest4{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        Random rd=new Random();
        for(int i=0;i<arr.length;i++){
            int randomIndex=rd.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}