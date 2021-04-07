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
 * @Author: Administrator
 * Created: 2021/3/31
 **/
public class Order {

    private int orderId;
    private String userId;
    private double totalAmount;

    public Order(int orderId, String userId, double totalAmount) {
        this.orderId = orderId;
        this.userId = userId;
        this.totalAmount = totalAmount;
    }

    public MsgResult pay() {
       return pay(IPaymentStrategy.default_processor.name());
    }

    public MsgResult pay(String paymentProcessorName) {
        final Payment paymentProcessor = IPaymentStrategy.getPaymentProcessor(paymentProcessorName);
        System.out.println("欢迎使用" + paymentProcessor.getProcessorName());
        System.out.println("本次交易金额为" + this.totalAmount + "，开始扣款");
        return paymentProcessor.pay(this.userId, this.totalAmount);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
