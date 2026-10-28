package com.java.preparation;

import java.util.Arrays;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k=2;

        int windowSum=0;
        for(int i=0; i<k; i++){
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        int startIdx = 0;

        for(int i= k; i< arr.length; i++){
            windowSum+=arr[i] - arr[i-k];
            if(windowSum>maxSum){
                maxSum=windowSum;
                startIdx = i - k + 1;
            }
        }
        System.out.println("Max Sum: " + maxSum);
        int[] maxSumArr = Arrays.copyOfRange(arr, startIdx, startIdx + k);
        System.out.println("Max Sum SubArray: " + Arrays.toString(maxSumArr));
    }
}