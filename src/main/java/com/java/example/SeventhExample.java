package com.java.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SeventhExample {


    // 6) java8-Find the second highest length in a given sentence of words (repeat)
    // Another simple set focused on streaming-friendly input
    public static final List<String> SECOND_HIGHEST_STREAM = Arrays.asList(
            "one two three four five",
            "red blue green yellow"
    );

    public static void main(String[] args) {
        IntStream.range(0, SECOND_HIGHEST_STREAM.size()).forEach(
                (idx) -> {
                    String sentence = SECOND_HIGHEST_STREAM.get(idx);
                    TreeMap<Integer, List<String>> countWithWordMap = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
                    Optional<Map.Entry<Integer, List<String>>> secondHighestLengthString = countWithWordMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).skip(1).findFirst();
                    secondHighestLengthString.ifPresentOrElse(entry ->
                            System.out.println((idx+1)+": Second highest length word(s): " + entry.getValue() + " with length: " + entry.getKey()), () -> System.out.println("No second highest length word found"));
                });
    }
}
