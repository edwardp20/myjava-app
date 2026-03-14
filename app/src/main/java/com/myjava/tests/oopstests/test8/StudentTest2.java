package com.myjava.tests.oopstests.test8;
/**
* StudentTest2 - 
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
public class StudentTest2 {
    public static void main(String[] args) {
        //1.创建一个存储学生的arr
        Student[] arr = new Student[3];
        //2.众所周知，学生管理系统是需要学生的
        Student stu1 = new Student("zhangsan",1,23);
        Student stu2 = new Student("lisi",2,24);
        Student stu3 = new Student("wangwu",3,22);
        //3.把祖国的花朵放到数组里
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
    }
}