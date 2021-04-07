/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.proxy.jdkproxy;

import com.java.desginpattern.proxy.IPerson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/21
 **/
public class Meipo implements InvocationHandler {

    private IPerson target;

    public Meipo() { }

    public  IPerson getInstance(IPerson iPerson) {
        this.target = iPerson;
        Class clazz = iPerson.getClass();
        return (IPerson) Proxy.newProxyInstance(iPerson.getClass().getClassLoader(),
                clazz.getInterfaces(), this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();

        Object result = method.invoke(this.target, args);

        postProcess();

        return result;
    }

    private void postProcess() {
        System.out.println("交往");
    }

    private void before() {
        System.out.println("准备资源");
    }
}
