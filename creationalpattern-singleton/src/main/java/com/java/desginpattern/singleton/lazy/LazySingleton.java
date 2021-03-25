/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.singleton.lazy;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/17
 **/
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }


    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
