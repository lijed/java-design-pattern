/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.prototype.simple;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/20
 **/
public class AppTest {
    public static void main(String[] args) {
        ConcretePrototype iProtype = new ConcretePrototype();
        iProtype.setAge(13);
        iProtype.setName("jed");

        IProtype iProtype1 = iProtype.clone();

        System.out.println(iProtype == iProtype1);
    }
}
