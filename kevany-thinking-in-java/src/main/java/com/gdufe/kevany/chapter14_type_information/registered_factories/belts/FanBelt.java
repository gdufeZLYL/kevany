package com.gdufe.kevany.chapter14_type_information.registered_factories.belts;

import com.gdufe.kevany.chapter14_type_information.registered_factories.Part;

/**
 * @author: kevanyzeng
 * @date: 2018/12/3 23:34
 * @description:
 */
public class FanBelt extends Belt {

    public static class Factory
            implements
            com.gdufe.kevany.chapter14_type_information.registered_factories.factory.Factory<FanBelt> {
        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}
