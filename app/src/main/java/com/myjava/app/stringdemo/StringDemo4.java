package com.myjava.app.stringdemo;
/**
* StringDemo4 - 
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

public class StringDemo4 {
    public static void main(String[] args) {
        //1.创建数组
        int[] arr = {1,2,3,4};
        String s = toStringArray(arr);
        System.out.println(s);
    }
    
    /*1.我要去做什么？
      2.做这个需要啥？
      3.有返回不？
      */
    public static String toStringArray(int[] arr) {
        String result = "[";
        if(arr == null) {
            return "";
        }
        
        if(arr.length == 0) {
            return "[]";
        }
        
        for(int i = 0;i < arr.length;i++) {
            if(i == arr.length - 1) {
                result = result + arr[i];
            } else {
                result = result + arr[i] + ", ";
            }
        }
        result += "]";
        return result;
    }
}