package com.raja.RemoveElement;

import java.util.Arrays;

//Leet Code 27. Remove Element
public class RemoveElement {
    public static void main(String[] args) {
       int[]  nums = {0,1,2,2,3,0,4,2};
       int val = 2;
        //Output: 5, nums = [0,1,4,0,3,_,_,_]
        removeElementTrail(nums,val);
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
int n=nums.length;

        int left=0;
        int right=n;

        System.out.println("right:"+right);
       // int nonValueLength=n-k;
        int a=0;
        while(a<n){
            System.out.println("ums[a]:"+nums[a]);
            if(nums[a] ==val){
             nums[a]=Integer.MIN_VALUE;

             k++;
               right--;

//               if(nums[right]!=Integer.MIN_VALUE){
//                   nums[a]=Integer.MIN_VALUE;
//               }else{
//
//               }
            }
            else{
                nums[a]=nums[a];
              //  left++;
            }
            a++;
        }

        int i=0;
        int j=n-1;
//        for(int i=0;i<n;i++){
//
//            if(nums[i]==Integer.MIN_VALUE) {
//
//                if(nums[j]!=Integer.MIN_VALUE){
//                    nums[j]=Integer.MIN_VALUE;
//                }else{
//                    j--;
//                }
//
//            }
//
//        }

        System.out.println("Array:"+ Arrays.toString(nums));
        System.out.println("K value:"+k);
        return k;
    }



    public static int removeElementTrail(int[] nums, int val) {
        // Counter for keeping track of elements other than val
        int count = 0;
        // Loop through all the elements of the array
        for (int i = 0; i < nums.length; i++) {
            // If the element is not val
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        System.out.println("Array JJ:"+ Arrays.toString(nums));
        System.out.println("K value:"+count);
        return count;
    }
}
