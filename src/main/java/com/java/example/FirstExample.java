package com.java.example;

import java.text.Normalizer;
import java.util.*;
import java.util.stream.Collectors;

public class FirstExample {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("Apple","ápple","banana","Banana","123start","_underscore","Álgebra","apple-pie","Äpp","βeta","Banana2");
        System.out.println("List "+letters);

        Map<Character, List<String>> groupedLetters = letters.stream().map(s -> Normalizer.normalize(s, Normalizer.Form.NFD)).collect(
                Collectors.groupingBy(s -> Character.toLowerCase(s.charAt(0)), LinkedHashMap::new, Collectors.toList()));
        System.out.println(groupedLetters);

        Map<Character, List<String>> groupedLetters1 = letters.stream().map(s -> Normalizer.normalize(s, Normalizer.Form.NFD)).collect(
                Collectors.groupingBy(s -> Character.toLowerCase(s.charAt(0)), LinkedHashMap::new, Collectors.mapping(s -> s, Collectors.toList())));
        System.out.println(groupedLetters1);
    }
}
