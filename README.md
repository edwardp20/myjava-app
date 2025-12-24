# myjava-app
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
[![Java](https://img.shields.io/badge/Java-25-orange.svg)](https://openjdk.org/)
[![Gradle](https://img.shields.io/badge/Gradle-9.2.1-blue.svg)](https://www.gradle.org/)

[简体中文](./README_ZHCN.md)

## Overview
This is a small project I created while learning Java programming.

> **Note**: This is primarily a personal learning repository. The code here might be simplistic or experimental. Feel free to borrow any parts useful for your own learning.



>[!WARNING]
> This project uses GPLv3 license to distribute source code, please keep the software always free

> [!NOTE]
>
> The latest Release:
>
> **1.14.1**


## Requirements
- Java 25
- Gradle 9.2.1

## Usage
```bash
./gradlew shadowJar
```
## Features
- Basic Java syntax
- OOP examples
- Gradle configuration
- JUnit tests

## Main Class & Package name
### Main Class
Attention,The main class of this project is App.class.Normally, please do not move it out of the src folder.
### Package name
The package name for this project is com.myjava.app and com.myjava.tests
```java
package com.myjava.app
```
or
```java
package com.myjava.tests
```

## About archive fold
Because the JAVA files in this project are separate, in order to save performance, those JAVA files that are temporarily not needed are placed in the archive folder
But if you want to compile and run, the JAVA files in the archive folder can execute the following commands
```bash
cd archive && mv The-Java-file-you-need.java ../app/src/main/java/com/myjava/app/ && cd .. && mvn compile && mvn package
```
> [!CAUTION]
>
> This project is built by OpenJDK
>
