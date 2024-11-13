package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public static Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new TreeMap<>();
        Set<String> keySet = sourceMap.keySet();

        for (String e : keySet) {
            Set<String> keySetResult = new LinkedHashSet<>();
            if (resultMap.containsKey(e.length())) continue;
            for (String s : keySet) {
                if (e.length() == s.length()) {
                    keySetResult.add(s);
                }
            }
            resultMap.put(e.length(), keySetResult);
        }

        return resultMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> timetable = new LinkedHashMap<>();
        timetable.put("one", 1);
        timetable.put("two", 2);
        timetable.put("three", 3);
        timetable.put("five", 4);
        timetable.put("ten", 10);

        createMap(timetable);
    }

}
