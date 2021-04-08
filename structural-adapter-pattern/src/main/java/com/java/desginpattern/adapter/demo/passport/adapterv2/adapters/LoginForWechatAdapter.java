package com.java.desginpattern.adapter.demo.passport.adapterv2.adapters;


import com.java.desginpattern.adapter.demo.passport.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForWechatAdapter extends AbstractAdapter{

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }


    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }


}
