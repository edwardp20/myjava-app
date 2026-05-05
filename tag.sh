#!/bin/bash

# 第一步：读取用户输入，赋值给变量 a
read -p "请输入标签名: " a
# 创建标签
git tag -a "$a" -m "$a"

# 推送标签
git push --tags

# 执行 gradle 命令
gradle clean shadowJar