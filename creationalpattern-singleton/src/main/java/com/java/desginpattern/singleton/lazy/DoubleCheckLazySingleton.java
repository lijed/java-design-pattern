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
public class DoubleCheckLazySingleton {
    private static volatile DoubleCheckLazySingleton instance;

    private DoubleCheckLazySingleton() { }

    public static DoubleCheckLazySingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }
}
