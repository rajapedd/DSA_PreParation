package com.raja.OtherPrograms;

import java.util.Arrays;

public class FindMiddleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Ganesh Prasannah");
     int[] myArray = {1, 2};
     middle(myArray);
	}
	
	
	
    public static int[] middle(int[]  array) {
    	
        int n=array.length;
        if(n<=2){
        	//System.out.println("Print Current Array ::"+Arrays.toString(array));
        	
        	return new int[0];
        	
        }
        int[] arr = new int[n-2];
        
     int index=1;
     while(index < array.length-1) {
    	 arr[index-1]=array[index];
    	 index++;
     }
     System.out.println("Print new Array ::"+Arrays.toString(arr));
        return arr;
    }

}
