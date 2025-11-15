package com.myjava.tests;
/*这个程序是用来如果列表中的一个数字
，是奇数就将它乘以二，如果是偶数，就将它除以二*/


public class ArrayTest3{
    public static void main(String[] args){
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                numbers[i]=numbers[i]/2;
            } else{
                numbers[i]=numbers[i]*2;
            }
        }
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}