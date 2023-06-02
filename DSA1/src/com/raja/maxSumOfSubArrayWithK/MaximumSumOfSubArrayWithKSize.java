package com.raja.maxSumOfSubArrayWithK;


public class MaximumSumOfSubArrayWithKSize {

    public static void main(String[] args) {
        int[] A={2,1,5,1,3,2};
        int k=3;
        getMaxSum(A,k);
    }
    public static int getMaxSum(int A[],int k){
        int windowSum=0;
        int maxSum = 0;
        int start=0;
        int end=0;


        while(end<k){
            windowSum +=A[end++];
        }
        System.out.println("windowSum::"+windowSum);
        while(end<A.length){
            windowSum += A[end++]-A[start++];
            maxSum=Math.max(maxSum,windowSum);
        }
        System.out.println("maxSum::"+maxSum);
        return maxSum;
    }
}
