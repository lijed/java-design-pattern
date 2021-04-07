/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.strategy.demo.payment;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/31
 **/
public class Test {
    public static void main(String[] args) {
        Order order = new Order(11111111, "jedli", 100);
        MsgResult msgResult = order.pay("ALIPAY");
        System.out.println(msgResult);

    }
}
