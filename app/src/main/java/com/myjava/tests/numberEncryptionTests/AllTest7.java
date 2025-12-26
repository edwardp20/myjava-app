package com.myjava.tests.numberEncryptionTests;
/*这是之前数字加密的解密文件*/


public class AllTest7{
    public static void main(String[] args){
        //数字解密开始
        //定义一个新数组
        int[] arr={8,3,4,6};
        //反转数组
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            //temp
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //解密第一步，解除对10取余
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 0&&arr[i] <= 4){
                arr[i]=arr[i]+10;
            }
        }
        //解密第二步，把每一项-5
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]-5;
        }
        //解密第三步，将数组中的数字变成一个完整的数字
        //定义变量记录完整数字
        int number=0;
        for(int i=0;i<arr.length;i++){
            number=number*10+arr[i];
        }
        //打印完整的数字
        IO.println(number);
    }
}