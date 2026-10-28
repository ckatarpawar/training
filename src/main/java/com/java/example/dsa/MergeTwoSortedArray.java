package com.java.example.dsa;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 9, 15, 20, 49, 99, 102};
        int[] arr2 = {2, 3, 10, 12, 18, 33, 69, 89, 96};
        System.out.println("Len arr1:: " +arr1.length);
        System.out.println("Len arr2:: " +arr2.length);
        System.out.println("mergedArray: "+ Arrays.toString(mergedArray(arr1, arr2)));
    }

    public static int[] mergedArray(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int i= 0, j=0, k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                mergedArr[k++] = arr1[i++];
            }else{
                mergedArr[k++] = arr2[j++];
            }

            System.out.println("Loop 1:: m["+(k-1)+"] = "+mergedArr[(k-1)]+" k="+(k-1)+" i="+i+" j="+j);
        }
        while(i<arr1.length){
            mergedArr[k++] = arr1[i++];
            System.out.println("Loop 2:: m["+(k-1)+"] = "+mergedArr[(k-1)]+" k="+(k-1)+" i="+i+" j="+j);
        }
        while(j<arr2.length){
            mergedArr[k++] = arr2[j++];
            System.out.println("Loop 3:: m["+(k-1)+"] = "+mergedArr[(k-1)]+" k="+(k-1)+" i="+i+" j="+j);
        }
        return mergedArr;
    }
}
