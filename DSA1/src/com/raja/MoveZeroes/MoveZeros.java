package com.raja.MoveZeroes;

import java.util.Arrays;

//  Equi-Directional Two pointer Technique
public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        System.out.println("Before arrangement::" + Arrays.toString(nums));
        int n = nums.length;
        int left = 0;
        int right = 0;
        if (n == 1 || n == 0) {
            return;
        }
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (nums[right] == 0) {
                right++;
            } else {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;

            }

        }

        System.out.println("After arrangement::" + Arrays.toString(nums));

    }
}
