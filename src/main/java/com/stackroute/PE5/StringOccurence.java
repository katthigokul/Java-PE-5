package com.stackroute.PE5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class StringOccurence {
    Map<String, Boolean> countOfOccurence(String[] arr) {
        Map<String, AtomicInteger> stringIntegerMap = new HashMap<>();
        for (String string : arr) {
            stringIntegerMap.putIfAbsent(string, new AtomicInteger(0));
            stringIntegerMap.get(string).getAndIncrement();
        }
        Map<String, Boolean> stringBooleanMap = new HashMap<>();
        stringIntegerMap.forEach((key, value) -> {
            if (value.intValue() >= 2) {
                stringBooleanMap.put(key, true);
            } else {
                stringBooleanMap.put(key, false);
            }
        });
        return stringBooleanMap;
    }
}
