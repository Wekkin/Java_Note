/**
 * 需求:
 * 	1.功能描述：模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果
 * 	2.要求：
 * 		(1)键盘录入三个整数,其中前两个整数代表参加运算的数据，
 * 			第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)
 * 		(2)使用今天所学知识完成功能
 * 		(3)演示格式如下1:
 * 			请输入第一个整数:30
 * 			请输入第二个整数:40
 * 			请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):0
 * 			控制台输出:70
 *
 *             演示格式如下2:
 * 			请输入第一个整数:30
 * 			请输入第二个整数:40
 * 			请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):-
 * 			控制台输出:-10
 * 实现步骤:
 *      1.创建键盘录入Scanner类的对象
 *      2.int类型变量a，b，num
 *      3.从用户键盘获取选择
 *      4.switch判断并打印结果
 */

package com.wekkin.day04;
import  java.util.Scanner;

public class day04test03 {
    public static void main(String[] args) {

        //1.创建键盘录入Scanner类的对象
        Scanner sc = new Scanner(System.in);

        //2.int类型变量a，b，num
        int a, b, num;

        //3.从用户键盘获取选择
        System.out.println("请输入第一个整数: ");
        a = sc.nextInt();
        System.out.println("请输入第二个整数: ");
        b = sc.nextInt();
        System.out.println("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):");
        num =sc.nextInt();

        //4.switch判断并打印结果
        switch (num){
            case 0:
                System.out.println(a+b);
                break;
            case 1:
                System.out.println(a-b);
                break;
            case 2:
                System.out.println(a*b);
                break;
            case 3:
                System.out.println(a/b);
                break;
            default:
                System.out.println("你输入的数字错误！");
                break;
        }
    }
}
