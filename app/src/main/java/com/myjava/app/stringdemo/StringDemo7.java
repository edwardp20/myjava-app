package com.myjava.app.stringdemo;
/**
* StringDemo7 - 
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
public class StringDemo7 {
    public static void main(String[] args) {
        //1.一个电话号码
        String phone = new String("13111451919");
        //获取前3位
        String start = phone.substring(0,3);
        //获取后4位
        String end = phone.substring(7);
        //做个拼接并打印
        System.out.println(start + "****" + end);
    }
}