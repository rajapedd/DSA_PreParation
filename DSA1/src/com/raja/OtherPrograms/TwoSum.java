package com.raja.OtherPrograms;

import java.util.*;


public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		twoSum(nums,target);
		twoSumWithOptimumSolution(nums,target);
	}
	
	
	
    public static int[] twoSum(int[] nums, int target) {
       	int n=nums.length;
    	int[] indices=new int[2];
    	int j=1;
    	for( int i=0;i<n;i++) {
    		if((nums[i]+nums[j])==target) {
    			System.out.println("Index aa::"+i);
    			System.out.println("Index bb::"+j);
    			indices[0]=i;
    			indices[1]=j;
    			break;
    		}
    		j++;
    		
    	}
    	System.out.println("Indexes ::"+Arrays.toString(indices));
    	
    	return indices;
}
    
    
public static int[] twoSumWithOptimumSolution(int[] nums, int target) {
		int[] indices=new int[2];
		Map<Integer, Integer> map= new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(target-nums[i])) {
				indices[0]=i;
				indices[1]=map.get(target-nums[i]);
				System.out.println("Optimum Solution ::"+Arrays.toString(indices));
				return indices;
			}else {
				map.put(nums[i], i);
			}
		}
		System.out.println("Optimum Solution ::"+Arrays.toString(indices));
		return indices;
	}
}
