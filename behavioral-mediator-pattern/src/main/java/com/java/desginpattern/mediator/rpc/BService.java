package com.java.desginpattern.mediator.rpc;

/**
 * Created by Tom.
 */
public class BService implements IService{
    Registy registy;
    BService(){
        registy.regist("bService",this);
    }
}
