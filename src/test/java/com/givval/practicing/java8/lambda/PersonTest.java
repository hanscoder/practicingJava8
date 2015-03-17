package com.givval.practicing.java8.lambda;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Provide an implementation using Lambda.
 */
public class PersonTest {

    @Test
    public void should_have_same_name() {
        Person hansInVienna = new Person("Hans", "Towa");
        Person hansInGermany = new Person("Hans", "Bend");

        boolean isSameName = hansInVienna.hasSameFirstname(hansInGermany);

        assertThat(isSameName, is(equalTo(true)));
    }

    @Test
    public void should_have_different_name() {
        Person hansInVienna = new Person("Hans", "Towa");
        Person hansInGermany = new Person("Michi", "Bend");

        boolean isSameName = hansInVienna.hasSameFirstname(hansInGermany);

        assertThat(isSameName, is(equalTo(false)));
    }
}
