package com.myjava.tests.oopstests.test7;
/**
* GirlfriendTest - 
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
public class GirlfriendTest {
    public static void main(String[] args) {
        Girlfriend gf1 = new Girlfriend("恐怖人1",114);
        Girlfriend gf2 = new Girlfriend("恐怖人p",209);
        Girlfriend gf3 = new Girlfriend("恐怖人a",929);
        //2.将对象存入数组
        Girlfriend arr[] = new Girlfriend[3];
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        //3.求平均值
        int sum = 0;
        for(int i = 0;i < arr.length;i++) {
            Girlfriend gf = arr[i];
            sum = sum + gf.getAge();
        }
        //4.
        int avg = sum / arr.length;
        //5.看看有多少人是小于平均值的
        int count = 0;
        for(int i = 0;i < arr.length;i++) {
            Girlfriend gf = arr[i];
            if(gf.getAge() < avg) {
                count++;
                IO.println(gf.getName());
            }
        }
        IO.println(count);
    }
}