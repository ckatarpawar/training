package com.java.example;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class ThirdExample {

    // 3) java8-Filter out only the valid integers from a list of strings
    // Simple mix of valid and invalid integer strings

//    | **Test name** | **Input list** | **Expected output** |
//    | Simple mix | ``["42"," ``-7 ``","003","0","3.14","abc","+15"]`` | ``valid ``-> ``42; ``-7; ``3; ``0; ``15; ``invalid ``-> ``3.14; ``abc`` |
    public static final List<String> INTEGER_STRING_LIST = Arrays.asList(
            "42", " -7 ", "003", "0", "3.14", "abc", "+15"
    );
    public static void main(String[] args) {
        System.out.println("valid Number:"+ INTEGER_STRING_LIST.stream().filter(s -> isValidInt(s)).collect(Collectors.joining(",")));
    }

    private static boolean isValidInt(String s) {
        String digits = s.trim();
        if(digits.charAt(0) == '-' || digits.charAt(0) == '+') {
            digits = digits.substring(1);
        }
        return digits.chars().allMatch(Character::isDigit);
    }
}
