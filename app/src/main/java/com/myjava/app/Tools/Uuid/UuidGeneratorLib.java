package com.myjava.app.Tools.Uuid;

import java.util.Random;

/**
 * UuidGeneratorLib - The dependency library of uuid generation tool
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
public class UuidGeneratorLib {
    public String uuidGenerator() {
        String[] arr = {
                "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"
        };
        String result = "";
        Random r = new Random();
        for (int i = 1; i <= 36; i++) {
            int randomIndex = r.nextInt(35);
            result = result + arr[randomIndex];
        }
        return result;
    }
}