/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/17
 **/
public class ContainerSingleton {

    private  Map<String, Object> container = new ConcurrentHashMap<String, Object>();

    public  Object getInstatnce(String clazz) {
        Object singletonObject = container.get(clazz);
        if (singletonObject != null) {
            return singletonObject;
        }
        if (singletonObject == null) {
            synchronized (this.container) {
                singletonObject = container.get(clazz);
                if (singletonObject == null) {
                    try {
                        singletonObject = Class.forName(clazz).newInstance();
                        container.put(clazz, singletonObject);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return singletonObject;
    }
}
