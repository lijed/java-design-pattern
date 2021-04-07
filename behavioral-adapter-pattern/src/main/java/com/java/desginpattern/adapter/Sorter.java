/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.adapter;

import org.apache.commons.lang.math.RandomUtils;

import java.util.BitSet;
import java.util.Random;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/29
 **/
public class Sorter {
    public static void main(String[] args) {
        long start =System.currentTimeMillis();
        BitSet bitSet = new BitSet();
        Random random = new Random(1000000);
        for (int i = 0; i < 1000000; i++) {
            final int l = random.nextInt(1000000);
            bitSet.set(l);
        }
        int size = 999999;
        int count = 0;
        BitSet bitSet1 = (BitSet) bitSet.clone();
        System.out.println(bitSet1.size());
        for (int i= bitSet.size() -1; ; i--) {
            if (bitSet.get(i)) {
                System.out.println(i);
                count ++;
            }
             if (count == 100) {
                 break;
             }
        }
        long end =System.currentTimeMillis();
        System.out.println((end-start) + "豪秒");
    }
}
