/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.adapter.demo.passport.adapterv2;

import java.security.InvalidParameterException;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/25
 **/
public class Test {
    public static void main(String[] args) {
        IPassportForThirdParty passportForThirdParty = new PasswordForThirdPartyAdapter();
        passportForThirdParty.loginForQQ("1111111111111111");
    }
}
