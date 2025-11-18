package com.myjava.tests;


public class MethodTest3{
    public static void main(String[] args){
        int[] arr={11,22,33,44,55,66};
        Array(arr);
    }
    public static void Array(int[] sb){
        System.out.print("[");
        for(int i=0;i<sb.length;i++){
            if(i==sb.length-1){
                System.out.print(sb[i]);
            } else{
                System.out.print(sb[i]+",");
            }
        }
        System.out.print("]");
    }
}