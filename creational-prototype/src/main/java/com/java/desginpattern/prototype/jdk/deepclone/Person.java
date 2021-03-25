/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.prototype.jdk.deepclone;

import lombok.Data;

import java.io.*;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/20
 **/
@Data
public class Person implements Cloneable, Serializable {
    private String name;
    private Integer age;
    private Address address;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    @Override
    protected Person clone() throws CloneNotSupportedException {
        return deepClone();
    }

    private Person deepClone() {

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();

            byte[] data = bos.toByteArray();
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Person p1 = (Person) ois.readObject();

            oos.close();
            ois.close();
            return p1;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
