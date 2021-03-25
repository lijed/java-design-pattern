/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.prototype.jdk.shallowclone.arraylist;

import com.java.desginpattern.prototype.jdk.deepclone.Address;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Project Name: java-design-pattern
 * @Author: Administrator
 * Created: 2021/3/20
 **/

/*
* java arraylist 还是浅拷贝
* */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Address> list = new ArrayList<>(10);
        for (int i = 0; i < 3; i++) {
            Address address = new Address();
            address.setAddress1("addr" + i);
            list.add(address);
        }

        ArrayList<Address> list1 = (ArrayList) list.clone();
        list1.get(0).setAddress2("address2");

        System.out.println(list);
        System.out.println(list1);


    }
}
