package com.gdufe.kevany.chapter14_type_information.dynamic_proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: kevanyzeng
 * @date: 2018/12/9 10:11
 * @description:
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass()
                + ", method: " + method + ", args: " + args);
        if (args != null) {
            for (Object arg : args) {
                System.out.println(" " + arg);
            }
        }
        return method.invoke(proxied, args);
    }
}
