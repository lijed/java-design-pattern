/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.strategy.demo.payment;

import java.util.concurrent.TimeoutException;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/31
 **/
public class UnionPayment extends Payment {
    public UnionPayment(String processorName) {
        super(processorName);
    }

    @Override
    protected boolean doPayment(String uid, double amount) {
        System.out.println("UnionPayment process");
        return false;
    }

    @Override
    protected double getBlance(String uid) {
        return 200;
    }
}
