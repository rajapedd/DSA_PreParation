package com.raja.OtherPrograms;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 4, 5 };
		removeDuplicates(arr);
	}

	public static int[] removeDuplicates(int[] arr) {
		int n=arr.length;
	int index =0;
	int[] uniqueArray= new int[n];
		for(int i=0; i<n;i++) {
			
			boolean isDuplicate=false;
			
			for(int j=i+1;j<n;j++) {
				
				if(arr[i]==arr[j]) {
					isDuplicate=true;
					break;
				}
				
			}
			
			if(!isDuplicate) {
				uniqueArray[index++]=arr[i];
			}
			
		}
		
		System.out.println("Copy elements::"+Arrays.copyOf(uniqueArray,index));
		System.out.println("Unique elements::"+Arrays.toString(uniqueArray));
		return new int[0];
	}

}
