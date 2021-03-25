package com.java.desginpattern.singleton.serializable;


import com.sun.corba.se.impl.orbutil.ObjectWriter;
import org.junit.runner.RunWith;

import java.io.*;

import static org.junit.Assert.*;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/17
 **/

public class SerializableSingletonTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableSingleton singleton = SerializableSingleton.getInstance();
        System.out.println("singleton: "  + singleton.toString());
        FileOutputStream fos = new FileOutputStream("SerializableSingleton.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(singleton);
        oos.flush();
        oos.close();
        fos.close();


        FileInputStream fis = new FileInputStream(new File("SerializableSingleton.tmp"));
        ObjectInputStream ois = new ObjectInputStream(fis);
        SerializableSingleton singleton1 = (SerializableSingleton) ois.readObject();
        System.out.println("singleton1 = " + singleton1.toString());
        System.out.println("singleton == singleton1: " + (singleton == singleton1));
    }

}
