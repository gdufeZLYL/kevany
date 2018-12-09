package com.gdufe.kevany.chapter14_type_information.registered_factories;

import com.gdufe.kevany.chapter14_type_information.registered_factories.belts.FanBelt;
import com.gdufe.kevany.chapter14_type_information.registered_factories.belts.GeneratorBelt;
import com.gdufe.kevany.chapter14_type_information.registered_factories.belts.PowerSteeringBelt;
import com.gdufe.kevany.chapter14_type_information.registered_factories.factory.Factory;
import com.gdufe.kevany.chapter14_type_information.registered_factories.filters.AirFilter;
import com.gdufe.kevany.chapter14_type_information.registered_factories.filters.CabinAirFilter;
import com.gdufe.kevany.chapter14_type_information.registered_factories.filters.FuelFilter;
import com.gdufe.kevany.chapter14_type_information.registered_factories.filters.OilFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: kevanyzeng
 * @date: 2018/12/3 23:06
 * @description:
 */
public class Part {

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories =
            new ArrayList<Factory<? extends Part>>();

    static {
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
    }

    private static Random rand = new Random(47);
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}
