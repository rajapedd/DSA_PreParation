package com.raja.array;

import java.util.Arrays;
import java.util.HashMap;

//1. Two Sum
public class TwoSumWithAlgoExpProblem {

    public static void main(String[] args) {
        int[] array = {4, 6, 1};
        int target = 10;
        twoSum(array, target);
    }

    public static int[] twoSum(int[] array, int targetSum) {
        // Write your code here.


        int[] ar = new int[2];
        if (array.length == 0) {
            ar[0] = 0;
            ar[1] = 0;
            return ar;
        }
        int counter = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int val = targetSum - array[i];
            if (map.containsKey(val)) {
                ar[0] = array[map.get(val)];
                ar[1] = array[i];
                counter = 1;
                break;
            }
            map.put(array[i], i);
        }
        if (counter == 0) {
            return new int[0];
        }
        System.out.println("Array Values to Reach Target::"+Arrays.toString(ar));
        return ar;
    }
}
