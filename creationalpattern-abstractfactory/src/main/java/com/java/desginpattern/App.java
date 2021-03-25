package com.java.desginpattern;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        CourseFactory courseFactory =  new JavaCourseFactory();
        courseFactory.createNote().write();
        courseFactory.createVideo().record();
    }
}
