package com.java.example;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FourthExample {

    // 4) java8-Convert sentence to hashtag
    // Short sentences for initial hashtag conversion tests
    public static final List<String> HASHTAG_SENTENCES = Arrays.asList(
            "Hello world",
            "The quick brown fox",
            "AI and ML"
    );

    public static void main(String[] args) {
        HASHTAG_SENTENCES.stream().filter(Objects::nonNull)
                .map(sentence -> sentence.split(" "))
                .map(words -> Arrays.stream(words).map(word ->
                                Character.toUpperCase(word.charAt(0)) + word.substring(1)).collect(Collectors.joining()))
                .map("#"::concat)
                .toList().forEach(System.out::println);
    }
}
