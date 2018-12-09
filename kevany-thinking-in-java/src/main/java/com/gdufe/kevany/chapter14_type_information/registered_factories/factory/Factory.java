package com.gdufe.kevany.chapter14_type_information.registered_factories.factory;

/**
 * @author: kevanyzeng
 * @date: 2018/12/3 23:04
 * @description: 注册工厂
 */
public interface Factory<T> {
    T create();
}
