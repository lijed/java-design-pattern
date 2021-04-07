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
public abstract  class Payment {

    private String processorName;

    public Payment(String processorName) {
        this.processorName = processorName;
    }

    public MsgResult pay(String uid, double amount) {
        if (getBlance(uid) < amount) {
            return new MsgResult("500", "Balance is not less than paid mount");
        }
        
        boolean result = doPayment(uid, amount); 
        System.out.println("paid susccessfully");
        return new MsgResult("200", "success", "支付成功"+amount);
    }

    protected abstract boolean doPayment(String uid, double amount);

    protected abstract double getBlance(String uid) ;

    public String getProcessorName() {
        return processorName;
    }
}
