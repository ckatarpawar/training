package com.java.example.dsa;

import java.util.Arrays;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] a = {2, 1, 5, 1, 3, 2};
        int k = 2;

        optimizeByChatGPT(a, k);

        int maxSum = 0;
        int[] maxsubArray = new int[k];


        for (int i = 0; i < a.length; i++) {

            int sum = 0;
            int m = 0;
            if ((i + k) < a.length) {
                int[] local = new int[k];
                for (int j = i; j < (i + k); j++) {
                    sum += a[j];
                    local[m++] = a[j];
                }
                if (maxSum <= sum) {
                    maxSum = sum;
                    maxsubArray = local;
                }
            }
        }
        System.out.println("Max sum of sub array of size " + k + " is: " + maxSum + " and sub array is: " + java.util.Arrays.toString(maxsubArray));
    }

    public static void optimizeByChatGPT(int[] arr, int k) {
        //int[] a = {2, 1, 5, 1, 3, 2};
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid k");
            return;
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        int startIdx = 0;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            if (windowSum >= maxSum) {
                maxSum = windowSum;
                startIdx = i - k + 1;
            }
        }

        int[] maxSubArray = Arrays.copyOfRange(arr, startIdx, startIdx + k);
        System.out.println("Max sum of subarray of size " + k + " is: " + maxSum +
                " and subarray is: " + Arrays.toString(maxSubArray));
    }
}
