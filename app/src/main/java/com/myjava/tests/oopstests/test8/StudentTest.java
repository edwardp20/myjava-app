package com.myjava.tests.oopstests.test8;
/**
* StudentTest -
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
public class StudentTest {
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
        //TODO:再添加一个学生对象
        //!!!!等等还得做id唯一性判断
        /*这是分两种情况的
        1 --- ID已存在
        2 --- ID不存在
        */
        //(1)首先得有个学生对象
        Student stu4 = new Student("zhaoliu",4,19);
        //TODO:在这里做判断
        boolean flag = contains(arr,stu4.getId());
        if(flag) {
            IO.println("id重复");
        } else {
            //(2)你得把人家放到数组里
            /*这是分两种情况的
            1 --- 数组存满了创建个新数组，数组长度等于老数组加一
            2 --- 数组没满
            */
            int count = getCount(arr);
            if(count == arr.length) {
                //满了
                Student[] newArr = createNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);
            } else {
                //没有
                arr[count] = stu4;
                printArr(arr);
            }
            
        }
    }
    
    //TODO:写一个用来遍历整个数组的非空元素的方法
    public static void printArr(Student[] arr) {
        for(int i = 0;i < arr.length;i++) {
            Student stu = arr[i];
            if(stu != null) {
                IO.println(stu.getName() + "," + stu.getAge() + "," + stu.getId());
            }
        }
    }
    
    //TODO:写一个用来创建一个新数组数组长度是老数组加一的方法
    /*1.我要干啥？创建一个新数组数组长度是老数组加一
    2.干这个我需要啥？old arr
    3.要不要返回值？new arr
    */
    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        //循环遍历老数组的每一个元素
        for(int i = 0;i < arr.length;i++) {
            //将老数组的每一个元素拷贝到新数组中
            newArr[i] = arr[i];
        }
        return newArr;
    }
    
    //TODO:写一个用来查看列表里有多少个非空数值的
    public static int getCount(Student[] arr) {
        int count = 0;
        for(int i = 0;i < arr.length;i++) {
            Student stu = arr[i];
            if(stu != null) {
                count++;
            }
        }
        return count;
    }
    
    //TODO:写一个用来判断id是否相同的方法
    /*1.我要干啥? 判断ID是否相同
    2.干这个我要用啥?那肯定是，一个装满学生的数组和新学生的ID
    3.这玩意有返回值吗 那不废话嘛，肯定是boolean啊
    */
    public static boolean contains(Student[] arr,int id) {
        //循环遍历数组，看ID是否相同
        for(int i = 0;i < arr.length;i++) {
            //TODO:比较ID
            Student stu = arr[i];
            //!!!!!! !=null!!!!!!!!!!!! nullPointExpectation!
            if(stu != null) {
                //该学生的ID
                int sid = stu.getId();
                //比较
                if(sid == id) {
                    return true;//如果相同直接返回true
                }
            }
        }
        return false;
    }
}