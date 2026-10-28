package com.java.example.dsa;

import java.util.Arrays;

public class MoveZeroToEnd {

    public static void main(String[] args) {
        int[] a = new int[]{0,1,0,3,12};

        int t=0;
        for(int i=0; i<a.length; i++){
            if (a[i]!=0) {
                a[t++] = a[i];
            }
        }
        while(t<a.length){
            a[t++] =  0;
        }

        System.out.println(Arrays.toString(a));
    }
}
