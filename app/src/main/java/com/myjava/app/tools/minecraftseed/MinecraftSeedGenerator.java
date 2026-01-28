package com.myjava.app.tools.minecraftseed;

import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * MinecraftSeedGenerator - 一个随机我的世界种子生成器
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
public class MinecraftSeedGenerator {
    public static void main(String[] args) {
        // 获取当前日期时间
        LocalDateTime now = LocalDateTime.now();
        
        // 格式化为字符串
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);
        
        long seed = SeedGenerator();
        //初始化随机数器
        IO.println("[" + timestamp + " - INFO]Random init - Success");
        Random r = new Random();
        //判断种子是否为零
        IO.println("[" + timestamp + " - INFO]Check if the seed is 0");
        if(seed == 0) {//如果为零就不做任何改动
            IO.println("[" + timestamp + " - INFO]Finished Check - Finished");
            IO.println("This is your seed:" + seed);
        } else {//如果不是零就对其进行随机正负
            boolean temp = r.nextBoolean();
            if(!temp) {//如果随机到零，则种子为正
                IO.println("[" + timestamp + " - INFO]Check Finished - Finished");
                IO.println("This is your seed:" + seed);
            } else {//如果随机到1则种子为负
                String seedTemp = "-" + seed;
                IO.println("[" + timestamp + " - INFO]Check Finished - Finished");
                IO.println("This is your seed:" + seedTemp);
            }
        }
        IO.println("[" + timestamp + " - INFO]Stop - Success");
    }
    
    public static long SeedGenerator() {//种子生成器方法
        // 获取当前日期时间
        LocalDateTime now = LocalDateTime.now();
        
        // 格式化为字符串
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);
        //初始化
        IO.println("[" + timestamp + " - INFO]Seed Generator init - Success");
        Random r = new Random();
        //随机生成正种子
        long seed = r.nextLong(1000000001);
        return seed;//返回种子
    }
}