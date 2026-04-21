package com.myjava.app.tools.calculator;

import java.util.Scanner;
/**
* Coco2 - 
* 
* Copyright (C) 2026 edwardp20 <zhangxixi201268@outlook.com>
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/
public class Coco2 {
    public static void main(String[] args) {
        //初始化扫描器
        Scanner s = new Scanner(System.in);
        //让用户输入模式
        System.out.println("+-*/:");
        StringBuilder mode = new StringBuilder(s.next());
        //用户输入操作数字
        System.out.println("请输入 2 个数字\n第一个:");
        double num1 = s.nextDouble();
        System.out.println("第二个:");
        double num2 = s.nextDouble();
        double result = 0;
        //判断模式
        if(mode.toString().equals("+")) {
            result = add(num1,num2);
        } else if(mode.toString().equals("-")) {
            result = cut(num1,num2);
        } else if(mode.toString().equals("*")) {
            result = addadd(num1,num2);
        } else {
            result = cutcut(num1,num2);
        }
        //打印
        IO.println(result);
    }
    
    //+
    public static double add(double a,double b) {
        return a+b;
    }
    
    //-
    public static double cut(double a,double b) {
        return a-b;
    }
    
    //*
    
    public static double addadd(double a,double b) {
        return a*b;
    }
    
    public static double cutcut(double a,double b) {
        return a/b;
    }
}