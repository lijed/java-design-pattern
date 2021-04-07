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
public class Alipay extends Payment {
    public Alipay(String processorName) {
        super(processorName);
    }

    @Override
    protected boolean doPayment(String uid, double amount) {
        return true;
    }

    @Override
    protected double getBlance(String uid) {
        return 500;
    }
}
