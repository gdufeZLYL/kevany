package com.gdufe.kevany.chapter14_type_information.dynamic_proxies;

import java.lang.reflect.Proxy;

/**
 * @author: kevanyzeng
 * @date: 2018/12/9 13:54
 * @description:
 */
public class SelectingMethods {

    public static void main(String[] args) {
        SomeMethods proxy = (SomeMethods) Proxy.newProxyInstance(
                SomeMethods.class.getClassLoader(),
                new Class[]{SomeMethods.class },
                new MethodSelector(new Implementation())
        );
        proxy.boring1();
        proxy.boring2();
        proxy.interesting("bonobo");
        proxy.boring3();
    }
}
