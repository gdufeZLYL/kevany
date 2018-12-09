package com.gdufe.kevany.chapter14_type_information.dynamic_proxies;

/**
 * @author: kevanyzeng
 * @date: 2018/12/8 23:51
 * @description:
 */
public class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}
