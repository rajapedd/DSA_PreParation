package com.raja.array;

import java.util.Arrays;
import java.util.HashMap;

//1. Two Sum
public class TwoSumWithSortedInput {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15,20,22};
        int target = 35;

       // int[] nums = {2, 7, 11, 15};
       // int target = 9;

        //  int[] nums = {3,2,3};
        // int target = 6;
         //int[] nums = {3,3};
         //int target = 6;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        // It should rerutn 2 indexes
        int[] ar = new int[2];

        // TC O(n), SC (1) is possible with Opposite direction Two pointer approach.
        int i=0;
        int sum=0;
        int j=nums.length-1;
        while(i<=j){
            sum=nums[i]+nums[j];
            if(sum<target){
                i++;
            }else if(sum>target){
                j--;
            }else{
                ar[0]=i;
                ar[1]=j;
                break;
            }

        }


        System.out.println(Arrays.toString(ar));
        return ar;
    }
}
