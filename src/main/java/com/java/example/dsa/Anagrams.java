package com.java.example.dsa;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        if (s1.length() != s2.length()) {
            System.out.println("Strings are not anagrams");
            return;
        }
        arrayApproach(a1, a2);
        mapApproach(a1, a2);
    }

    public static void mapApproach(char[] a1, char[] a2) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a1.length; i++) {
            map.put(a1[i], map.getOrDefault(a1[i], 0) + 1);
            map.put(a2[i], map.getOrDefault(a2[i], 0) - 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                System.out.println("Strings are not anagrams");
                return;
            }
        }
        System.out.println("Strings are anagrams");
    }

    public static void arrayApproach(char[] a1, char[] a2) {
        int[] count = new int[26];

        for (int i = 0; i < a1.length; i++) {
            count[a1[i] - 'a']++;
            count[a2[i] - 'a']--;
        }

        for (int j : count) {
            if (j != 0) {
                System.out.println("Strings are not anagrams");
                return;
            }
        }
        System.out.println("Strings are anagrams");
    }
}
