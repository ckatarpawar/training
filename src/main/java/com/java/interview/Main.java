package com.java.interview;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Scanner;

@Slf4j
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = Integer.parseInt(input.nextLine());
        if(size<0){
            System.out.println("Invalid Array Size");
            System.exit(0);
        }
        System.out.println("Enter " + size + " numbers separated by space: ");
        String numbers = input.nextLine();
        if(numbers.split(" ").length!=size){
            System.out.println("Invalid Array elements entered, expected " + size + " numbers but got " + numbers.split(" ").length);
            System.exit(0);
        }
        if(Arrays.stream(numbers.split(" ")).allMatch(num -> num.matches("-?\\d+"))) {
            int product = 0;
            String[] numArray = numbers.split(" ");
            for (int i = 0; i < size; i++) {
                if(i==0){
                    product = Integer.parseInt(numArray[i]);
                }else {
                    product = product * Integer.parseInt(numArray[i]);
                }
            }
            System.out.println("Product: " + product);
        } else {
            System.out.println("Input must be numbers only...");
        }
    }
}
