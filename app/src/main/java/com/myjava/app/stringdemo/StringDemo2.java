package com.myjava.app.stringdemo;

import java.util.Scanner;
/**
* StringDemo2 - 
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
public class StringDemo2 {
    public static void main(String[] args) {
        //1.正确的username , password
        String rightPassword = "123456";
        String rightUsername = "kbr";
        //2.用户输入名字和密码
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 3;i++) {
            System.out.println("请输入用户名:");
            String username = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();
            //判断用户名和密码是否true
            if(username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("密码正确，登录成功！");
                break;
            } else {
                //如果超过三次失败，直接就
                if(i == 2) {
                    System.out.println("连续3次登录失败，龟");
                } else {
                    System.out.println("登录失败，还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}