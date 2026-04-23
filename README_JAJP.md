# myjava-app
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
[![Java](https://img.shields.io/badge/Java-26-orange.svg)](https://openjdk.org/)
[![Gradle](https://img.shields.io/badge/Gradle-9.4.0-blue.svg)](https://www.gradle.org/)
[![CI](https://github.com/edwardp20/myjava-app/actions/workflows/Build-and-test.yaml/badge.svg)](https://github.com/edwardp20/myjava-app/actions/workflows/Build-and-test.yaml/)

[简体中文](./README_ZHCN.md)
[français](./README_FRFR.md)

## 概要
これは、Javaプログラミングを学習中に作成した小さなプロジェクトです。

> **注意**: これは主に個人的な学習用リポジトリです。ここにあるコードは単純であったり実験的であったりする可能性があります。自分の学習に役立つ部分は自由に借用してください。

> [!TIP]
> プロジェクトの古いバージョン（<=1.14.1）をビルドしたい場合は、
> Mavenを使用してください。

>[!WARNING]
> このプロジェクトはソースコードを配布するためにGPLv3ライセンスを使用しています。ソフトウェアは常にフリーに保ってください。

> [!NOTE]
>
> 最新リリース:
>
> **1.15**


## 要件
- Java 26
- Gradle 9.4.0

## 使用方法
```bash
# パッケージ化
./gradlew shadowJar
# コンパイル
./gradlew compileJava
```
## 特徴
- 基本的なJava構文
- OOPの例
- Gradleの設定
- JUnitテスト

## メインクラスとパッケージ名
### メインクラス
注意: このプロジェクトのメインクラスはApp.classです。通常はsrcフォルダの外に移動しないでください。
### パッケージ名
このプロジェクトのパッケージ名は com.myjava.app および com.myjava.tests です。
```java
package com.myjava.app
```
または
```java
package com.myjava.tests
```

## アーカイブフォルダについて
このプロジェクトのJAVAファイルは分離されているため、パフォーマンスを節約するために、一時的に必要のないJAVAファイルはアーカイブフォルダに配置しています。
しかし、コンパイルして実行したい場合は、アーカイブフォルダ内のJAVAファイルに対して以下のコマンドを実行できます。
```bash
cd archive && mv The-Java-file-you-need.java ../app/src/main/java/com/myjava/app/ && cd .. && ./gradlew compileJava && ./gradlew shadowJar
```

## このプロジェクトの実行可能ファイルを入手するには？

1.  自分でビルドする
2.  https://github.com/edwardp20/myjava-app/releases/ にアクセスする
3.  https://github.com/edwardp20/myjava-app/actions/ にアクセスする
> [!CAUTION]
>
> このプロジェクトはOpenJDKによってビルドされています。
>