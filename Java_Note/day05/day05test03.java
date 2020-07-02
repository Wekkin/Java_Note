package com.wekkin.day05;

/**
 * 需求:
 * 	    1.打印所有四位数中 个位 + 千位 == 百位 + 十位 的数字
 *      2.最后要打印符合条件的数字的总数量
 *    	3.打印格式如下:
 * 	        1010
 *          1021
 *          1032
 *          1043
 *          ....
 *          以上满足条件的四位数总共有 615 个
 * 实现步骤:
 * 	    1.定义int变量count,用来计数,初始值0
 * 	    2.使用for循环获取所有的四位数字
 *      3.获取当前四位数字num的个位,十位,百位,千位,分别保存int到变量ge,shi,bai,qian中
 *      4.判断如果个位+千位等于十位+百位 说明该数字是符合条件的
 *      5.计数器count的值增加1
 *      6.打印该数字
 *      7.for循环结束后,打印count的值
 */
public class day05test03 {
    public static void main(String[] args) {
        //1.定义int变量count,用来计数,初始值0
        int count =0;
        //2.使用for循环获取所有的四位数字
        for (int num = 1000; num <= 9999;num++){
            //3.获取当前四位数字num的个位,十位,百位,千位,分别保存int到变量ge,shi,bai,qian中
            int ge, shi, bai, qian;
            //千位除以1000
            qian =num/1000%10;
            //百位除以100%10
            bai = num/100%10;
            //十位%100/10
            shi = num /10%10;
            //个位直接%10
            ge  = num%10;
            //4.判断如果个位+千位等于十位+百位 说明该数字是符合条件的
           if ((ge + qian)==(shi +bai)){
                System.out.println(num);
                //5.计数器count的值增加1
                count ++;
           }
        }
        //7.for循环结束后,打印count的值
        System.out.println("以上满足条件的四位数总共有 "+count+"个");
    }
}
