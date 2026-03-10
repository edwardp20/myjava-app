package com.myjava.tests.oopstests.phone;
/**
* PhoneTest - 手机类
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
public class PhoneTest {
    public static void main(String[] args) {
        //创建对象
        Phone p1 = new Phone(1999,"华为","红");
        Phone p2 = new Phone(3999,"为","蓝");
        Phone p3 = new Phone(2999,"华","红");
        Phone arr[] = new Phone[3];
        //将对象存入数
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        //将价格求和
        int sum = 0;
        for(int i = 0;i < arr.length;i++) {
            Phone p = arr[i];
            sum = sum + p.getPrice();
        }
        //取平均值
        double avg = sum * 1.0 / arr.length;
        IO.println(avg);
    }
}