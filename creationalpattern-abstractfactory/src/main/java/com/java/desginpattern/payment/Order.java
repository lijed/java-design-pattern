/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.payment;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @date 2021/3/15 20:52
 * Project Name: java-design-pattern
 */
public class Order {
    private long orderId;
    private BigDecimal totalAmount;
    private BigDecimal balance;
}
