package com.java.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class FifthExample {


    // 5) java8-Find duplicate elements
    // Small list with clear duplicates and case variation
    public static final List<String> DUPLICATE_ELEMENTS = Arrays.asList(
            "apple", "banana", "apple", "cherry", "banana"
    );

    public static void main(String[] args) {
        Map<String, Long> wordsCountMap = DUPLICATE_ELEMENTS.stream().collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
        wordsCountMap.forEach((word, count) -> System.out.println("Word "+word+" appears "+count+" times"));
    }
}
