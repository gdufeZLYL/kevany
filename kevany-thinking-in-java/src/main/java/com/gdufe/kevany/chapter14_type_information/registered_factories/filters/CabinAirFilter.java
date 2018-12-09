package com.gdufe.kevany.chapter14_type_information.registered_factories.filters;

/**
 * @author: kevanyzeng
 * @date: 2018/12/3 23:14
 * @description:
 */
public class CabinAirFilter extends Filter {

    public static class Factory
            implements
            com.gdufe.kevany.chapter14_type_information.registered_factories.factory.Factory<CabinAirFilter> {
        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}
