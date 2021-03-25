package com.java.desginpattern.singleton.register;


import static org.junit.Assert.*;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/17
 **/
public class ContainerSingletonTest {
    public static void main(String[] args) {
        ContainerSingleton containerSingleton = new ContainerSingleton();

        Object object = containerSingleton.getInstatnce(Person.class.getName());
        System.out.println("object = " + object);

        object = containerSingleton.getInstatnce(Person.class.getName());
        System.out.println("object = " + object);

        Thread thread1 = new Thread(new Worker(containerSingleton));
        Thread thread2 = new Thread(new Worker(containerSingleton));
        thread1.start();
        thread2.start();
        System.out.println("start");
    }

}