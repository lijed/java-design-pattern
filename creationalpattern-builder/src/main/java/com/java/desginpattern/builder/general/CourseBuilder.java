/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.builder.general;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/21
 **/
public class CourseBuilder implements IBuilder {
    private Course course = new Course();
    @Override
    public Course build() {
        return course;
    }

    public CourseBuilder name(String name) {
        course.name = name;
        return  this;
    }

    public CourseBuilder note(String note) {
        course.note = note;
        return this;
    }

    public CourseBuilder video(String video) {
        course.video = video;
        return this;
    }

    public CourseBuilder ppt(String ppt) {
        course.ppt = ppt;
        return this;
    }
}
