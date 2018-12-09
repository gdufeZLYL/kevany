package com.gdufe.kevany.chapter14_type_information.dynamic_proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: kevanyzeng
 * @date: 2018/12/9 11:02
 * @description:
 */
public class MethodSelector implements InvocationHandler {

    private Object proxied;

    public MethodSelector(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("interesting")) {
            System.out.println("Proxy detected the interesting method");
        }
        return method.invoke(proxied, args);
    }
}
