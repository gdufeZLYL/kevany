package com.gdufe.kevany.chapter14_type_information.registered_factories.filters;

/**
 * @author: kevanyzeng
 * @date: 2018/12/3 23:15
 * @description:
 */
public class OilFilter extends Filter {
    public static class Factory
            implements
            com.gdufe.kevany.chapter14_type_information.registered_factories.factory.Factory<OilFilter> {

        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}
