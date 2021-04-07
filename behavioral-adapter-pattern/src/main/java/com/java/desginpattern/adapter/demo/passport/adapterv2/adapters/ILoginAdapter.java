/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.adapter.demo.passport.adapterv2.adapters;

import com.java.desginpattern.adapter.demo.passport.ResultMsg;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/25
 **/
public interface ILoginAdapter {

    public boolean support(Object adapter);

    public ResultMsg login(String id, Object adapter);
}
