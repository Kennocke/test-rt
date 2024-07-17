package ru.svitkovskiy;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainJava {
    public static <T> Map<T, Integer> countElements(List<T> list) {
        return list == null
                ? Collections.emptyMap()
                : list.stream().collect(Collectors.groupingBy(e -> e, Collectors.summingInt(e -> 1)));
    }
}
