/**
 *  需求:
 *      让用户依次录入三个整数，求出三个数中的最大值，并打印到控制台。【使用if】
 * 实现步骤:
 *      1.使用Scanner类用于录入用户输入的整数
 *      2.定义int变量a,b,c用于存储用户输入的值
 *      3.使用if-else嵌套分别比较a，b，c两两之间的大小
 *      4.打印输出
 */

package com.wekkin.day04;
import java.util.Scanner;

public class day04test01 {
    public static void main(String[] args) {

        //1.使用Scanner包用于录入用户输入的整数
        Scanner sca = new Scanner(System.in);

        //2.定义int变量a,b,c用于存储用户输入的值
        int a, b, c;
        System.out.println("输入三个整数数字寻找其中的最大值");
        System.out.println("请输入第一个整数数字: ");
        a = sca.nextInt();
        System.out.println("请输入第二个整数数字: ");
        b = sca.nextInt();
        System.out.println("请输入第三个整数数字: ");
        c = sca.nextInt();

        //3.使用if-else嵌套分别比较a，b，c两两之间的大小，4.打印输出
        if (a > b){
            if (a > c){
                //a>b且a>c
                System.out.println(a+"是三个数中的最大值");
            }else{
                //a>b但a<c
                System.out.println(c+"是三个数中的最大值");
            }
        }else{
            if(b > c){
                //a<b且b>c
                System.out.println(b+"是三个数中的最大值");
            }else{
                //a<b但b<c
                System.out.println(c+"是三个数中的最大值");
            }
        }
    }
}
