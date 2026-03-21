package com.myjava.app.stringdemo;

import java.util.Scanner;
/**
* StringDemo3 - 
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
public class StringDemo3 {
    public static void main(String[] args) {
        //1.初始化Scanner
        Scanner sc = new Scanner(System.in);
        //2.提示用户输入
        System.out.println("请输入");
        String str = sc.next();
        //查找字符
        int countBig = 0;
        int countSmall = 0;
        int countNum = 0;
        //循环查找
        for(int i = 0;i < str.length();i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z') {
                countSmall++;
            } else if(c >= 'A' && c <= 'z') {
                countBig++;
            } else if(c >= '0' && c <= '9') {
                countNum++;
            }
        }
        
        //打印result
        System.out.println("大写字母个数" + countBig);
        System.out.println("小写字母个数" + countSmall);
        System.out.println("数字个数" + countNum);
        
        System.exit(0);
    }
}