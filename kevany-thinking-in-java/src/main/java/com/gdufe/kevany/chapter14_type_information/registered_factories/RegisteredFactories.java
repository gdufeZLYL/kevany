package com.gdufe.kevany.chapter14_type_information.registered_factories;

/**
 * @author: kevanyzeng
 * @date: 2018/12/4 22:55
 * @description:
 */
public class RegisteredFactories {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }
}
