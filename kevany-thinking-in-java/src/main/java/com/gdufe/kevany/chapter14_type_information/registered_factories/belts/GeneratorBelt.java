package com.gdufe.kevany.chapter14_type_information.registered_factories.belts;

/**
 * @author: kevanyzeng
 * @date: 2018/12/3 23:36
 * @description:
 */
public class GeneratorBelt extends Belt {

    public static class Factory
            implements
            com.gdufe.kevany.chapter14_type_information.registered_factories.factory.Factory<GeneratorBelt> {
        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}
