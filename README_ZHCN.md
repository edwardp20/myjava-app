# myjava-app
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)



## 项目概述
这是一个我在学习 Java 编程过程中创建的小项目。

> **注意**：这主要是一个个人学习仓库。此处的代码可能比较简单或具有实验性。欢迎借鉴任何对您学习有用的部分。

> **重要提示**：本项目使用 GPLv3 许可证分发源代码，请确保软件始终自由

> [!NOTE]
>
> 最新版本是:
>
> **5**

## 环境要求
- Java 25
- Maven 3.9.11

## 使用方法
```bash
# 编译
mvn compile

# 运行主类
mvn exec:java -Dexec.mainClass="com.myjava.app.App"

# 打包
mvn package

# 测试
mvn test
```

## 功能特性

- 基础 Java 语法
- 面向对象编程示例
- Maven 配置
- JUnit 测试

## 主类与包名

### 主类说明

请注意，本项目的主类是 App.class。通常情况下，请不要将其移出 src 文件夹。

### 包名

本项目的包名为 com.myjava.app

```java
package com.myjava.app
```

## 关于归档文件夹

由于本项目中的 JAVA 文件是分开的，为了节省性能，那些暂时不需要的 JAVA 文件被放置在 archive 文件夹中。

但如果您想要编译和运行，archive 文件夹中的 JAVA 文件可以执行以下命令：

```bash
cd archive && mv 你需要的Java文件.java ../src/main/java/com/myjava/app/ && cd .. && mvn compile && mvn package
```