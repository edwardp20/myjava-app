package com.myjava.app.arraylistdemo;

import java.util.ArrayList;
/**
* ArrayListDemo1 - 
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
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //先创建一个array list
        ArrayList<String> list = new ArrayList<>();
        //往里面添加东西
        list.add("1145141919810");
        list.add("515151616166161");
        list.add("trtrtrtrtrtrtgd");
        IO.println(list.get(0));//删改不演示了
        //打印一下它
        IO.println(list);
    }
}