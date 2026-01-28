package com.myjava.tests.grabRedEnvelope;
import java.util.Random;
/*一个抢红包优化*/


public class AllTest9{
    public static void main(String[] args){
        int[] arr = {2,1000,2000,34748,73373};
        //打乱
        Random r=new Random();
        for(int i=0;i<arr.length;i++){
            int randomIndex=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        //奖池
        int randomIndex2=r.nextInt(arr.length);
        IO.print("恭喜你中大奖，奖金是"+arr[randomIndex2]);
        //循环遍历奖池
        for(int i=0;i<arr.length;i++){
            IO.print(arr[i]+" ");
        }
    }
}