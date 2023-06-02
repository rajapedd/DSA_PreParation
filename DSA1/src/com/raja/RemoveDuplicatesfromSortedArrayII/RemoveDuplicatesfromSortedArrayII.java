package com.raja.RemoveDuplicatesfromSortedArrayII;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};

        removeDuplicatesII(nums);
    }

    public static int removeDuplicatesII(int[] nums) {
        int count = 0;
        System.out.println("Before Array::" + Arrays.toString(nums));
        int n = nums.length;

        if (n < 3) {
            return n;
        }
        int j = 2;
        int k = 2;
//        while (j < n) {
//            System.out.println("Value Of I ::" + j);
//            System.out.println("Value Of k-2 ::" + (k - 2));
//            if (nums[j] != nums[k - 2]) {
//                nums[k++] = nums[j];
//                System.out.println("value k :::" + k);
//                System.out.println("Inside Array::" + Arrays.toString(nums));
//                count++;
//                System.out.println("Count :::"+count);
//            }
//            j++;
//        }

        for (int i = 2; i < n; i++) {
            System.out.println("Value Of I ::"+i);
            System.out.println("Value Of k-2 ::"+(k-2));
            if (nums[i] != nums[k - 2]) {
                nums[k++] = nums[i];
                System.out.println("value k :::"+k);
                System.out.println("Inside Array::" + Arrays.toString(nums));
                count++;
                System.out.println("Count :::"+count);
            }


        }
        count = count + 2;
        System.out.println("After Array::" + Arrays.toString(nums));
        System.out.println("Count::" + count);
        return count;
    }


}
