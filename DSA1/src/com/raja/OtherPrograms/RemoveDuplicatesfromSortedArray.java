package com.raja.OtherPrograms;

public class RemoveDuplicatesfromSortedArray {

//	Given a sorted array nums, remove the duplicates in-place
//	such that each element appears only once and returns the new length.
//	Do not allocate extra space for another array; 
//     you must do this by modifying the input array in-place with O(1) extra memory.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 1, 2};
		removeDuplicates(nums);
	}

	
    public static int removeDuplicates(int[] nums) {
        //TODO
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++) {
        	if(nums[i] != nums[j+1]) {
        		j++;
        	}
         }
        
        System.out.println("count ::"+(j+1));
        	return j+1;	
    }
}
