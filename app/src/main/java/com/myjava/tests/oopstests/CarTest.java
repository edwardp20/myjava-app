package com.myjava.tests.oopstests;

import java.util.Scanner;
/**
* CarTest - 车的测试类
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
public class CarTest {
    public static void main(String[] args) {
        //定义scanner
        Scanner s = new Scanner(System.in);
        //定义数组用来存储车
        Car[] arr = new Car[3];
        for(int i = 0;i < arr.length;i++) {
            Car c = new Car();
            String brand = s.next();
            c.setBrand(brand);
            String color = s.next();
            c.setColor(color);
            double price = s.nextDouble();
            c.setPrice(price);
            IO.println(c.getBrand() + "," + c.getColor() + "," + c.getPrice());
            arr[i] = c;
        }
    }
}