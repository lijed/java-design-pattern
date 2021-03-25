/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.prototype.simple;

import lombok.Data;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/20
 **/
@Data
public class ConcretePrototype implements  IProtype {
    private String name;
    private int age;
    @Override
    public ConcretePrototype  clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setName(this.name);
        concretePrototype.setAge(this.age);
        return concretePrototype;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
