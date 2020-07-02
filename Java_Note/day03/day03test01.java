/*
题目：
    某外卖商家的菜品单价如下:
    1.鱼香肉丝每份24元,油炸花生米每份8元,米饭每份3元。
    2.优惠方式:
        总金额大于100元,总金额打9.5折,其它无折扣
    3.需求:
        小明购买了3分鱼香肉丝,3份花生米,5份米饭,最终需要付多少钱?
 */

package com.wekkin.day03;

public class day03test01 {
    public static void main(String[] args) {
        //定义3个int变量fish，nut，rice并分别对其进行赋值24，8，3；
        int fish = 24,nut = 8,rice = 3;

        //计算小明购买物品总价格price
        int price = (fish*3)+(nut*3)+(rice*5);

        //判断总价是否小于100
        if( price <= 100) {
            System.out.println("小明购买了3分鱼香肉丝,3份花生米,5份米饭,最终需要付" + price+"元");
        }
        else {
            double newPrice = price * 0.95;
            System.out.println("小明购买了3分鱼香肉丝,3份花生米,5份米饭,最终需要付" + newPrice+"元");
        }
    }
}
