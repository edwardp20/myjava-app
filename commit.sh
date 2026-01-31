#!/bin/bash
git add .
# 提示用户输入commit信息
echo "请输入commit信息："
read a

# 检查用户是否输入了内容
if [ -z "$a" ]; then
    echo "错误：commit信息不能为空！"
    exit 1
fi

# 执行git commit
git commit -m "$a"

# 检查git commit是否成功
if [ $? -eq 0 ]; then
    echo "提交成功！"
else
    echo "提交失败！"
fi
git push origin main