/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern;

/**
 * @author Administrator
 * @date 2021/3/14 20:46
 * Project Name: java-design-pattern
 */
public class RubyCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("Ruby");
    }
}
