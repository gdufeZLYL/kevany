package com.gdufe.kevany.chapter14_type_information.registered_factories.filters;

import com.gdufe.kevany.chapter14_type_information.registered_factories.factory.Factory;

/**
 * @author: kevanyzeng
 * @date: 2018/12/3 23:13
 * @description:
 */
public class AirFilter extends Filter {

    public static class Factory
            implements
            com.gdufe.kevany.chapter14_type_information.registered_factories.factory.Factory<AirFilter> {
        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
