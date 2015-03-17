package com.givval.practicing.java8.lambda;

import java.util.Comparator;

public class Person {

    private final String firstname;
    private final String familyname;

    public Person(String aFirstname, String aFamilyname) {
        firstname = aFirstname;
        familyname = aFamilyname;
    }

    public boolean hasSameFirstname(Person aPerson) {
        Comparator<Person> compareSameName = new Comparator<Person>() {

            @Override
            public int compare(Person person1, Person person2) {
                return person1.firstname.compareTo(person2.firstname);
            }
        };

        return compareSameName.compare(this, aPerson) == 0;
    }
}
