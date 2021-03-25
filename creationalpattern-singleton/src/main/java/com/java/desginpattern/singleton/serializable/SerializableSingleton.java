/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.singleton.serializable;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author:Administrator Created: 2021/3/17
 **/

import java.io.Serializable;

/***
 *  好处： 执行效率高
 *
 *  缺点： 内存浪费
 */
public class SerializableSingleton implements Serializable {

    public static SerializableSingleton instance ;

    static {
        instance = new SerializableSingleton();
    }

    private SerializableSingleton(){}

    public static SerializableSingleton getInstance() {
        return instance;
    }

//    private Object readResolve() {
//        return instance;
//    }
}
