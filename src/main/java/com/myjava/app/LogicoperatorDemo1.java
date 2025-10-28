package com.myjava.app;


public class LogicoperatorDemo1{
    public static void main(String[] args){
        boolean a=true;
        boolean b=true;
        boolean c=false;
        boolean d=false;
        System.out.println(a&b);//true
        System.out.println(a&d);//false
        System.out.println(a|c);//true
        System.out.println(c|d);//false
        System.out.println(a^c);//true
        System.out.println(!a^b);//true
        
        
    }
}
