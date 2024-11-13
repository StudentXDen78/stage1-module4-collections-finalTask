package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new LinkedHashMap<>();
        Set<String> keySet = sourceMap.keySet();
        Set<String> keySetResult = new LinkedHashSet<>();
        for (String e : keySet) {
            keySetResult.add(e);
            for (String s : keySet) {
                if (e.length() == s.length()) {
                    keySetResult.add(s);
                }
            }
            resultMap.put(e.length(), keySetResult);
            keySetResult.clear();
        }

        return resultMap;
    }

}
