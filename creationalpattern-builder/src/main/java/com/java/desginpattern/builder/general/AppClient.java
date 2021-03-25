/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.builder.general;

import javax.swing.plaf.IconUIResource;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/21
 **/
public class AppClient {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseBuilder();
        Course course = courseBuilder.name("java").note("java note").video("java video").build();
        System.out.println("course = " + course);
    }
}
