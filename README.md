
记录学习Java的过程
# JavaNote

## Day01_前言、入门程序、常量、进制

### 第一章 开发前言

#### 1.2 Java语言跨平台原理

JVM（Java Virtual Machine ）：Java虚拟机，简称JVM，是运行所有Java程序的假想计算机，是Java程序的运行环境，是Java 最具吸引力的特性之一。我们编写的Java代码，都运行在 JVM 之上。

JRE (Java Runtime Environment) ：是Java程序的运行时环境，包含 JVM 和运行时所需要的 核心类库 。

JDK (Java Development Kit)：是Java程序开发工具包，包含 JRE 和开发人员使用的工具。

**三者关系： JDK > JRE > JVM**

**问题1: Java 是如何实现跨平台的呢？**
**答：因为在不同操作系统中都安装了对应版本的 JVM 虚拟机**
**注意: Java程序想要运行, 必须依赖于JVM虚拟机.**
**问题2: JVM 本身是否允许跨平台呢？**
**答：不允许，允许跨平台的是 Java 程序，而不是虚拟机。**

### 第二章 Java语言开发环境搭建

#### 2.3 常用DOS命令

| 操作              | 说明                   |
| ----------------- | ---------------------- |
| 盘符名：          | 盘符切换               |
| dir               | 成查看当前路径下的内容 |
| cd 目录           | 进入单级目录           |
| cd 目录1\目录2... | 进入多级目录           |
| cd..              | 回退到上一级目录       |
| cd \              | 回退到盘符目录         |
| cls               | 清屏。                 |
| exit              | 退出命令提示符窗口。   |

### 第三章 HelloWorld入门程序

#### 3.1 程序开发步骤说明

**Java程序开发三步骤：编写、编译、运行**。

```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

```

**在DOS命令行中，进入Java源文件的目录，使用 javac 命令进行编译。**

**在DOS命令行中，进入Java源文件的目录，使用 java 命令进行运行。**

### 第四章 注释和关键字

#### 4.1 添加注释comment

单行注释以 `//开头 换行结束`

多行注释以 `/*开头 以*/结束`
文档注释（目前用不上，暂不深入讲解） `/** 注释信息 */`

#### 4.2 关键字keywords

**关键字：是指在程序中，Java已经定义好的单词，具有特殊含义。**
HelloWorld案例中，出现的关键字有 `public` 、 `class` 、 `static` 、 `void` 等，这些单词已经被
Java定义好，全部都是小写字母，notepad++中颜色特殊

### 第五章 常量

**常量：是指在Java程序中固定不变的数据**。

|            |                            |                 |
| ---------- | -------------------------- | --------------- |
| 整数常量   | 所有的整数                 | 0，1，594，-9   |
| 小数常量   | 所有的小数                 | 0.1，-0.5，2.66 |
| 字符常量   | 单引号，一个字符，有内容   | ‘A’ ,' ' ,'好'  |
| 字符串常量 | 双引号，可多字符，可无内容 | ”A“ ，”你好“    |
| 布尔常量   | 只有ture和false            | ture ,false     |
| 空常量     | 只有一个值                 | null            |

#### 5.3 练习

```java
public class ConstantDemo {
	public static void main(String[] args){
		//输出整数常量
		System.out.println(123);
        //输出小数常量
        System.out.println(0.125);
        //输出字符常量
        System.out.println('A');
        //输出布尔常量
        System.out.println(true);
        //输出字符串常量
        System.out.println("你好程序员");
	}
}

```

## 第六章 计算机中的进制与字节

#### 6.2 字节

字节是我们常见的计算机中最小存储单元。计算机存储任何的数据，都是以字节的形式存储，右键点击文件属
性，我们可以查看文件的字节大小。
8个bit（二进制位） 0000-0000表示为1个字节，写成1 byte或者1 B。
**8 bit = 1 B**
**1024 B =1 KB**
**1024 KB =1 MB**
**1024 MB =1 GB**
**1024 GB = 1 TB**	

