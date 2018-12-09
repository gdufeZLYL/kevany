package com.gdufe.kevany.chapter14_type_information.null_objects;

/**
 * @author: kevanyzeng
 * @date: 2018/12/9 15:06
 * @description:
 */
public class Person {

    public final String first;
    public final String last;
    public final String address;

    // etc
    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person: " + first + " " + last + " " + address;
    }

    public static class NullPerson
            extends Person implements Null {
        private NullPerson() {
            super("None", "None", "None");
        }

        @Override
        public String toString() {
            return "NullPerson";
        }
    }

    public static final Person NULL = new NullPerson();
}
