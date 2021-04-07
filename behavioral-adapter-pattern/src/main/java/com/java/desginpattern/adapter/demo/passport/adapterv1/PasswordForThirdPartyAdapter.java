/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.adapter.demo.passport.adapterv1;

import com.java.desginpattern.adapter.demo.passport.PassportService;
import com.java.desginpattern.adapter.demo.passport.ResultMsg;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/25
 **/
public class PasswordForThirdPartyAdapter extends PassportService implements IPassportForThirdParty {

    @Override
    public ResultMsg loginForQQ(String openId) {
        return loginForRegist(openId, null);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return  loginForRegist(openId, null);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return  loginForRegist(token, null);
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return  loginForRegist(phone, null);
    }

    private ResultMsg loginForRegist(String username,String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
