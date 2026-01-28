package com.myjava.tests.grabRedEnvelope;
import java.util.Random;
/*一个抢红包*/



public class AllTest8{
    public static void main(String[] args){
        //定义数组用来存储奖池
        int[] arr={2,888,12345,20000,2345};
        //定义新数组用来存储已经抽过的奖
        int[] newArr=new int[arr.length];
        Random r=new Random();
        for(int i=0;i<5;){
            //随机索引
            int randomIndex=r.nextInt(5);
            //获取奖项
            int prize=arr[randomIndex];
            //比较奖项
            boolean flag=comparePrize(newArr,prize);
            //判断
            if(!flag){//如果奖项第一次抽到
                //存入newArr
                newArr[i]=prize;
                IO.println("恭喜你中大奖,奖金是"+prize);
                i++;
            }
        }
        for(int i=0;i<newArr.length;i++){
            IO.print(newArr[i]+" ");
        }
    }
    //这个方法用来判断这次抽到的奖是否和以前抽到的奖重合
    public static boolean comparePrize(int[] arr,int prize){
        for(int i=0;i<arr.length;i++){
            if(prize==arr[i]){
                return true;
            }
        }
        return false;
    }
}
//awawawawqwqQwQ