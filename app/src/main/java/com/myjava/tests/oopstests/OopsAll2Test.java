package com.myjava.tests.oopstests;
/**
* OopsAll2Test - 测试类2
* 
* Copyright (C) 2026 edwardp20  <zhangxixi201268@outlook.com>
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
public class OopsAll2Test {
    public static void main(String[] args) {
        //定义一个数组用来存储商品
        OopsAll2[] goodList = new OopsAll2[3];//假设一共有三个商品
        //定义商品对象
        OopsAll2 g1 = new OopsAll2("猪肉",1145.14,"001",70);
        OopsAll2 g2 = new OopsAll2("羊肉",1145.14,"002",80);
        OopsAll2 g3 = new OopsAll2("鸡蛋",114.51,"003",99);
        //将商品存入数组
        goodList[0] = g1;
        goodList[1] = g2;
        goodList[2] = g3;
        //使用循环展示信息
        for(int i = 0;i < goodList.length;i++) {//因为一共有三个商品，所以循环三次
            //将每个商品存入暂时的good变量
            OopsAll2 good = goodList[i];
            //打印商品信息
            IO.println("商品的价格是" + good.getPrice() + 
            "商品的库存还有" + good.getInventory() + "商品的编号是" + good.getNumber() + 
            "商品的名称是" + good.getName());
            
        }
    }
}