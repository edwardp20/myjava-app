package com.myjava.tests;


public class AllTest5{
    public static void main(String[] args){
        //定义数组
        int[] passwd={1,9,3,8};
        //循环加五
        for(int i=0;i<passwd.length;i++){
            passwd[i]=passwd[i]+5;
        }
        //对10取余
        for(int i=0;i<passwd.length;i++){
            passwd[i]=passwd[i]%10;
        }
        //反转数字
        for(int i=0,j=passwd.length-1;i<j;i++,j--){
            int temp=passwd[i];
            passwd[i]=passwd[j];
            passwd[j]=temp;
        }
        int number=0;
        for(int i=0;i<passwd.length;i++){
            number=number*10+passwd[i];
        }
        IO.println(number);
    }
}