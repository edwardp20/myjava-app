package com.myjava.tests.oopstests;
/**
 * OopsAllTest - 刚才那个javabean的测试
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
public class OopsAllTest {
    public static void main(String[] args) {
        //定义两个角色
        OopsAll r1 = new OopsAll("戚雨杨",100);
        OopsAll r2 = new OopsAll("张辰曦",110);
        //开始战斗!!!!
        while(true) {
            r1.attack(r2);
            //检查被攻击的那个人是否死了
            if(r2.getBlood() == 0) {
                IO.println(r1.getName() + "被" + r2.getName() + "K.O.了！");
                //跳出循环
                break;
            }
            
            //如果没死，爬起来接着打
            r2.attack(r1);
            //检查被攻击的那个人是否死了
            if(r1.getBlood() == 0) {
                IO.println(r2.getName() + "被" + r1.getName() + "K.O.了!");
                //出循环
                break;
            }
        }
    }
}