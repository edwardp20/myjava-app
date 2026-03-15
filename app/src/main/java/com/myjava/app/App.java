package com.myjava.app;

/** Hello world! */
public class App {
    public static void main(String[] args) {
        System.out.println("你好，欢迎来到本程序");
        System.out.println("--help 输出帮助");
        if(args.length > 0) {
            if(args[0].equals("--version")) {
                System.out.println("1.15.1-snapshot2");
                System.out.println("by edwardp20");
            } else if(args[0].equals("--help")) {
                System.out.println("--help 输出该帮助");
                System.out.println("--version 输出版本");
                System.out.println("java -cp myjava-VERSION.jar com.myjava.class来运行类");
            }
        }
    }
    //这个应付test的
    public String getGreeting() {
        IO.println("mmmmmm");
        return "hello";
    }
}
