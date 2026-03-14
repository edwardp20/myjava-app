package com.myjava.tests;
/*一个一个非常无聊的程序，这是用来统
计列表中一共有多少个可以被三整除的程序*/


public class ArrayTest2{
    public static void main(String[] args){
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        int count=0;
        for(int i=0;i<=numbers.length-1;i++){
            if(numbers[i]%3==0){
            count++;
            }
        }
        System.out.println(count);
    }
}