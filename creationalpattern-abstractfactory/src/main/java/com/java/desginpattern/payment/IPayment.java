/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.payment;

/**
 * @author Administrator
 * @date 2021/3/15 20:50
 * Project Name: java-design-pattern
 */
public interface IPayment {

    public void pay(Order order);

    public void refund(Order order);
}

