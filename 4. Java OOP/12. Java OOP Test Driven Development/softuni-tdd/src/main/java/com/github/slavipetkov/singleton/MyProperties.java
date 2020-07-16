package com.github.slavipetkov.singleton;

import java.util.HashMap;
import java.util.Map;

public class MyProperties {

    private final Map<String, String> props;

    private MyProperties() {
        props = new HashMap<>();
        props.put("font", "22");
    }

    public String getProperty(String propertyName) {
        return props.get(propertyName);
    }

    private static class LazyHolder {
        static final MyProperties INSTANCE = new MyProperties();
    }

    public static MyProperties getInstance() {
        return LazyHolder.INSTANCE;
    }
}



















