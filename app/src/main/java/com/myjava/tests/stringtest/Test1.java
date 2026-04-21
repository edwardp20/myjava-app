package com.myjava.tests.stringtest;

import java.util.Scanner;
/**
* Test1 -
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
public class Test1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  // 循环外创建一次
        String str;

        while (true) {
            str = s.next();
            if (!verifyStr(str)) {
                System.out.println("重新");
                continue;
            }
            break;  // 输入合法，跳出循环
        }

        // 转换罗马数字
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int tmpNum = c - '0';  // 更直观
            sb1.append(changeRome(tmpNum));
        }
        System.out.println(sb1);
    }

    public static String changeRome(int number) {
        String[] romanNumerals = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        // 注意：数组索引 0 对应空字符串，因为罗马数字没有 0
        return romanNumerals[number];
    }

    public static boolean verifyStr(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {  // 修正：i < length
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}