package com.givval.practicing.java8.lambda;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.core.IsEqual.equalTo;

public class ListGodTest {

    @Test
    public void should_print_out_all_names_to_console() {
        ByteArrayOutputStream out = outputStream();

        List<String> names = new ArrayList<>();
        names.add("Hans");
        names.add("Daniel");
        names.add("The");
        names.add("Lufi");
        names.add("Herbert");

        new ListGod(names).toConsole();

        assertThat(out.toString(), equalTo("Hans\nDaniel\nThe\nLufi\nHerbert\n"));
    }

    @Test
    public void should_remove_given_problemmanager_from_test_list() {
        List<String> names = new ArrayList<>();
        names.add("Hans");
        names.add("Daniel");
        names.add("The");
        names.add("Lufi");
        names.add("Herbert");

        ListGod god = new ListGod(names);
        god.remove("Herbert");

        assertThat(god.names(), contains("Hans", "Daniel", "The", "Lufi"));
    }

    private ByteArrayOutputStream outputStream() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        return baos;
    }
}
