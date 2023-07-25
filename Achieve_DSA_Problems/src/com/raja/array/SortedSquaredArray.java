package com.raja.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {
        //   int[] array={1, -2, 3, 5, 6, 8, -9};
        int[] array = {-10, -5, 0, 5, 10};
      //  sortedSquaredArray(array); // This will take O(nlogn), Not suits for good TC.
        sortedSquaredArrayWithOptimal(array); // This is best and Optimal Approach with TC and SC as  O(n)
    }

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        if (array.length == 0) {
            return new int[]{};
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        // Arrays.sort(array);
        System.out.println("Squared Array :: " + Arrays.toString(array));
        return array;
    }

    public static int[] sortedSquaredArrayWithOptimal(int[] array) {
        int n = array.length;
        int[] ar = new int[n];
        int start = 0, end = n - 1, counter = 0;
        while (start <= end) {
            int squareVal=0;
            if (Math.abs(array[start])>Math.abs(array[end])) {
                squareVal=array[start]*array[start];
                start++;
            }else{
                squareVal=array[end]*array[end];
                end--;
            }
            ar[n-1-counter]=squareVal;
            counter++;

        }
        System.out.println("Array Values Squared :: "+ Arrays.toString(ar));
        return ar;

    }

}
