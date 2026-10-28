package com.java.example;

import java.text.Normalizer;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;

public class SecondExample {
    public static void main(String[] args) {
        String sentence = "one three seven eleven sixteen fourtyninehundered";   // expected second-length words: "three","seven"

        System.out.println("Sentence:: " + sentence);

        Optional<Map.Entry<Integer, List<String>>> maxLenStrMap = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()))
                .entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).skip(0).findFirst();
        maxLenStrMap.ifPresentOrElse(entry ->
                System.out.println("First longest word: " + entry.getValue()+" with len: "+entry.getKey()), () -> System.out.println("No second longest word found"));
        Arrays.stream(sentence.split(" ")).sorted(Comparator.comparingInt(String::length).reversed()).skip(1).findFirst()
                .ifPresentOrElse(word -> System.out.println("Second longest word: " + word), () -> System.out.println("No second longest word found"));;
    }
}
