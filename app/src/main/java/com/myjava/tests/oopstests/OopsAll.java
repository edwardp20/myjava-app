package com.myjava.tests.oopstests;

import java.util.Random;
/**
 * OopsAll - 第一个全面测试
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
public class OopsAll {
    //定义角色的名字
    private String name;
    //定义角色的血量
    private int blood;
    //无参构造器
    public OopsAll() {
        IO.println("[INFO]Game init - Success");
    }
    
    //全参构造器
    public OopsAll(String name,int blood) {
        //赋值
        this.name = name;
        this.blood = blood;
        IO.println("[INFO]Game init - Success");
    }
    
    //getter and setter
    public void setName(String name) {
        this.name = name;
        IO.println("[INFO]Name set - Success");

    }
    
    public String getName() {
        IO.println("[INFO]Get name - Success");
        return this.name;
    }
    
    public void setBlood(int blood) {
        this.blood = blood;
        IO.println("[INFO]Blood set - Success");
    }
    
    public int getBlood() {
        IO.println("[INFO]Get blood - Success");
        return this.blood;
    }
    //人物攻击
    public void attack(OopsAll o) {
        Random r = new Random();
        //随一个打别人所扣除的血量
        int hurt = r.nextInt(20) + 1;
        int remainBlood = o.getBlood() - hurt;//扣除被打的人的血量
        //检查扣除后的血量是否小于零，如果true，将其归零
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //把被打的人的血量更改
        o.setBlood(remainBlood);
        //告诉玩家谁谁谁被打了
        IO.println(this.name + "被" + o.name + "打了,扣除了他" + hurt + "滴血,他还有" + o.getBlood() + "滴血");
    }
}