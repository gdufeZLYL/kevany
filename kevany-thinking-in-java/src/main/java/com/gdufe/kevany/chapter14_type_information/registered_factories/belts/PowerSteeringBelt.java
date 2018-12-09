package com.gdufe.kevany.chapter14_type_information.registered_factories.belts;

/**
 * @author: kevanyzeng
 * @date: 2018/12/4 22:53
 * @description:
 */
public class PowerSteeringBelt extends Belt {
    public static class Factory
            implements
            com.gdufe.kevany.chapter14_type_information.registered_factories.factory.Factory<PowerSteeringBelt> {
        @Override
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
