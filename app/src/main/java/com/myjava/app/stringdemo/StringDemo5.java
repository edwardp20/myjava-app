package com.myjava.app.stringdemo;

import java.util.Scanner;
/**
* StringDemo5 - 
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
public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        IO.println("String:" + reserval(str));
    }
    
    public static String reserval(String s) {
        String result = "";
        for(int i = s.length() - 1;i >= 0;i--) {
            char c = s.charAt(i);
            result = result + c;
        }
        return result;
    }
}