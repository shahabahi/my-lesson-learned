package com.api.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MinValue {
    Map<Integer, Integer> mapOfValues;

    public static void main(String[] args) {
        MinValue minValue = new MinValue();
        minValue.min_value_hashmap_java8();
    }

    public void min_value_hashmap_java8() {
        mapOfValues = new HashMap<Integer, Integer>();
        mapOfValues.put(4, 11);
        mapOfValues.put(5, 1);
        mapOfValues.put(6, 24);
        mapOfValues.put(7, 1);
        mapOfValues.put(8, 1);
        Comparator<? super Map.Entry<Integer, Integer>> valueComparator = Comparator.comparing(Map.Entry::getValue);

        Optional<Map.Entry<Integer, Integer>> minValue = mapOfValues.entrySet()
                .stream().skip(4).min(valueComparator);

        System.out.println(minValue.get().getKey());
    }
}
