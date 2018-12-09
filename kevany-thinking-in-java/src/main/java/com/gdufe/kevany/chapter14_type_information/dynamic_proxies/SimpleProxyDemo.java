package com.gdufe.kevany.chapter14_type_information.dynamic_proxies;

/**
 * @author: kevanyzeng
 * @date: 2018/12/9 9:51
 * @description:
 */
public class SimpleProxyDemo {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
