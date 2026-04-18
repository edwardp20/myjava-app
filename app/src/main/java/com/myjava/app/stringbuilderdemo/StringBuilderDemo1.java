package com.myjava.app.stringbuilderdemo;
/**
* StringBuilder1 - 
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
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //1.先创建一个新的sb对象
        StringBuilder sb = new StringBuilder("大傻春");
        //2.向该字符串追加
        sb.append(111);
        sb.append(3.3);
        sb.append(true);
        sb.append("nnnnnajajajajajjjajajqjajajjj");
        IO.println(sb);
        //3.反转整个字符串
        sb.reverse();
        IO.println(sb);
        //4.获取字符串的长度
        IO.println(sb.length());
        //5.把这个字符串转成string类型
        String str = sb.toString();
        IO.println("转成String了\n" + str);
    }
}