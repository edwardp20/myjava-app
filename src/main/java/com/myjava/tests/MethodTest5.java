package com.myjava.tests;
import java.util.Scanner;
import java.util.Random;

public class MethodTest5{
    public static void main(String[] args){
        int[] arr=new int[10];
        Random rd=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=rd.nextInt(100)+1;
        }
        Scanner sc=new Scanner(System.in);
        int youWantToSearch=sc.nextInt();
        boolean result=searchForNumber(arr,youWantToSearch);
        IO.println(result);
        traverseList(arr);
    }
    public static boolean searchForNumber(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
    public static void traverseList(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            IO.print(arr[i]+" ");
        }
    }
}