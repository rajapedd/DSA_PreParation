package com.raja.RemoveElement;

import java.util.Arrays;

//Leet Code 27. Remove Element
// Equi Directional Two Pointer Technique
public class RemoveElement {
    public static void main(String[] args) {
       int[]  nums = {0,1,2,2,3,0,4,2};
       int val = 2;
        //Output: 5, nums = [0,1,4,0,3,_,_,_]
        removeElement(nums,val);
    }

    public static int removeElement(int[] nums, int val) {
        // Counter for keeping track of elements other than val
        int count = 0;

        int n=nums.length;
        int left=0;
        int right=0;
        int temp=0;
        for(int i=0;i<n;i++){
            if(nums[right]==val){
                right++;

            }else{
                count++;
                temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right++;
            }
        }


        System.out.println("Array JJ:"+ Arrays.toString(nums));
        System.out.println("K value:"+count);
        return count;
    }
}
