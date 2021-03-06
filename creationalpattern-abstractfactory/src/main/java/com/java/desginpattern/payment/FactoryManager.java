/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.payment;

import sun.plugin2.ipc.IPCFactory;

/**
 * @author Administrator
 * @date 2021/3/15 21:15
 * Project Name: java-design-pattern
 */
public class FactoryManager {
    public static IPaymentFactory instantiate(Class<? extends  IPaymentFactory> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
