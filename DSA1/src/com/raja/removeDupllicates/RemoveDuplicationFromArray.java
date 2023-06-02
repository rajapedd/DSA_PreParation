package com.raja.removeDupllicates;

import java.util.Arrays;

public class RemoveDuplicationFromArray {
    public static void main(String[] args) {
      //  int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums = {1,1,2};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        System.out.println(" Before Array ::" + Arrays.toString(nums));
        int uniqueCount = 0;
        int n = nums.length;
        int j = 0;
        int k = 1; // The First element is unique, So from the second element we will do the swap.
        // so it will start from index 1
        System.out.println(" Length ::" + n);
        while (j < n - 1) {
            //System.out.println(" nums[j]::" + nums[j]);
            //System.out.println(" nums[j]::" + nums[j + 1]);
            if (nums[j] != nums[j + 1]) {
                nums[k++] = nums[j + 1];

                uniqueCount++;
            }
            j++;
        }

        uniqueCount+=1; // zero index value also unique, so counting it as unique value.
        System.out.println("Array ::" + Arrays.toString(nums));
        System.out.println("uniqueCount ::" + uniqueCount);


        return uniqueCount;
    }
}
