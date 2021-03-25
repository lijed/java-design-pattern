package com.java.desginpattern;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       CourseFactoryI javaCourseFactory = new JavaCourseFactory();
       ICourse  javaCourse = javaCourseFactory.createCourse();
       javaCourse.record();
    }
}
