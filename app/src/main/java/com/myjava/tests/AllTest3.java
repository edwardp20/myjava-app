package com.myjava.tests;

import java.util.Random;

public class AllTest3 {
    public static void main(String[] args) {
        char[] chs=new char[52];
        for (int chs2 = 0; chs2 < chs.length; chs2++) {
            if (chs2<26) {
                chs[chs2]=(char)(97+chs2); 
            } else {
                chs[chs2]=(char)(65+chs2-26); 
            }
        } 
        
        Random r=new Random();
        String str=""; 
        for (int i = 0; i < 5; i++) {
            int randomIndex=r.nextInt(52);
            str=str+chs[randomIndex];
        }
        str=str+r.nextInt(10);
        System.out.println(str);
    }
}
