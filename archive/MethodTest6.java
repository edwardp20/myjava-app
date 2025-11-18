package com.myjava.tests;

public class MethodTest6{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] copyArray=copyOfRange(arr,3,7); 
        for(int i=0;i<copyArray.length;i++){
            System.out.print(copyArray[i]+" ");
        }
    } 
    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] newArray=new int[to-from];
        int index=0;
        for(int i=from;i<to;i++){
            newArray[index]=arr[i];
            index++;
        }
        return newArray;
    }  
}