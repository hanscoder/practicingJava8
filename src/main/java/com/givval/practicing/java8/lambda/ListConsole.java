package com.givval.practicing.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class ListConsole {

    public final List<String> names = new ArrayList<>();

    public ListConsole(List<String> manyNames) {
        names.addAll(manyNames);
    }

    public void show() {
        throw new IllegalStateException("A nice lambda is needed");
    }
}
