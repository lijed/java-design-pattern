/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.singleton.lazy;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/17
 **/
/**
 * classpath: LazyStaticInnerClassSingleton.class
 *      LazyStaticInnerClassSingleton$LazyHolder.class
 *
 *  优点： 写法优雅，利用了java本身的语法特点，性能高，避免了内存浪费
 *
 *  缺点： 能够被反射破坏
 *
 * */
public class LazyStaticInnerClassSingleton {
    private LazyStaticInnerClassSingleton() {}

    private static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private  static class  LazyHolder {
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
