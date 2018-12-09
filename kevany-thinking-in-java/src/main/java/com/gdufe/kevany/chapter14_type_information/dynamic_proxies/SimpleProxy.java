package com.gdufe.kevany.chapter14_type_information.dynamic_proxies;

/**
 * @author: kevanyzeng
 * @date: 2018/12/9 9:48
 * @description: 简单直接代理
 */
public class SimpleProxy implements Interface {

    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}
