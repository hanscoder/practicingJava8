package com.givval.practicing.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public List<String> names() {
        return Collections.unmodifiableList(names);
    }
}
