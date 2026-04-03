package com.myjava.app.stringdemo;

import java.util.Scanner;
/**
* StringDemo6 - 
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
public class StringDemo6 {
    public static void main(String[] args) {
        //1.首先你得有个数字
        Scanner sc = new Scanner(System.in);
        IO.println("输入");
        int number = sc.nextInt();
        //2.判断数字是否正确
        if(number >= 0 && number <= 9999999) {
        
        } else {
            System.exit(1);
        }
        //3.转换数字到纯大写
        //4.取数字每一位
        String result = "";
        while(true) {
            //首先是搞到每一位
            int ge = number % 10;
            //然后接下来呢，获取该位的大
            String capitalNumberGe = capitalNumber(ge);
            //将字符串拼接
            result = capitalNumberGe + result;
            //删除number的位
            number = number / 10;
            if(number == 0) {
                break;
            }
        }
        //5.将结果补零
        int count = 7 - result.length();
        for(int i = 0;i < count;i++) {
            result = "零" + result;
        }
        //6.定义一个数位列表
        String resultLast = "";
        String[] units = {"佰","拾","万","仟","佰","拾","元"};
        //7.单位
        for(int i = 0;i < result.length();i++) {
            char c = result.charAt(i);
            resultLast = resultLast + c + units[i];
        }
        IO.println(resultLast);
    }
    
    public static String capitalNumber(int num) {
        //1.定义一个数组，里面装着大
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        //2.判断传进来的数字然后再大写
        return arr[num];
    }
}