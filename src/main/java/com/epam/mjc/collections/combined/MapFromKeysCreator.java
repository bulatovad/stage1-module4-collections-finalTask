package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> keysWithLength = new HashMap<>();

        for(Map.Entry<String, Integer> entry: sourceMap.entrySet()) {
            String key = entry.getKey();
            int length = key.length();

            if(keysWithLength.containsKey(length)) {
                keysWithLength.get(length).add(key);
            } else {
                Set<String> s = new HashSet<>();
                s.add(key);
                keysWithLength.put(length, s);
            }
        }
        return keysWithLength;
    }
}
