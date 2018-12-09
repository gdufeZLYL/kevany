package com.gdufe.kevany.chapter14_type_information.dynamic_proxies;

import java.lang.reflect.Proxy;

/**
 * @author: kevanyzeng
 * @date: 2018/12/9 10:22
 * @description:
 */
public class SimpleDynamicProxy {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        // Insert a proxy and call again
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[] {Interface.class },
                new DynamicProxyHandler(real)
        );
        consumer(proxy);
    }
}
