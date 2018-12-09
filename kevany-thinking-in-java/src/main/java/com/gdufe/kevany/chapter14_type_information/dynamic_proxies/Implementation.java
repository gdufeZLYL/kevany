package com.gdufe.kevany.chapter14_type_information.dynamic_proxies;

/**
 * @author: kevanyzeng
 * @date: 2018/12/9 13:43
 * @description:
 */
public class Implementation implements SomeMethods {
    @Override
    public void boring1() {
        System.out.println("boring1");
    }

    @Override
    public void boring2() {
        System.out.println("boring2");
    }

    @Override
    public void interesting(String arg) {
        System.out.println("interesting " + arg);
    }

    @Override
    public void boring3() {
        System.out.println("boring3");
    }
}
