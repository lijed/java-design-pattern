/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.singleton.hungry;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author:Administrator Created: 2021/3/17
 **/
public class HungryStaticBlockSingleton {

    public static HungryStaticBlockSingleton instance = new HungryStaticBlockSingleton();

    private HungryStaticBlockSingleton(){}

    public static HungryStaticBlockSingleton getInstance() {
        return instance;
    }
}
