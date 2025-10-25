# myjava-app
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
[![Java](https://img.shields.io/badge/Java-25-orange.svg)](https://openjdk.org/)
[![Maven](https://img.shields.io/badge/Maven-3.9.11-blue.svg)](https://maven.apache.org/)

[简体中文](./README_ZHCN.md)

## Overview
This is a small project I created while learning Java programming.

> **Note**: This is primarily a personal learning repository. The code here might be simplistic or experimental. Feel free to borrow any parts useful for your own learning.



>**Attention**: This project uses GPLv3 license to distribute source code, please keep the software always free

> [!NOTE]
>
> The latest Release:
>
> **6**


## Requirements
- Java 25
- Maven 3.9.11

## Usage
```bash
# Compile
mvn compile

# Run main class
mvn exec:java -Dexec.mainClass="com.myjava.app.App"

# Package
mvn package

# Test
mvn test
```
## Features
- Basic Java syntax
- OOP examples
- Maven configuration
- JUnit tests

## Main Class & Package name
### Main Class
Attention,The main class of this project is App.class.Normally, please do not move it out of the src folder.
### Package name
The package name for this project is com.myjava.app
```java
package com.myjava.app
```

## About archive fold
Because the JAVA files in this project are separate, in order to save performance, those JAVA files that are temporarily not needed are placed in the archive folder
But if you want to compile and run, the JAVA files in the archive folder can execute the following commands
```bash
cd archive && mv The-Java-file-you-need.java ../src/main/java/com/myjava/app/ && cd .. && mvn compile && mvn package
```

