/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/17
 **/
public class ReflectRest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        for (Constructor method : LazyStaticInnerClassSingleton.class.getDeclaredConstructors()) {
            System.out.println(method.getName());
        }
        Constructor method =  LazyStaticInnerClassSingleton.class.getDeclaredConstructor(null);
        method.setAccessible(true);
        Object instnce = method.newInstance();
        System.out.println(instnce.toString());
        instnce = method.newInstance();
        System.out.println(instnce.toString());
    }
}
