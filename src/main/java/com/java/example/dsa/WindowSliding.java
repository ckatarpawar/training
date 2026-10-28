package com.java.example.dsa;

import java.util.Arrays;

public class WindowSliding {
    public static void main(String[] args) {
        int[] a = {5, 7, 2, 9, 4, 6};

        int k = 3;
        int[] results = new int[a.length];
        int result = 0;
        for(int i=0; i< a.length; i++){
            if(i >=k){
                result-=a[(i-k)];
            }

            result+=a[i];
            results[i] = result;
        }
        System.out.println("Result "+ Arrays.toString(results));
    }
}
