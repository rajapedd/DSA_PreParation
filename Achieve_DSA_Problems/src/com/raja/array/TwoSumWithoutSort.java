package com.raja.array;

import java.util.Arrays;
import java.util.HashMap;

//1. Two Sum
public class TwoSumWithoutSort {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        //  int[] nums = {3,2,3};
        // int target = 6;
        //  int[] nums = {3,3};
        // int target = 6;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
// It should rerutn 2 indexes
        int[] ar = new int[2];

        // O(n) is possible with only map for unsorted array
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int arrayValue = nums[i];
            int remainingVal = target - nums[i];
            System.out.println("remaining Val::" + remainingVal);
            if (map.containsKey(remainingVal)) {
                System.out.println("Test");
                ar[0] = map.get(remainingVal);
                ar[1] = i;
                break;
            }
            map.put(arrayValue, i);

        }

        System.out.println("Map Value::" + map.toString());
        System.out.println(Arrays.toString(ar));
        return ar;
    }
}
