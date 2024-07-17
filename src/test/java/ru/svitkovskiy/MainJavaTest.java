package ru.svitkovskiy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

public class MainJavaTest {
    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.arguments(List.of(1, 1, 2, 2, 3, 3), Map.of(1, 2, 2, 2, 3, 2)),
                Arguments.arguments(List.of('A', 1, 'D', 'D'), Map.of('A', 1, 1, 1, 'D', 2)),
                Arguments.arguments(Collections.emptyList(), Collections.emptyMap()),
                Arguments.arguments(null, Collections.emptyMap())
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testCountElements(List<?> list, Map<?, Integer> expectedMap) {
        Map<?, Integer> result = MainJava.countElements(list);
        Assertions.assertEquals(result, expectedMap);
    }

}
