package com.wekkin.day03;

/**	题目：
 *      红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
 *      绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。那么红茶和绿茶现在的钱一样多，请问对么？
 *      请编写程序进行判断
 **实现：
 * ​    	1.定义红茶妹妹原来的钱为整数变量
 * ​	    2.定义绿茶妹妹原来的钱为整数变量
 * ​	    3.使用赋值运算符和算术运算符计算其现有的钱
 * ​	    4.使用比较运算符对数值做出比较
 */
public class day03test03 {
    public static void main(String[] args) {
        //1.定义红茶妹妹原来的钱为整数变量,2.定义绿茶妹妹原来的钱为整数变量
        int hong = 21, lv = 24;

        //3.使用赋值运算符和算术运算符计算其现有的钱
        hong = hong*2 + 3;
        lv = lv*2;

        //3.使用三元运算符计算hong和lv的值是否相同,保存到boolean变量result中
        boolean result = (hong == lv) ? true : false;
        //4.0打印result的值
        System.out.println("几天后红茶妹妹和绿茶妹妹现在的钱一样多,对吗? "+result);

        //4.1if方法判断
        if( hong == lv ) {
            System.out.println("红茶妹妹和绿茶妹妹现在的钱一样多");
        }
        else {
            System.out.println("红茶妹妹和绿茶妹妹现在的钱不一样多");
        }
    }
}
