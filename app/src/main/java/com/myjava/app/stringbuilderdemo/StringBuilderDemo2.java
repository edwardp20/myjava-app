package com.myjava.app.stringbuilderdemo;

import java.util.Scanner;
/**
* StringBuilderDemo2 - 
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
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //1.先让用户输入一个字符串
        Scanner s = new Scanner(System.in);
        String str = s.next();
        //2.接下来再进行链式编程
        boolean flag = new StringBuilder().append(str).reverse().toString().equals(str);
        if(flag) {
            IO.println("是一个回文字符串");
        } else {
            IO.println("不是一个回文字符串");
        }
    }
}