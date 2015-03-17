package com.givval.practicing.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class ListGod {

    public final List<String> names = new ArrayList<>();

    public ListGod(List<String> manyNames) {
        names.addAll(manyNames);
    }

    public void toConsole() {
        throw new IllegalStateException("A nice lambda is needed");
    }

    public void remove(String aName) {
        throw new IllegalStateException("A nice bul operation using lambda is needed.");
    }

    public void removeBoth(String name1, String name2) {
        throw new IllegalStateException("A nice bul operation using lambda is needed.");
    }

    private void remove(Predicate<String> logic) {
        names.removeIf(logic);
    }

    public List<String> names() {
        return Collections.unmodifiableList(names);
    }
}
