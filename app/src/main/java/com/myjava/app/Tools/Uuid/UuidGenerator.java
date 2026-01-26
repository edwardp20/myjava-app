package com.myjava.app.Tools.Uuid;

import java.util.Scanner;

/**
 * UuidGenerator - A simple tool for generating uuid
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
public class UuidGenerator {
    public static void main(String[] args) {
        UuidGeneratorLib u = new UuidGeneratorLib();
        Scanner s = new Scanner(System.in);
        IO.println("请输入您想生成的个数:");
        int number = s.nextInt();
        for (int i = 1; i <= number; i++) {
            String result = u.uuidGenerator();
            IO.println("生成的uuid为:" + result);
        }
    }
}