package com.myjava.tests;


public class MethodTest2{
    public static void main(String[] args){
        int result1=getSum(114,338,999);
        System.out.println(result1);
    }
    public static int getSum(int number1,int number2,int number3){
        int result=number1+number2+number3;
        return result;
    }
}