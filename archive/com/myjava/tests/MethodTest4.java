package com.myjava.tests;


public class MethodTest4{
    public static void main(String[] args){
        int[] arr={212,889,585,56};
        int max=getMax(arr);
        IO.print(max);    
    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }    
}