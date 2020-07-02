package com.wekkin.day03;
import java.util.Scanner;
/**
 * 题目:小李同学在学习了Scanner之后想要使用Java完成一个简易的计算器,
 *      在控制台输出两个整数之后输出两个整数的和,差,积,商,应该如何实现呢?(不考虑小数部分)
 * 实现：​1.创建Scanner对象.
 * ​	    2.提示输入数字并且使用变量保存.
 * ​	    3.计算两个整数的和,差,积,商保存到对应的变量中
 * ​     4.打印结果
 */
public class day03test02 {
    public static void main(String[] args) {
        //1.创建Scanner对象.
        Scanner scan = new Scanner(System.in);

        //2.提示输入数字并且使用变量保存.
        System.out.println("请输入一个整数：");
        int i = scan.nextInt();
        System.out.println("请再输入一个整数：");
        int y = scan.nextInt();

        //3.计算两个整数的和,差,积,商保存到对应的变量中
        int he = i + y, cha = i - y, ji = i * y, shang = i / y;

        //4.打印结果
        System.out.println("两数之和为："+he);
        System.out.println("两数之差为："+cha);
        System.out.println("两数之积为："+ji);
        System.out.println("两数之商为："+shang);
    }
}
