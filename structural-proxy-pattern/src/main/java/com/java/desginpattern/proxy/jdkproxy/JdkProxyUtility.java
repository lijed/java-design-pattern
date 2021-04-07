/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.java.desginpattern.proxy.jdkproxy;

import com.java.desginpattern.proxy.IPerson;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description:
 * Project Name: java-design-pattern
 *
 * @Author: Administrator
 * Created: 2021/3/21
 **/
public class JdkProxyUtility {
    public static void main(String[] args) {
        byte[] data=  ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class});
        try {
            FileOutputStream os = new FileOutputStream("D:\\$Proxy0.class");
            os.write(data);
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
