/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.adapter.demo.passport.adapterv2;

import com.java.desginpattern.adapter.demo.passport.ResultMsg;
import com.java.desginpattern.adapter.demo.passport.adapterv2.adapters.ILoginAdapter;
import com.java.desginpattern.adapter.demo.passport.adapterv2.adapters.QQloginAdapter;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/25
 **/
public class PasswordForThirdPartyAdapter implements IPassportForThirdParty {

    @Override
    public ResultMsg loginForQQ(String openId) {
        return loginForRegist(openId, QQloginAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return loginForRegist(openId, null);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return loginForRegist(token, null);
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return loginForRegist(phone, null);
    }

    private ResultMsg loginForRegist(String username, Class<? extends ILoginAdapter> clazz) {
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(username, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
