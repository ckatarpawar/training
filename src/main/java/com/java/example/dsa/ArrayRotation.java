package com.java.example.dsa;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6};
        int k = 3;
        k = k % a.length;

        reverse(a, 0, a.length-1);
        System.out.println("1: Reverse "+Arrays.toString(a));
        reverse(a, 0, k-1);
        System.out.println("2: Reverse "+Arrays.toString(a));
        reverse(a, k, a.length-1);
        System.out.println("Reverse array "+ Arrays.toString(a));
    }

    // Helper method to reverse a subarray
    private static void reverse(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}
