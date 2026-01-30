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
    //角色的性别
    private char gender;
    //角色的面容
    private String face;
    //角色的面容列表
    private String[] boyFace = {
        "风流倜傥","眉清目秀","玉树临风","一塌糊涂","美味人类","稀奇古怪","Sss级","光翼展开",
        "憨态可掬","英俊潇洒","我也不知道","啊呀呀","哈基米","阿西吧"
    };
    private String[] girlFace = {
        "冰肌玉骨", "肤如凝脂", "面若桃花", "眉目如画",
        "明眸皓齿", "巧笑嫣然", "仙姿玉貌", "清丽脱俗",
        "英姿飒爽", "巾帼须眉", "剑气如虹", "玉面罗刹"
    };
    //无参构造器
    public OopsAll() {
        IO.println("[INFO]Game init - Success");
    }
    
    //全参构造器
    public OopsAll(String name,int blood,char gender) {
        //赋值
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace();
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
    
    public void setGender(char gender) {
        this.gender = gender;
        IO.println("[INFO]Set gender - Success");
    }
    
    public char getGender() {
        IO.println("[INFO]Get gender - Success");
        return this.gender;
    }
    
    public void setFace() {
        char gender = this.gender;
        Random r = new Random();
        //判断角色是男是女选择面容
        if(gender == '男') {//选择男人的面容
            int index = r.nextInt(boyFace.length);
            this.face = boyFace[index];
        } else if(gender == '女') {//选择花木兰的面容(doge)
            int index = r.nextInt(girlFace.length);
            this.face = girlFace[index];
        } else {
            this.face = "人";
        }
    }
    
    public String getFace() {//返回面容
        IO.println("[INFO]Get Face - Success");
        return this.face;
    }
    
    //这个方法用来显示人物的信息
    public void showInformation() {
        IO.println("角色叫" + this.name + "血量" + this.blood + 
        "性别" + this.gender + "面容" + this.face);
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
        IO.println(o.name + "被" + this.name + "打了,扣除了他" + hurt + "滴血,他还有" + o.getBlood() + "滴血");
    }
}