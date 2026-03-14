package com.myjava.tests.numberEncryptionTests;



public class AllTest6{
    public static void main(String[] args){
        int num=123456;
        int temp=num;
        int count=0;
        while(num != 0){
            num=num/10;
            count++;
        }
        IO.println(num+" "+count);
        int[] arr=new int[count];
        int index=arr.length-1;
        while(temp!=0){
            arr[index]=temp%10;
            temp=temp/10;
            index--;
        }
        for(int i=0;i<arr.length;i++){
            IO.print(arr[i]+" ");
        }
    }
}