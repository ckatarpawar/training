package com.java.example.dsa;

import java.util.Arrays;

public class SwapCharacter {
    public static void main(String[] args) {
       char[] a = new char[]{'h','e','l','l','o'};
       int left = 0, right = a.length-1;
       while(left<right){
           char temp = a[left];
           a[left] = a[right];
           a[right] = temp;
           left++;
           right--;
       }
        System.out.println("Result "+ Arrays.toString(a));
    }
}
