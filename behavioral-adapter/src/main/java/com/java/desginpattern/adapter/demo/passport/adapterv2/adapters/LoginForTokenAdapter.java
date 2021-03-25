package com.java.desginpattern.adapter.demo.passport.adapterv2.adapters;


import com.java.desginpattern.adapter.demo.passport.ResultMsg;

/**
 *
 *
 */
public class LoginForTokenAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }
    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }

}
