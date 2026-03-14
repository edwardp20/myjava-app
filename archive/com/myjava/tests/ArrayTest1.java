package com.myjava.tests;
/*一个程序用来让列表累加
非常无聊，创建一个列表，里面12345用for循环，然后把它们里面的数字累加打印出来*/


public class ArrayTest1{
    public static void main(String[] args){
        int[] numbers={1,2,3,4,5,6,7,8,9};
        int sum=0;
        for(int i=0;i<numbers.length-1;i++){
        sum+=numbers[i];
        }
        System.out.println(sum);
    }
}