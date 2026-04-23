package com.myjava.tests.stringtest;
/**
* Test2 - 
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
public class Test2 {
    public static void main(String[] args) {
        //先定义两个字符串
        String s1 = "abctp";//bctpa ctpab
        String s2 = "ctpab";
        boolean flag = true;
        //循环判断两个字符串是否相等
        for(int i = 0;i < s1.length();i++) {
            if(s1.equals(s2)) {
                System.out.println("true");
                break;
            } else {
                s1 = rotate(s1);
                flag = false;
            }
        }
        if(!flag) {
            System.out.println("false");
        }
    }
    
    //用来旋转字符串的方法
    public static String rotate(String str) {
        //先获取字符串的第一位
        char c = str.charAt(0);
        //截取字符串的后几位
        String s = str.substring(1);//后4位
        //再进行拼接
        return s + c;
    }
}