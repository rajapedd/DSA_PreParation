package com.raja.mergesort;

import java.util.Arrays;


// Devide and Conquire
public class Mergesort {
    public static void main(String[] args) {
        System.out.println("Practice Merge Sort1");

        System.out.println("Practice Merge Sort2");

        int arr[] = {12, 11, 13, 5, 6, 7};


        System.out.println("Given Array");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);

        System.out.println("\nTime Complexity: O(n logn)");

        System.out.println("\nAuxiliary Space: O(n)");


    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);

        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        // Find sizes of two subarrays to be merged
        int a1 = mid - low + 1;
        int a2 = high - mid;
        int L[] = new int[a1];
        int R[] = new int[a2];


        /* Create temp arrays */
        for (int i = 0; i < a1; i++) {
            L[i] = arr[low + i];
        }
        for (int j = 0; j < a2; j++) {
            R[j] = arr[j + mid + 1];
        }
        System.out.println("Array L:" + Arrays.toString(L));
        System.out.println("Array R:" + Arrays.toString(R));


        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays
        int m = 0, n = 0;
        // Initial index of merged subarray array
        int k = low;
        while (m < a1 && n < a2) {
            if (L[m] < R[n]) {
                arr[k] = L[m];
                m++;
            } else {
                arr[k] = R[n];
                n++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (m < a1) {
            arr[k] = L[m];
            k++;
            m++;

        }


        /* Copy remaining elements of R[] if any */

        while (n < a2) {
            arr[k] = R[n];
            k++;
            n++;

        }

        System.out.println("Array :" + Arrays.toString(arr));
    }


    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
