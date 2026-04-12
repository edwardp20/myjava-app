package com.myjava.app.stringdemo;
/**
* StringDemo8 - 
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
public class StringDemo8 {
    public static void main(String[] args) {
        //1.首先你需要一个中华人民共和国公民的身份证号码,当然是虚构的
        String id = "340203102702020036";//世界上不可能有1027年出生的人还有身份证号码
        //真的不会有，真的不会有，真的不会有，真的不会有，真的不会有，真的不会有，真的不会有
        //2.接下来需要提取年月日
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        IO.println("人物的身份信息是:");
        IO.println("出生日期:" + year + "年" + month + "月" + day + "日");
        //3.接下来需要提取性别
        char gender = id.charAt(16);
        int num = gender - 48;
        if(num % 2 == 0) {
            IO.println("性别:女");
        } else {
            IO.println("性别:男");
        }
    }
}