package com.myjava.app.oops.students;
/**
 * Students - 管理系统的javabean
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
public class Students {
    //首先定义成员变量,名字和年龄
    private int age;
    private String name;
    //编写无参构造方法
    public Students() {
        //提示用户初始化成功
        IO.println("init successfully");
    }
    
    //编写全参构造方法
    public Students(int age,String name) {
        //将用户在参数中输入的值赋值给成员变量
        this.name = name;
        setAge(age);
        //提示用户初始化成功
        IO.println("init successfully");
    }
    
    //接下来编写setAge()
    public void setAge(int age) {
        if(age <= 25 && age >= 6) {//检查年龄是否达标
            this.age = age;
        } else {
            IO.println("录入的数据不合法");
        }
        
    }
    
    //接下来编写getAge()
    public int getAge() {
        return this.age;
    }
    
    //同理编写setName()
    public void setName(String name) {
        //录入名字
        this.name = name;
    }
    
    //编写getName()
    public String getName() {
        return this.name;
    }
    
    //这是什么东西?!!!!!!
    public void easterEgg() {
        IO.println("没有彩蛋");
    }
}