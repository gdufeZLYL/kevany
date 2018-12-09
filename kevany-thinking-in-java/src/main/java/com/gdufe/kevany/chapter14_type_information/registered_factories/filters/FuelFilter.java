package com.gdufe.kevany.chapter14_type_information.registered_factories.filters;

/**
 * @author: kevanyzeng
 * @date: 2018/12/3 23:12
 * @description:
 */
public class FuelFilter extends Filter {

    public static class Factory
            implements
            com.gdufe.kevany.chapter14_type_information.registered_factories.factory.Factory<FuelFilter> {
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}
