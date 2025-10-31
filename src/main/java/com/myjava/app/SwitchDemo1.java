package com.myjava.app;

public class SwitchDemo1{
    public static void main(String[] args){
        String noodles="美味人类面";
        switch(noodles){
            case "美味人类面":
                System.out.println("黑里巴布very good");
                break;
            case "恐怖人类面":
                System.out.println("Very good");
                break;
            case "B八人类名面":
                System.out.println("Very good");
                break;
            default:
                System.out.println("方便面");
                break;
                
        }
        
    }
}
