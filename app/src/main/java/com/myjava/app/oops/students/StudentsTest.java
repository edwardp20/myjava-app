package com.myjava.app.oops.students;
/**
 * StudentsTest - 学生的测试类
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
public class StudentsTest {
    public static void main(String[] args) {
        //学生姓名年龄，并且打印
        Students s1 = new Students(5,"落日一号");
        IO.println(s1.getAge());
        //测试无参
        Students s2 = new Students();
        s2.setAge(14);
        int s2Age = s2.getAge();
        IO.println(s2Age);
        s1.easterEgg();
    }
}