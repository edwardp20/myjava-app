package com.myjava.tests.doubleColorBallLotterySystem;
import java.util.Random;
import java.util.Scanner;



public class AllTest10{
    public static void main(String[] args){
        int[] arr=getPrizeArr();
        IO.println("=========中奖号码============");
        for(int i=0;i<arr.length;i++){
            IO.print(arr[i]+" ");
        }
        IO.println("/n============================");
        int[] userarr=getUserNumbers();
        //开始计算有多少红球或蓝球号码中奖
        
        //定义红球中奖计数器
        int redCounter=0;
        //定义篮球中奖计数器
        int blueCounter=0;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(userarr[i]==arr[j]){
                    redCounter++;
                    break;
                }
            }
        }
        if(userarr[userarr.length-1]==arr[arr.length-1]){
            blueCounter++;
        }
        IO.println(redCounter+" "+blueCounter);
        //QwQ
        IO.println("我不想写中奖部分的代码，你自己脑补吧");
    }
    //首先，我们需要获取中奖号码列表
    public static int[] getPrizeArr(){
        Random r=new Random();
        int[] arr=new int[7];
        //获取红球号码
        for(int i=0;i<arr.length-1;){
            int redNumber=r.nextInt(32)+1;
            boolean flag=comparePrize(arr,redNumber);
            if(!flag){
                arr[i]=redNumber;
                i++;
            }
        }
        //篮球号码
        int blueNumber=r.nextInt(16)+1;
        arr[arr.length-1]=blueNumber;
        return arr;
    }
    //接下来，我们需要让用户输入蓝球和红球号码
    public static int[] getUserNumbers(){
        Scanner s=new Scanner(System.in);
        int[] userarr=new int[7];
        //开始搞最麻烦的红球
        for(int i=0;i<userarr.length-1;){
            IO.println("请你输入第"+(i+1)+"个号码");
            int redNumber=s.nextInt();
            if(redNumber>=1&&redNumber<=32){
                boolean flag=comparePrize(userarr,redNumber);
                if(!flag){
                    userarr[i]=redNumber;
                    i++;
                } else{
                    IO.println("您输入的号码重复了");
                }
            } else{
                IO.println("您输入的号码不在范围内");
            }
        }
        //接下来是篮球
        while(true){
            IO.println("请输入篮球号码");
            int blueNumber=s.nextInt();
            if(blueNumber>=0&&blueNumber<=16){
                userarr[userarr.length-1]=blueNumber;
                break;
            }
        }
        return userarr;
    }
    //这个是用来比较号码是否在列表中的很简单的一个方法
    public static boolean comparePrize(int[] arr,int prize){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==prize){
                return true;
            }
        }
        return false;
    }
}