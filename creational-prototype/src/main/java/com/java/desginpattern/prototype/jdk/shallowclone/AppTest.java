/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.prototype.jdk.shallowclone;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/20
 **/
public class AppTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address();
        address.setAddress1("address1");
        Person p = new Person("Jed", 25);
        p.setAddress(address);
        Person p1 = p.clone();
        System.out.println("p==p1: "  + (p == p1));
        System.out.println(p.toString()  +  p.getClass());
        System.out.println(p1.toString()  +  p1.getClass());

        System.out.println(p);
        System.out.println(p1);

    }
}
