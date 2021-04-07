/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.strategy.demo.payment;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * Project Name: java-design-pattern
 * @Author: Administrator
 * Created: 2021/3/31
 **/
public class IPaymentStrategy {

    public static final PAYMENT_PROCESSOR_ENUMS default_processor = PAYMENT_PROCESSOR_ENUMS.APLIPAY;
    private static Map<String, Payment> PAYMENT_PROCESSORS = new HashMap<String, Payment>();

    static {
        PAYMENT_PROCESSORS.put(PAYMENT_PROCESSOR_ENUMS.APLIPAY.name(), new Alipay(PAYMENT_PROCESSOR_ENUMS.APLIPAY.name()));
        PAYMENT_PROCESSORS.put(PAYMENT_PROCESSOR_ENUMS.UNIONPAY.name(), new UnionPayment(PAYMENT_PROCESSOR_ENUMS.UNIONPAY.name()));
    }

    public static Payment getPaymentProcessor(String processorName) {
        if (!PAYMENT_PROCESSORS.containsKey(processorName)) {
            return PAYMENT_PROCESSORS.get(default_processor.name());
        }
        return PAYMENT_PROCESSORS.get(processorName);
    }

    public enum PAYMENT_PROCESSOR_ENUMS {
        APLIPAY, UNIONPAY
    }
}
