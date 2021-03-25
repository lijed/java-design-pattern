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
 * @date 2021/3/14 20:44
 * Project Name: java-design-pattern
 */
public class CourseFactory {
    public ICourse createCourse(String courseName) {
//        if ("java".equals(courseName)) {
//            return new JavaCourse();
//        } else if ("ruby".equals(courseName)) {
//            return new RubyCourse();
//        }

        if (courseName != null) {
            try {
                return (ICourse) Class.forName(courseName).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }


    public ICourse createCourse(Class<? extends ICourse> clazz) {
//        if ("java".equals(courseName)) {
//            return new JavaCourse();
//        } else if ("ruby".equals(courseName)) {
//            return new RubyCourse();
//        }

        if (clazz != null) {
            try {
                return clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }


}
