package com.wekkin.day04;
import java.util.Scanner;
/**
 *需求:
 *     1.根据程序员的工龄(整数)给程序员涨工资(整数),程序员的工龄和基本工资通过键盘录入
 *     2.涨工资的条件如下：
 *         [10-15)     +20000
 *         [5-10)      +10000
 *         [3~5)       +5000
 *         [1~3)       +3000
 *      3.运行程序:
 *          请输入作为程序员的你的工作的工龄:10
 *          请输入作为程序员的你的基本工资为:60000
 *          程序运行后打印格式
 *          	"您目前工作了10年，基本工资为 60000元, 应涨工资 20000元,涨后工资 80000元"
 * 实现步骤:
 *      1.创建键盘录入Scanner类的对象
 *      2.定义int类型变量years表示工龄,salary表示工资
 *      3.用户输入工龄和基本工资
 *      4.使用if方法判断涨工资数
 */
public class day04test02 {
    public static void main(String[] args) {

        //1.创建键盘录入Scanner类的对象
        Scanner sc = new Scanner(System.in);

        //2.定义int类型变量years表示工龄,salary表示工资,newsalary表示涨后工资
        int years, salary,newsalary;

        //3.用户输入工龄和基本工资
        System.out.println("请输入作为程序员的你的工作的工龄: ");
        years = sc.nextInt();
        System.out.println("请输入作为程序员的你的基工资为: ");
        salary =sc.nextInt();

        //4.使用if方法判断涨工资数
        if(years >= 10 && years < 15 ){
            newsalary = salary + 20000;
        }
        else {
            if(years >= 5 && years < 10 ){
                newsalary = salary + 10000;
            }
            else {
                if (years >= 3 && years < 5 ) {
                    newsalary = salary + 5000;
                }
                else {
                    if (years >= 1 && years < 3){
                        newsalary = salary + 3000;
                    }
                    else{
                        newsalary = salary + 0;
                    }
                }
            }
        }
        System.out.println("您目前工作了"+years+"年，基本工资为"+ salary+"元," +
                "应涨工资"+(newsalary-salary)+"元,涨后工资 "+newsalary+"元");

    }
}
