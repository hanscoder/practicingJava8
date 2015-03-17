package com.givval.practicing.java8.lambda;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsEqual.equalTo;

public class ListGodTest {

    private List<String> names = new ArrayList<>();

    @Before
    public void initNames() {
        names.add("Hans");
        names.add("Daniel");
        names.add("The");
        names.add("Lufi");
        names.add("Herbert");
    }

    @Test
    public void should_print_out_all_names_to_console() {
        ByteArrayOutputStream out = outputStream();

        new ListGod(names).toConsole();

        assertThat(out.toString(), equalTo("Hans\nDaniel\nThe\nLufi\nHerbert\n"));
    }

    @Test
    public void should_remove_given_problemmanager_from_the_list() {
        ListGod god = new ListGod(names);

        god.remove("Herbert");

        assertThat(god.names(), contains("Hans", "Daniel", "The", "Lufi"));
    }

    @Test
    public void should_remove_both_techleads_from_the_list() {
        ListGod god = new ListGod(names);

        god.removeBoth("Hans", "Daniel");

        assertThat(god.names(), contains("The", "Lufi", "Herbert"));
    }

    @Test
    public void should_replace_every_with_kaffee_which_starts_with_T() {
        ListGod god = new ListGod(names);

        god.replaceNamesStarting("T", "Kaffee");

        assertThat(god.names(), contains("Hans", "Daniel", "Kaffee", "Lufi", "Herbert"));
    }

    private ByteArrayOutputStream outputStream() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        return baos;
    }
}
