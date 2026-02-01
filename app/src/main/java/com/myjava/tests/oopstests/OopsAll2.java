package com.myjava.tests.oopstests;

/**
 * OopsAll2 - 第二个练习
 *
 * <p>Copyright (C) 2026 edwardp20 <zhangxixi201268@outlook.com>
 *
 * <p>This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * <p>This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * <p>You should have received a copy of the GNU General Public License along with this program. If
 * not, see <https://www.gnu.org/licenses/>.
 */
public class OopsAll2 {
    private String name;
    private double price;
    private String number;
    private int inventory;
    
    // 空参构造器
    public OopsAll2() {
    }

    // 全参构造器
    public OopsAll2(String name, double price, String number, int inventory) {
        this.name = name;
        this.price = price;
        this.number = number;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter and setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // getter and setter for number
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    // getter and setter for inventory
    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
