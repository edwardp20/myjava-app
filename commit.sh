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


# 带提示的输入，默认值为main
read -p "请输入要推送的分支名（默认：main）：" branch_name

# 如果输入为空或只有空格，使用默认值
branch_name=${branch_name:-main}

echo "正在推送到分支：$branch_name"
git push origin "$branch_name"