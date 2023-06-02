package com.raja.mergesort;

import java.util.Arrays;

public class LeetCodeMergeSortClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums1 = {1,2,3,0,0,0};
//		int m = 3; 
//				int[] nums2 = {2,5,6};
//		int n = 3;
		
		int[] nums1 = {0,0,0,0,0};
		int m = 0; 
				int[] nums2 = {1,2,3,4,5};
		int n = 5;
		merge(nums1, m, nums2, n);
	}
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
			if (m == 0 && n == 1) {
				nums1[0] = nums2[0];
				return;
			} else if (m == 1 && n == 0) {
				nums1[0] = nums1[0];
				return;
			}
		
				System.out.println("Total Length of Array ::"+(m+n));
				System.out.println("nums1 Array ::"+Arrays.toString(nums1));
				int low = 0;
				int high = m + n;
				
				int[] aux = new int[high];

				int a1 = m;
				int a2 = n;
				int[] L = new int[a1];
				int[] R = new int[a2];
				for (int i = 0; i < a1; i++) {
					L[i] = nums1[i];
				}
				System.out.println("L Array ::"+Arrays.toString(L));
				for (int j = 0; j < a2; j++) {
					R[j] = nums2[j];
				}
				int k = 0;
				System.out.println("R Array ::"+Arrays.toString(R));
				int i = 0;
				int j = 0;
				while (i < a1 && j < a2) {

					if (L[i] < R[j]) {
						aux[k] = L[i];
						i++;

					} else {
						aux[k] = R[j];
						j++;
					}
					k++;

				}

				while (i < a1) {
					aux[k] = L[i];
					i++;
					k++;

				}

				while (j < a2) {
					aux[k] = R[j];
					j++;
					k++;

				}
				
			
				for (int t = 0; t < aux.length; t++) {
					nums1[t] = aux[t];
				}
				System.out.println("Final Array ::"+Arrays.toString(nums1));

			
		}

}
