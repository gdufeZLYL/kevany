package com.gdufe.kevany.chapter14_type_information.null_objects;

/**
 * @author: kevanyzeng
 * @date: 2018/12/9 15:20
 * @description:
 */
public class Position {

    private String title;
    private Person person;

    public Position(String jobTitle, Person employee) {
        title = jobTitle;
        person = employee;
        if (person == null) {
            person = Person.NULL;
        }
    }

    public Position(String jobTitle) {
        title = jobTitle;
        person = Person.NULL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person newPerson) {
        person = newPerson;
        if (person == null) {
            person = Person.NULL;
        }
    }

    @Override
    public String toString() {
        return "Position: " + title + " " + person;
    }
}
